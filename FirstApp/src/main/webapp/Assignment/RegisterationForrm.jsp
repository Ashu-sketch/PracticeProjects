<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
        <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
        <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script>
            $(function () {
                $("#datepicker").datepicker();
            });
        </script>
</head>
<body>
<h1>Good Morning 

</h1>
<form action="signup" method="post">

    
  <label for="fname">First name:</label><br>
  <input type="text" id="fname" name="fname" value=""><br>
  <label for="lname">Last name:</label><br>
  <input type="text" id="lname" name="lname" value=""><br><br>
    <label for="gender">Gender:</label><br>
  <input type="text" id="gender" name="gender" value=""><br><br>
    <label for="password">password:</label><br>
  <input type="text" id="psw" name="psw" value=""><br><br>
    <label for="email">Email:</label><br>
  <input type="text" id="email" name="email" value=""><br><br>
  
  <label for="DOB">select date of birth:</label>
    <input type="date" id="DOB" name="DOB">
 <!-- 
 <label>Date of Birth</label>
  <input type="text" id="day" name="day" value=""><br><br>
      <label>Date of Month</label>
  <input type="text" id="month" name="month" value=""><br><br>
  
  <label>Date of Year</label>
  <input type="text" id="year" name="year" value=""><br><br>
 - -->   
  
  
  <input type="submit" value="Submit">
</form> 
    

    
    

    
  



</body>
</html>