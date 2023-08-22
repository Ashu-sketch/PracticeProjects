<%@page import="com.jdbc.JdbcConnection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Shopping Cart login</title>
<%@include file="/Includes/Header.jsp" %>
</head>
<body>
	<div class="container">
		<div class="card w-50 mx-auto my-5">
			<div class="card header text-center">User Login</div>
			<div class="card-body">
				<form action="/login" method="post">
					<div class="form-group">
						<label>Email Address</label> <input type="email"
							class="form-control" name="login-email"
							placeholder="Enter Yoour email" required>
					</div>
					<div class="form-group">
						<label>Enter Your Password</label> <input type="password"
							class="form-control" name="login-password"
							placeholder="Enter Yoour password" required>
					</div>
					<div class="text-center">
						<button type="submit" class="btn btn-primary">Login</button>
					</div>

				</form>
			</div>

		</div>
	</div>

	 <%@include file="/Includes/Footer.jsp" %>
	  <%out.print(JdbcConnection.createConnection());%>

</body>
</html>