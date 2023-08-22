package CrudOperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;



public class EmployeeDao {
 
 
 public static Connection createConnection() {
	 Connection con=null;
	 ResultSet rs=null;
	 Statement st=null;
	 
	 try {
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dummy?allowPublicKeyRetrieval=true&useSSL=false", "root","One2Three123@");
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	 return con;
 }
 
 //insert method
 public void insertUser(Employee emp) {
	 
	try {
		Connection con=createConnection();
		String q="insert into Employee (eName, DesigNation,eSalary) values(?,?,?)";
		PreparedStatement pst=con.prepareStatement(q);
		pst.setString(1, emp.geteName());
		pst.setString(2, emp.getDesigNation());
		pst.setFloat(3, emp.geteSalary());
		
		pst.executeUpdate();
		pst.close();
		con.close();
		
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	 
 }
 public void updateUser(Employee emp) {
	 
 }
 public void selectUser(int eId) {
	 try {
		Connection con=createConnection();
		String q="select eId, eName, DesigNation,eSalary from Employee where eId=?";
		PreparedStatement ps=con.prepareStatement(q);
		ps.setInt(1, eId);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			int id=rs.getInt("eId");
			String eName=rs.getString("eName");
			String DesigNation=rs.getString("DesigNation");
			float eSalary=rs.getFloat("eSalary");
			Employee emp=new Employee(eId, eName, DesigNation, eSalary);
			
		}
		
		
	} catch (Exception e) {
		// TODO: handle exception
	}
 }
}
