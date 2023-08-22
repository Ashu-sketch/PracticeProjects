package com.jdbcPrograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnectionWithMysql {
	   static final String DB_URL = "jdbc:sqlserver://DESKTOP-LL02VCOS; databaseName=db_calorie;integratedSecurity=true; encrypt=false;";
	   static final String USER = "root";
	   static final String PASS = "123456789";
	   static final String QUERY = "SELECT id, first, last, age FROM Employees";
	   	
    
	   public static void main(String[] args){
	      
		   try {

			   Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			   Connection conn = DriverManager.getConnection(DB_URL);
			   System.out.println("success");
			
		} catch (Exception e) {
			e.printStackTrace();
		}	
		   
		   
		   
		   
	     
	   }
	}