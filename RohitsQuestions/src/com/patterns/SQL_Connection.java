package com.patterns;




import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.*;

public class SQL_Connection {
	
	//instance variable of Connection type to store connection
	static Connection con;
	
	public static void main(String args[]) {
		try {
			//load the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//create connection
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dummy?allowPublicKeyRetrieval=true&useSSL=false ", "root","123456789");
			
			System.out.println("success");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
//	public static Connection createC() {
//		try {
//			//load the Driver
//			Class.forName("com.mysql.cj.jdbc.Driver");
//				
//			//create connection
//			
//			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dummy?useSSL=false", "root","123456789");
//			
//			System.out.println("success");
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		 return con;


}
