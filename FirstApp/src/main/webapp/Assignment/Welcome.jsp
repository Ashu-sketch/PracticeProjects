<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">

@import url(https://fonts.googleapis.com/css?family=Oswald:400);

.navigation {
  width: 100%;
  background-color: Blue;
}

img {
  width: 25px;
  border-radius: 50px;
  float: left;
}

.logout {
  font-size: .8em;
  font-family: 'Oswald', sans-serif;
	position: relative;
  right: -18px;
  bottom: -4px;
  overflow: hidden;
  letter-spacing: 3px;
  opacity: 0;
  transition: opacity .45s;
  -webkit-transition: opacity .35s;
  
}

.button {
	text-decoration: none;
	float: right;
  padding: 12px;
float:left;
  color: white;
  width: 25px;
  background-color: black;
  transition: width .35s;
  -webkit-transition: width .35s;
  overflow: hidden
}

a:hover {
  width: 100px;
}

a:hover .logout{
  opacity: .9;
}

a {
  text-decoration: none;
}

</style>

</head>
<body>
<li class="nav-item mx-0 mx-lg-1"><a
						class="nav-link py-3 px-0 px-lg-3 rounded" href="logout">Logout</a></li>
<h1>user Information</h1>
<h4>First Name: <%=request.getParameter("firstname") %> </h4>

<h4>last Name: <%= request.getParameter("lastname")%></h4>



<h4>E-mail: <%= request.getParameter("email")%></h4>

<h4>Address: <%= request.getParameter("address")%></h4>

<h4>Phone number: <%= request.getParameter("phone")%></h4>

<h4>Gender: <%= request.getParameter("gender")%></h4>

<!-- logout button -->
<div class="navigation">
  
	<a class="button" href="">
  	
  
  <div class="logout">LOGOUT</div>

	</a>
  
</div>

</body>
</html>