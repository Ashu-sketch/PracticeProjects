<%@ page import="java.sql.*"%>

<%
String uId= request.getParameter("Id");
		String uname= request.getParameter("name");
		String umobile= request.getParameter("phone");
		String ucheckIn=request.getParameter("checkIn");
		String ucheckOut= request.getParameter("checkOut");
		String uadults= request.getParameter("adults");
		String uchild= request.getParameter("child");
		
		try {

	// Class.forName("com.mysql.cj.jdbc.Driver");
	//JdbcConnection  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bookin?useSSL=false", "root","123456789");
	 //PreparedStatement pst=con.prepareStatement("insert into booking(uId,uname,umobile,ucheckIn,ucheckOut,uadults,uchild) values(?,?,?,?,?,?,?) ");
	 //pst.setString(1, uId);
	 //pst.setString(2, uname);
	 //pst.setString(3, umobile);
	 //pst.setString(4, ucheckIn);
	 //pst.setString(5, ucheckOut);
	 //pst.setString(6, uadults);
	// pst.setString(7, uchild);
	 
		
	 int x=9;//pst.executeUpdate();
	 
	 if(x>0) {
			System.out.println("succuss");
		}
		else {
			System.out.println("enter correct detail");
		}
	
		}
		catch(Exception e){
	out.println(e);
		}
%>>