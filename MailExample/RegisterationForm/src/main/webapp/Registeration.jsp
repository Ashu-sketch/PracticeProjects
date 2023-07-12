<%@page import="com.dao.ConnectionClass"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<h1>Employee Details</h1>
<form action="<%=request.getContextPath()%>/register" method="post">
<table>
<tr>
<td>Employee name</td>
<td>
<input type="text" name=" EmployeeName" />
</td>
</tr>
<tr>
<td>Employee email</td>
<td><input type="text" name="EmplooyeeEmail" /></td>
</tr>
<tr>
<td>Employee password</td>
<td><input type="password" name="emppass" /></td>
<td><input type="submit"></td>
</tr>
</table>

</form>

</div>
</body>
</html>