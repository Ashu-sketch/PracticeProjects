<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head><meta charset="utf-8">
		<title>Book your tour</title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">

		<!-- LINEARICONS -->
		<link rel="stylesheet" href="fonts/linearicons/style.css">

		<!-- MATERIAL DESIGN ICONIC FONT -->
		<link rel="stylesheet" href="fonts/material-design-iconic-font/css/material-design-iconic-font.min.css">

		<!-- DATE-PICKER -->
		<link rel="stylesheet" href="vendor/date-picker/css/datepicker.min.css">
		
		<!-- STYLE CSS -->
	
		<link href="css/nextStyle.css" rel="stylesheet" />
	</head>

	<body>
	
	<!-- <input type="hidden" id="status" value="<%=request.getAttribute("status") %>">     -->

		<div class="wrapper">
			<div class="inner">
				<form method="post" action= "booking" >
					<h3>Request Your Tour </h3>
					<div class="form-row">
					
					<!--  <div class="form-wrapper">
							<label for="">Id *</label>
							<input type="text" class="form-control"  name="id" placeholder="Id ">
						</div>-->
						<div class="form-wrapper">
							<label for="">Name *</label>
							<input type="text" class="form-control"  name="name" placeholder="Your Name">
						</div>
						<div class="form-wrapper">
							<label for="">Phone *</label>
							<input type="text" class="form-control" name="phone" placeholder="Phone">
						</div>
					</div>
					<div class="form-row">
						<div class="form-wrapper">
							<label for="">Check-in *</label>
							<span class="lnr lnr-calendar-full"></span>
							<input type="text" class="form-control datepicker-here" data-language='en' name ="checkIn" data-date-format="dd M yyyy" id="dp1">
						</div>
						<div class="form-wrapper">
							<label for="">Check-out *</label>
							<span class="lnr lnr-calendar-full"></span>
							<input type="text" class="form-control datepicker-here" data-language='en' name="checkOut"  data-date-format="dd M yyyy" id="dp2">
						</div>
					</div>
					<div class="form-row last">
						<div class="form-wrapper">
							<label for="">Adults *</label>
							<select name="adults" id="" class="form-control">
								<option value="1">1</option>
								<option value="2">2</option>
								<option value="3">3</option>
								<option value="4">4</option>
								<option value="5">5</option>
								<option value="6">6</option>
							</select>
							<i class="zmdi zmdi-chevron-down"></i>
						</div>
						<div class="form-wrapper">
							<label for="">Chidren *</label>
							<select name="child" id="" class="form-control">
								<option value="1">1</option>
								<option value="2">2</option>
								<option value="3">3</option>
								<option value="4">4</option>
								<option value="5">5</option>
								<option value="6">6</option>
							</select>
							<i class="zmdi zmdi-chevron-down"></i>
						</div>
					</div>
					<div class="checkbox">
						<label>
							<input type="checkbox"> Accept our privacy policies
							<span class="checkmark"></span>
						</label>
					</div>
					<button data-text="Submit">
						<span>Submit</span>
					</button>
				</form>
			</div>
		</div>
		
		<script src="js/jquery-3.3.1.min.js"></script>

		<!-- DATE-PICKER -->
		<script src="vendor/date-picker/js/datepicker.js"></script>
		<script src="vendor/date-picker/js/datepicker.en.js"></script>

		<script src="js/main.js"></script>
		
		<!-- JS -->
	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="js/main.js"></script>
	
	<!-- library used for alert- -->
	<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
	<link rel="stylesheet" href="alert/dist/sweetalert.css">
	<script type="text/javascript">
   
   var status=document.getElementById("status").value;
    if(status=="success"){
    	swal("Congrats","your Tour is booked successfully ","success");
    }

	</script>
		


</body>
</html>