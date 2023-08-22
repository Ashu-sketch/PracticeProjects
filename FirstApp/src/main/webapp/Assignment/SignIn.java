package com.trialproject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SignIn extends HttpServlet{

	//if we want to execute our task we need to use parameterized service method 
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
//		
//		String uname=req.getParameter("name");
//				String upass=req.getParameter("password");
//				PrintWriter out=res.getWriter();
//				out.println(out);
		int a=0	;
try {
	a=Integer.parseInt(req.getParameter("num1"));
	
} catch (NumberFormatException e) {
	e.printStackTrace();
}
		
int b = 0;
try {
	b=Integer.parseInt(req.getParameter("num2"));		
		} catch (NumberFormatException e) {
		e.printStackTrace();
		}
		
		int k=a+b;
		
		//httpSession 
				//HttpSession session=req.getSession();
				//session.setAttribute("k", k);
				
				
				
//req.setAttribute("k", k); //key , value pair concept
//	//RequestDispatcher to call the another servlet
//		RequestDispatcher rd=req.getRequestDispatcher("square");
//		rd.forward(req, res);
	

		
		//res.sendRedirect("square?k="+ k);//url rewriting
		
		Cookie cookie=new Cookie("k", k+ "");
		res.addCookie(cookie);
				res.sendRedirect("square");
		
		
	
	
		
		
		
	}
}
