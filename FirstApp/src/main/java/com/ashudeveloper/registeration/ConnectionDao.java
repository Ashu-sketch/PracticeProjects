package com.ashudeveloper.registeration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;

public class ConnectionDao {
	 Connection conn;
	private  String url="jdbc:mysql://localhost:/signup";
	private  String user="root" ; 
	private String password="123456789";
	private String dbDriver="com.mysql.cj.jdbc.Driver";
	public void loadDriver(String dbDriver) {
		 try {
			Class.forName(dbDriver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Connection  getConnection() {
		Connection con=null;
		
		try {
			con=DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
		
		
		
	public String insert(BookingMember member) {
		loadDriver(dbDriver);
		
		Connection con=getConnection();
		String result=" Your Booking is successful";
		//String q="insert into booking(name,phone,adults,children) values(?,?,?,?) ";
		
		String q="insert into booking(name,phone,checkin,checkoout,adults,children) values(?,?,?,?,?,?) ";
		try {
			PreparedStatement pst=con.prepareStatement(q);
			pst.setString(1, member.getName());
			pst.setString(2, member.getPhone());
			pst.setString(3,member.getCheckIn());
			pst.setString(4, member.getCheckOut());
			pst.setString(5, member.getAdults());
			pst.setString(6, member.getChild());
			//int row=pst.executeUpdate();
			  int rowCount= pst.executeUpdate();
				
	         
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result="data can not entered";
			
		}
		return result;
	}

}
