<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
        <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
        <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
        
      <!--- <script>
            $(function () {
                $("#datepicker").datepicker();
            });
        </script>-->
        <script type="text/javascript">
        
        $(document).ready(function(){
        	var age=" ";
        	$('#dob').datepicker({
        		onselect:function(value, ui){
            		var today=new Date();
            		age=today.getFullyear()-ui.selectYear;
            		$('#age').val(age);
            	},
            	changemonth:true,
            	changeYear:true
        	})
        	
        	
        })
        </script>
        
</head>
<body>
 <Pre>
        <form action="D_O_B.jsp" method="post">
            <label for="datepicker">Enter Your Date of Birth:</label>
                <input type="text" name="dob" id="datepicker" >
            
            <input type="submit" value="Submit">
        </form>
        </pre>  
        <b>Enter your age:<input type ="text" id="age" readonly></b>
</body>
</html>