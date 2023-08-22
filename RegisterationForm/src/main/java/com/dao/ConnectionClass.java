package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionClass {
public static Connection createConnection() throws ClassNotFoundException {
	Connection con = null;
	try {
	     Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dummy","root","LoveSql@123");
		System.out.println("connection Succesful");
	} catch (SQLException e) {
		// TODO: handle exception
	}
	return con;
}

}
