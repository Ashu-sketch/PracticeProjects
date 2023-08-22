package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.model.Employee;

public class ConnectionDao {
Connection con;
PreparedStatement pst;
Statement st;
ResultSet rs;
String query;
 public int  registerEmpoyee(Employee emplyee)throws ClassNotFoundException {
	 query="insert into employee(EmployeeName,EmplooyeeEmail,emppass) values(?,?,?)";
	 int result=0;
	 try {
		con=ConnectionClass.createConnection();
		pst=con.prepareStatement(query);
		pst.setString(1, emplyee.getEmployeeName());
		pst.setString(2, emplyee.getEmplooyeeEmail());
		pst.setString(3, emplyee.getEmppass());
		result=pst.executeUpdate();
	} catch (SQLException e) {
		System.out.println(e.getMessage());
	}
	return  result; 
	
 }
}
