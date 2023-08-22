package com.ashudeveloper.registeration;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Contact
 */
@WebServlet("/Contact")
public class Contact extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws 
	ServletException, IOException {
		String uname= request.getParameter("name");
		String umail= request.getParameter("email");
		String upass= request.getParameter("pass");
		String umobile= request.getParameter("contact");
		RequestDispatcher dispatcher=null;
		Connection con=null;
		
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/signup?useSSL=false", "root","123456789");
//			PreparedStatement pst=con.prepareStatement("select * from users where umail = ? and upass= ?");
//			pst.setString(1, umail);
//			pst.setString(2, upass);
//			ResultSet rs=pst.executeQuery();  //resultSet is a interface
//			if(rs.next()) {
//				session.setAttribute("name", rs.getString("uname"));
//				dispatcher=request.getRequestDispatcher("index.jsp");
//				
//			}else {
//				request.setAttribute("status","failed");
//				dispatcher=request.getRequestDispatcher("login.jsp");
//			}
//			dispatcher.forward(request, response);
//			
//		} catch (Exception e) {
//		e.printStackTrace(); //handle exception
//		}
		
		
		
	}

	
	

}
