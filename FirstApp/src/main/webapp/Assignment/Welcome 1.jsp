<%@page import="com.registerfrom.index.signin.RegisterDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Welcome to the page</h1>
<h1>user Information</h1>

<h4>First Name: <%=request.getAttribute("FirstName") %> </h4> 
 <h4>Last Name: <%=request.getAttribute("LastName") %> </h4> 
 <h4>Gender: <%=request.getAttribute("YourGender") %> </h4> 
 <h4>Password: <%=request.getAttribute("YourPsw") %> </h4> 
 <h4>Mail: <%=request.getAttribute("YourMail") %> </h4> 
  <h4>Your Age: <%=request.getAttribute("Age") %> </h4> 



<!-- 

<%RegisterDao registerDao=new RegisterDao();
String firstName=registerDao.getFname();
%>

<h4> <%=firstName %></h4>
 -->

 






</body>
</html>