package com.trialproject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Square extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		int k=0;
		
				try {
					
				//	k=(int) req.getAttribute("k");
					//k=Integer.parseInt(req.getParameter("k"));
					
					//HttpSession session=req.getSession(); //need to give refernece or declare it
				//	k=(int)session.getAttribute("k");
					
					//have to fetch cookie here
				Cookie[] cookies=	req.getCookies();
			
			for(Cookie c:cookies) {
				if(c.getName().equals("k"));
				k=Integer.parseInt(c.getValue());
			}
					
					} catch (Exception  e) {
					e.printStackTrace();
				}
				k=k*k;
				PrintWriter out=res.getWriter();
				out.println("Square of the added number s are: "+ k);
				System.out.println("Hey Maa durga");
	}

}
