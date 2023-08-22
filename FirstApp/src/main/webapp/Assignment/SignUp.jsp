<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registeration</title>
<style>  
body{  
  font-family: Calibri, Helvetica, sans-serif;  
  background-color: pink;  
}  
.container {  
    padding: 50px;  
  background-color: lightblue;  
}  
  
input[type=text], input[type=password], textarea {  
  width: 100%;  
  padding: 15px;  
  margin: 5px 0 22px 0;  
  display: inline-block;  
  border: none;  
  background: #f1f1f1;  
}  
input[type=text]:focus, input[type=password]:focus {  
  background-color: orange;  
  outline: none;  
}  
 div {  
            padding: 10px 0;  
         }  
hr {  
  border: 1px solid #f1f1f1;  
  margin-bottom: 25px;  
}  
.registerbtn {  
  background-color: #4CAF50;  
  color: white;  
  padding: 16px 20px;  
  margin: 8px 0;  
  border: none;  
  cursor: pointer;  
  width: 100%;  
  opacity: 0.9;  
}  
.registerbtn:hover {  
  opacity: 1;  
}  




</style>
<link rel="stylesheet" href="//code.jquery.com/ui/1.13.2/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">

<script type="text/javascript">

var check = function() {
	  if (document.getElementById('password').value ==
	    document.getElementById('psw-repeat').value) {
	    document.getElementById('message').style.color = 'green';
	    document.getElementById('message').innerHTML = 'matching';
	  } else {
	    document.getElementById('message').style.color = 'red';
	    document.getElementById('message').innerHTML = 'not matching';
	  }
	}

password.onchange = validatePassword;
re_pass.onkeyup = validatePassword;


<

</script>

<!-- datepicker inline script -->
<script>

jQuery(document).ready(function () {
    jQuery('#datepicker').datepicker({
        format: 'dd-mm-yyyy',
        startDate: '+1d'
    });
});
</script>
<!-- datepicker  -->
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script src="https://kit.fontawesome.com/a076d05399.js"></script>




<!-- -heteehe -->
 <link rel="stylesheet" href="//code.jquery.com/ui/1.13.2/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script src="https://code.jquery.com/jquery-3.6.0.js"></script>
  <script src="https://code.jquery.com/ui/1.13.2/jquery-ui.js"></script>
  <script>
  $( function() {
    $( "#datepicker" ).datepicker();
  } );
  </script>

</head>
<body>
<h1>Welcome to LMD</h1>

<form action="Welcome.jsp" method="post">s
 <div class="container">  
  <center>  <h1> Registeration Form</h1> </center>  
  <hr>  
  <label> Firstname </label>   
<input type="text" name="firstname" placeholder= "Firstname" size="15" required />   
  
<label> Lastname: </label>    
<input type="text" name="lastname" placeholder="Lastname" size="15" required value=" " />   
  
<div>  
<label>   
Gender :  
</label><br>  
<input type="radio" value="Male" name="gender"  > Male   
<input type="radio" value="Female" name="gender"> Female   
<input type="radio" value="Other" name="gender"> Other  
  
</div>  
<label>   
Phone :  
</label>  
<input type="text" name="country code" placeholder="Country Code"  value="+91" size="2"/>   
<input type="text" name="phone" placeholder="phone no." size="10"/ required>   
Current Address :  
<textarea cols="80" rows="5" placeholder="Current Address" value="address" name ="address" required>  
</textarea>  
 <label for="email"><b>Email</b></label>  
 <input type="text" placeholder="Enter Email" name="email" required>  
 
 
 <!-- datepicker --> 
  <label for="datepicker"><b>Date Of Birth</b></label>  
 <input type="text" placeholder="DD-MM-YY" name="datepicker"  id="datepicker" value=" " /> 
  <!-- -password_module -->
    <label for="psw"><b>Password</b></label>  
    
    <input type="password" placeholder="Enter Password" name="psw" id= "password" onkeyup='check();'required  />  
  
    <label for="psw-repeat"><b>Re-type Password</b></label>  
    <input type="password" placeholder="Retype Password" name="psw-repeat" id="psw-repeat" onkeyup='check();' required />  
    
    <span id='message'></span>
    

    
    <button type="submit" class="registerbtn">Register</button>   
    
    <label>   
Terms and condition :  
</label><br>
     <input type="checkbox"  name="condition" required value="checked">  
    


</form>



    <p>Date: <input type="text" id="datepicker"></p>



</body>
</html>