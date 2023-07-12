import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Check {

	public static void main(String[] args) {
		
		try {
			//add driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//open a connection
			Connection  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dummy?allowPublicKeyRetrieval=true&useSSL=false ", "root","One2Three123@");
			String k="select * from user";
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(k);
			
			while(rs.next()) {
				System.out.println(rs.getInt("id"));
				System.out.println(rs.getString("name"));
				System.out.println(rs.getInt("age"));
			}
			System.out.println("success");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
