package com.hibernate.HiberNateDemotelusko;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyConnection {

	public static void main(String[] args) throws ClassNotFoundException {
		
		
		try {
			
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		Connection con=DriverManager.getConnection("jdbc:sqlserver://DESKTOP-LL02VCO; databaseName=dummy;integratedSecurity=true; encrypt=true;", "Ashu","LoveSQL123@");
		System.out.println("successfull");
		
		
		
		Statement stmt=con.createStatement();  
		ResultSet rs=stmt.executeQuery("select * from employee");  
		while(rs.next())  
		System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+" "+ rs.getString(4)+ " "+ rs.getString(5));  
		
//		PreparedStatement pstPreparedStatement=con.prepareStatement("insert into  employee (empId, empAddress, empDes, LasttName, firstName, empSalary ) values(?,?,?,?,?,?)");
//		pstPreparedStatement.setString(1, "109");
//		pstPreparedStatement.setString(2, "jaipur");
//		pstPreparedStatement.setString(3, "Senior Developer");
//		pstPreparedStatement.setString(4, "Shekhawat");
//		pstPreparedStatement.setString(5, "Ashwin");
//		pstPreparedStatement.setString(6, "890000");
//		
//		pstPreparedStatement.executeUpdate();
		con.close();  
		
		
			
		} catch (SQLException sQLException) {
			System.out.println(sQLException);
		}
//		try{  
//			Class.forName("com.mysql.jdbc.Driver");  
//			Connection con=DriverManager.getConnection(  
//			"jdbc:mysql://localhost:3306/sonoo","root","root");  
//			//here sonoo is database name, root is username and password  
//			Statement stmt=con.createStatement();  
//			ResultSet rs=stmt.executeQuery("select * from emp");  
//			while(rs.next())  
//			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
//			con.close();  
//			}catch(Exception e){ System.out.println(e);}  

	}

}

