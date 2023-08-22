


package com.ashudeveloper.registeration;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.xdevapi.Statement;

/**
 * Servlet implementation class RegisterationServlet
 */
@WebServlet("/register")
public class RegisterationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String uname= request.getParameter("name");
		String upass= request.getParameter("pass");
		String umail= request.getParameter("email");
		String umobile= request.getParameter("contact");
		
		
			
		RequestDispatcher dispatcher=null;
		Connection con=null;
		
//		PrintWriter out =response.getWriter();	
//		out.print(uname);
//		out.print(umail);
//		out.print(upass);
//		out.print(umobile);
		
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/signup?useSSL=false", "root","123456789");
			 PreparedStatement pst=con.prepareStatement("insert into users(uname,upass,umail,umobile) values(?,?,?,?) ");
			 
			  pst.setString(1, uname);
			 pst.setString(2, upass);
			 pst.setString(3, umail);
			 pst.setString(4, umobile);
			 
			 int rowCount= pst.executeUpdate();
			dispatcher=request.getRequestDispatcher("registration.jsp");
		    if(rowCount>0) {
				request.setAttribute("status", "success");
			}
			else {
				request.setAttribute("status", "failed");
			}
		    dispatcher.forward(request, response);
         }
		
		
		catch (Exception e) {
        	 e.printStackTrace();
      }finally {
    	  try {
			con.close();
		} 
    	  
    	  catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}


}
