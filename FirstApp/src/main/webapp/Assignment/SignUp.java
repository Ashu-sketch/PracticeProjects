package com.signup.welcome.signin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SignUp
 */
@WebServlet("/SignUp")
public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
//    /**
//     * @see HttpServlet#HttpServlet()
//     */
//    public SignUp() {
//        super();
//        // TODO Auto-generated constructor stub
//    }
//
//	/**
//	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}
//
//	/**
//	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
//	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		
		PrintWriter out =response.getWriter();
		String firtsName=request.getParameter("firstname");
		String lastName= request.getParameter("lastname");
	
		String mail= request.getParameter("email");
		String mobile= request.getParameter("phone");
		String address= request.getParameter("address");
		String psw= request.getParameter("psw");
		String repsw= request.getParameter("psw-repeat");
		String condition=request.getParameter("condition");
		
		//out.println("<h2>Here Is your Info</h2>");
		//out.println("<h2>Name:" + firtsName+ "</h2>");
		
//		if(condition.equals("checked")) {
//			out.println("<h2>Name:" + firtsName+ "</h2>");
//		}
//			else {
//				out.println("<h2>Here Is your Info</h2>");
//			}
		
		
		
		
		if(condition.equals("checked")) {
			out.println("<h2>Name:" + firtsName+ "</h2>");
		
			
		}		
		}
		
		//RequestDispatcher dispatcher=request.getRequestDispatcher("Welcome.jsp");
		
		//request.setAttribute("status", "success");
		//response.sendRedirect("Welcome");

	

}
