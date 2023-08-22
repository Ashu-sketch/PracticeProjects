package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnection {

public static Connection createConnection() throws ClassNotFoundException {
	Connection con=null;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection(  
				"jdbc:mysql://localhost:3306/dummy","root","LoveSql@123");  
		System.out.println("success");
		con.close();
		
		
	} catch (SQLException e) {
		System.out.println(e);
		e.printStackTrace();
	}
	return con;
	
}

public static void main(String args[]) throws ClassNotFoundException {
	createConnection();
//	System.err.println("Hello");
//	
//	try {
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		
//		Connection con=DriverManager.getConnection(  
//				"jdbc:mysql://localhost:3306/dummy","root","LoveSql@123");  
//		System.out.println("success");
//		
//		
//	} catch (Exception e) {
//		e.printStackTrace();
//	}
//	

}

}