<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>registeration form</title>
    <link rel="stylesheet" type="text/css" href="registeration.css">
    </head>
    <body>
    <div class="form_main">
        <div class="register">
        
        <h2>Register Here</h2>
        <form id="register" method="post">
        <lable>First Name:</lable>
            <br>
            <input type="text" name="fname" id="name" placeholder="Enter your First Name">
            <br><br>
            <lable>Last Name:</lable>
            <br>
            <input type="text" name="lname" id="name" placeholder="Enter your Last Name">
            <br><br>
            <label>Your Age:</label>
            <br>
            <input type="number" name="age" id="name" placeholder="Insert Your Age">
            <br><br>
            <lable>E-mail:</lable>
 <br>
            <input type="text" name="e-mail" id="name" placeholder="Enter Your E-mail">
            <br><br>
            <label>Gender:</label>
            <br>
            &nbsp;&nbsp;&nbsp;
            <input type="radio" name="gender" id="male">
            &nbsp;
            <span id="male">Male</span>
            &nbsp;&nbsp;&nbsp;
            <input type="radio" name="gender" id="female">
            &nbsp;
            <span id="female">Female</span>
            <br><br>
            <label>Known Language</label>
            <br>
            &nbsp;&nbsp;&nbsp;
            <input type="checkbox" name="Lang" id="hindi">
            &nbsp;
            <span id="hindi">Hindi</span>
            &nbsp;&nbsp;&nbsp;
            <input type="checkbox" name="lang" id="english">
             &nbsp;
            <span id="english">Englilsh</span>
            <br><br>
            <input type="submit"  value="submit" name="submit" id="submit">
            
        </form>
        
        
</div><!--register end--->
        </div><!-- form_main end-->

</body>
</html>