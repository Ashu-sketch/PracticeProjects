package com.registerfrom.index.signin;

import java.beans.Statement;
import java.io.IOException;
import java.io.PrintWriter;
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
 * Servlet implementation class signup
 */
@WebServlet("/signup")
public class signup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int c_day =java.time.LocalDate.now().getDayOfMonth();
		int c_month=java.time.LocalDate.now().getMonthValue();
		int c_year=java.time.LocalDate.now().getYear();
		
		String age;
		
		
		
		
		
		PrintWriter out=response.getWriter();
		out.println("hello");
		
		String ffname=request.getParameter("fname");
		String llgname=request.getParameter("lname");
		String ggender=request.getParameter("gender");
		String ppsw=request.getParameter("psw");
		String eemail=request.getParameter("email");
		String DOB=request.getParameter("DOB");
		
		
//		int day=Integer.parseInt(request.getParameter("day"));
//		int month=Integer.parseInt(request.getParameter("month"));
//		int year=Integer.parseInt(request.getParameter("year"));
		
		
		
		//age calculation
		
		

//		if(c_day>=day && c_month>=month && c_year>=year) {
//			day=c_day-day;
//			month=c_month-month;
//			year=c_year-year;
//			age=day+" day "+ month+ " month "+year+" year ";
//		}else {
//            //find days
//				day=(c_day+30)-day;
//				c_month--;
//				c_month+=day/30;
//				day=day%30;
//				
//				//find months
//				month=(c_month+12)-month;
//				c_year--;
//				c_year+=month/12;
//				month=month%12;
//				
//				//find year 
//				year=c_year-year;
//				
//				age=day+" day "+ month+ " month "+year+" year ";
//				
//			}
//		
//		RegisterDao registerDao=new RegisterDao();
//		registerDao.setFname(ffname);
//		registerDao.setLname(llgname);
		
		
		
		
	request.setAttribute("FirstName", ffname);
		request.setAttribute("LastName", llgname);
		request.setAttribute("YourGender", ggender);
		request.setAttribute("YourPsw", ppsw);
		request.setAttribute("YourMail", eemail);
		
//		request.setAttribute("Day", day);
//		request.setAttribute("Month", month);
//		request.setAttribute("Year", year);
//		request.setAttribute("Age", age);
		
		
		
		
		//
		String url="jdbc:sqlserver://sqlexpress;database=registerationform";
		String pass="123456789";
		String user="root";
		
		String query="insert into users(firstname,lastname,gender,email, psw, dob) values(?,?,?,?,?,?) "  ;
		
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		Connection	con=DriverManager.getConnection(url, user, pass);
		 PreparedStatement pst=con.prepareStatement(query);
		 
	        
	       ResultSet rs= st.executeQuery(query);
	     
	       
	       rs.next();
		
		try {
			
			
			
			
		} catch (Exception e) {
			
		}
		
		
		
		RequestDispatcher rd=request.getRequestDispatcher("Welcome.jsp");
		rd.forward(request, response);
		
		
		
		
	}

}
