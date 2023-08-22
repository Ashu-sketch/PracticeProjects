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
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class booking
 */
@WebServlet("/booking")
public class booking extends HttpServlet {
	private static final long serialVersionUID = 1L;
       @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
    	   
    	   
    	  
		String name= request.getParameter("name");
		String phone= request.getParameter("phone");
		String checkin=request.getParameter("checkIn");
		String checkoout= request.getParameter("checkOut");
		String adults= request.getParameter("adults");
		String children= request.getParameter("child");
		BookingMember member=new BookingMember(name, phone, checkin, checkoout, adults, children);
		
	
		ConnectionDao rdao=new ConnectionDao();
		String result=rdao.insert(member);
		System.out.println("");
		response.getWriter().print(result);	
		
		
		
		
		response.setContentType("text/html");
	    PrintWriter out = response.getWriter();
	    out.println("<html><body bgcolor='cyan'>");
	    request.getRequestDispatcher("Result.jsp").include(request, response);
	    System.out.print("</body></html>");
	    out.close();
	
		

		}

}
