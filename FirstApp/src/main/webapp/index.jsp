<%
if(session.getAttribute("name")==null){
	response.sendRedirect("login.jsp");
}
%>



Made by Ashu Shekhawat
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<meta name="description" content="" />
<meta name="author" content="" />
<title>Tour Management</title>


<style>

body{
   
}
        div.welcome h1{
       text-align: center;
       /*background-color: #951da5;*/
       background-color: orange;
       font-size: 40px;
       color: white;
        
        }
div.gallery {
  margin: 20px;
  border: 1px solid #ccc;
 
  width: 600px;
 
}

div.gallery:hover {
  border: 1px solid #777;
  border:rounded;
 
}

div.gallery img {
 
  height: auto;
}

div.desc {


  padding: 15px;
  text-align: center;
  font-size: 25px;
  font-weight:10px;
  color: Green;
  
 
}

.button {
  display: inline-block;
  border-radius: 4px;
  background-color: #32816c;
  border: none;
  color: #FFFFFF;
  text-align: center;
  font-size: 15px;
  padding: 20px;
  width: 500px;
  transition: all 0.5s;
  cursor: pointer;
  margin: 5px;
margin-left:300px
 
}

.button span {
  cursor: pointer;
  display: inline-block;
  position: relative;
  transition: 0.5s;
}

.button span:after {
  content: '\00bb';
  position: absolute;
  opacity: 0;
  top: 0;
  right: -20px;
  transition: 0.5s;
}

.button:hover span {
  padding-right: 25px;
}

.button:hover span:after {
  opacity: 1;
  right: 0;
}
</style>


<!-- Favicon-->
<link rel="icon" type="image/x-icon" href="assets/favicon.ico" />
<!-- Font Awesome icons (free version)-->
<script src="https://use.fontawesome.com/releases/v5.15.4/js/all.js"
	crossorigin="anonymous"></script>
<!-- Google fonts-->
<link href="https://fonts.googleapis.com/css?family=Montserrat:400,700"
	rel="stylesheet" type="text/css" />
<link
	href="https://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic"
	rel="stylesheet" type="text/css" />
<!-- Core theme CSS (includes Bootstrap)-->
<link href="css/index-styles.css" rel="stylesheet" />
</head>
<body id="page-top">
<!-- --------made change -->
<input type="hidden" id="status" value="<%=request.getAttribute("status") %>">



	<!-- Navigation-->
	<nav
		class="navbar navbar-expand-lg bg-secondary text-uppercase fixed-top border_bottom"
		id="mainNav">
		<div class="container">
			<a class="navbar-brand" href="#page-top">MY TOUR</a>
			<button
				class="navbar-toggler text-uppercase font-weight-bold bg-primary text-white rounded"
				type="button" data-bs-toggle="collapse"
				data-bs-target="#navbarResponsive" aria-controls="navbarResponsive"
				aria-expanded="false" aria-label="Toggle navigation">
				Menu <i class="fas fa-bars"></i>
			</button>
			<div class="collapse navbar-collapse" id="navbarResponsive">
				<ul class="navbar-nav ms-auto">
					<li class="nav-item mx-0 mx-lg-1"><a
						class="nav-link py-3 px-0 px-lg-3 rounded" href="#portfolio">Destinations</a></li>
					<li class="nav-item mx-0 mx-lg-1"><a
						class="nav-link py-3 px-0 px-lg-3 rounded" href="#about">About</a></li>
					<li class="nav-item mx-0 mx-lg-1"><a
						class="nav-link py-3 px-0 px-lg-3 rounded" href="#contact">Contact for Guide</a></li>
					<li class="nav-item mx-0 mx-lg-1"><a
						class="nav-link py-3 px-0 px-lg-3 rounded" href="logout">Logout</a></li>
						<li class="nav-item mx-0 mx-lg-1 bg-danger"><a
						class="nav-link py-3 px-0 px-lg-3 rounded" href="logout"><%=session.getAttribute("name") %></a></li>
					
				</ul>
			</div>
		</div>
	</nav>
	<!-- Masthead-->
	<header class="masthead ashu-change text-white text-center">
		<div class="container d-flex align-items-center  flex-column">
			<!-- Masthead Avatar Image-->
			<img class="masthead-avatar  mb-5" src="assets/img/taj.webp"
				alt="..." /> 
			<!-- Masthead Heading-->
			<h2 class="masthead-heading text-uppercase mb-0">Travel more to discover yourself.</h2>
			
			
			<!-- Icon Divider--> 
			<div class="divider-custom divider-light">
				<div class="divider-custom-line"></div>
				<div class="divider-custom-icon">
					<i class="fas fa-star"></i>
				</div>
				<div class="divider-custom-line"></div>
			</div>
			<!-- Masthead Subheading-->
			<p class="masthead-subheading font-weight-light mb-0">
				Dream - Explore - Take Memories</p>
		</div>
	</header>
	<!-- Portfolio Section-->
	<section class="page-section portfolio" id="portfolio">
		<div class="container">
			<!-- Portfolio Section Heading-->
			<h2
				class="page-section-heading text-center text-uppercase text-secondary mb-0">Destinations</h2>
			<!-- Icon Divider-->
			<div class="divider-custom">
				<div class="divider-custom-line"></div>
				<div class="divider-custom-icon">
					<i class="fas fa-star"></i>
				</div>
				<div class="divider-custom-line"></div>
			</div>
			<!-- Portfolio Grid Items-->
			<div class="row justify-content-center">
			
				<!-- Portfolio Item 1-->
				<div class="col-md-6 col-lg-4 mb-5">
					<div class="portfolio-item mx-auto" data-bs-toggle="modal"
						data-bs-target="#portfolioModal1">
						<div
							class="portfolio-item-caption d-flex align-items-center justify-content-center h-100 w-100">
							<div>
								<class="portfolio-item-caption-content text-center text-white">
								<i class="fas fa-plus fa-3x"></i>
							</div>
						</div>
						<img class="img-fluid" src="assets/img/portfolio/hawamahal.jpg"
							alt="..." />
					</div>
				</div>
				<!-- Portfolio Item 2-->
				<div class="col-md-6 col-lg-4 mb-5">
					<div class="portfolio-item mx-auto" data-bs-toggle="modal"
						data-bs-target="#portfolioModal2">
						<div
							class="portfolio-item-caption d-flex align-items-center justify-content-center h-100 w-100">
							<div
								class="portfolio-item-caption-content text-center text-white">
								<i class="fas fa-plus fa-3x"></i>
							</div>
						</div>
						<img class="img-fluid" src="assets/img/portfolio/delhi.jpg"
							alt="..." />
					</div>
				</div>
				<!-- Portfolio Item 3-->
				<div class="col-md-6 col-lg-4 mb-5">
					<div class="portfolio-item mx-auto" data-bs-toggle="modal"
						data-bs-target="#portfolioModal3">
						<div
							class="portfolio-item-caption d-flex align-items-center justify-content-center h-100 w-100">
							<div
								class="portfolio-item-caption-content text-center text-white">
								<i class="fas fa-plus fa-3x"></i>
							</div>
						</div>
						<img class="img-fluid" src="assets/img/portfolio/udaipur.jpg"
							alt="..." />
							
							
					</div>
				</div>
				<!-- Portfolio Item 4-->
				<div class="col-md-6 col-lg-4 mb-5 mb-lg-0">
					<div class="portfolio-item mx-auto" data-bs-toggle="modal"
						data-bs-target="#portfolioModal4">
						<div
							class="portfolio-item-caption d-flex align-items-center justify-content-center h-100 w-100">
							<div
								class="portfolio-item-caption-content text-center text-white">
								<i class="fas fa-plus fa-3x"></i>
							</div>
						</div>
						<img class="img-fluid" src="assets/img/portfolio/ooti.jpg"
							alt="..." />
					</div>
				</div>
				<!-- Portfolio Item 5-->
				<div class="col-md-6 col-lg-4 mb-5 mb-md-0">
					<div class="portfolio-item mx-auto" data-bs-toggle="modal"
						data-bs-target="#portfolioModal5">
						<div
							class="portfolio-item-caption d-flex align-items-center justify-content-center h-100 w-100">
							<div
								class="portfolio-item-caption-content text-center text-white">
								<i class="fas fa-plus fa-3x"></i>
							</div>
						</div>
						<img class="img-fluid" src="assets/img/portfolio/shimla3.jpg"
							alt="..." />
					</div>
				</div>
				<!-- Portfolio Item 6-->
				<div class="col-md-6 col-lg-4">
					<div class="portfolio-item mx-auto" data-bs-toggle="modal"
						data-bs-target="#portfolioModal6">
						<div
							class="portfolio-item-caption d-flex align-items-center justify-content-center h-100 w-100">
							<div
								class="portfolio-item-caption-content text-center text-white">
								<i class="fas fa-plus fa-3x"></i>
							</div>
						</div>
						<img class="img-fluid" src="assets/img/portfolio/goa3.jpg"
							alt="..." />
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- About Section-->
	<section class="page-section bg-primary text-white mb-0" id="about">
		<div class="container">
			<!-- About Section Heading-->
			<h2
				class="page-section-heading text-center text-uppercase text-white">About </h2>
			<!-- Icon Divider-->
			<div class="divider-custom divider-light">
				<div class="divider-custom-line"></div>
				<div class="divider-custom-icon">
					<i class="fas fa-star"></i>
				</div>
				<div class="divider-custom-line"></div>
			</div>
			<!-- About Section Content-->
			<div class="row">
				<div class="col-lg-4 ms-auto">
					<p class="lead"> I am Ashu Shekhawat student of MCA batch 21-22 at Sri balaji college of engineering and technology. This 
					Project is created by me.This Project is created using Java, Jsp, css, html, bootstrap and mySql.
					The purpose is to design a system using which one can perform all operations and give users a great experience. Since Travel
					has become most growing industry now day's. So this application will have so useful for agencies as well as users
					
					
					
				</div>
				<div class="col-lg-4 me-auto">
					<p class="lead">The Tour Management System is a web based application and maintains a centralized repository of all
					 related information. The Objective of this project is to develop a system that automates the process and activities 
					 of a travel agency and customer details.  The purpose is to design a system using which one can perform all operations
					  related to traveling and sight- seeing.
</p>
				</div>
			</div>
			<!-- About Section Button-->
			<!-- 
			<div class="text-center mt-4">
			<a class="btn btn-xl btn-outline-light" >
			
			
			<i 
					class="fas fa-arrow-right"></i>Know more
			</a>
			</div> -->
			
			<form action="next.jsp" target='_top'>
			
	<button class="button" style="vertical-align:middle" input type="submit" value="Book Your Tour Now" name="know more" id="submit" ><span>Book your Tour </span></button>
			
			</form>
			
			
		</div>
	</section>
	<!-- Contact Section-->
	<section class="page-section" id="contact">
		<div class="container">
			<!-- Contact Section Heading-->
			<h2
				class="page-section-heading text-center text-uppercase text-secondary mb-0">Contact
				for Guide</h2>
			<!-- Icon Divider-->
			<div class="divider-custom">
				<div class="divider-custom-line"></div>
				<div class="divider-custom-icon">
					<i class="fas fa-star"></i>
				</div>
				<div class="divider-custom-line"></div>
			</div>
			<!-- Contact Section Form-->
			<div class="row justify-content-center">
				<div class="col-lg-8 col-xl-7">
					<!-- * * * * * * * * * * * * * * *-->
					<!-- * * SB Forms Contact Form * *-->
					<!-- * * * * * * * * * * * * * * *-->
					<!-- This form is pre-integrated with SB Forms.-->
					<!-- To make this form functional, sign up at-->
					<!-- https://startbootstrap.com/solution/contact-forms-->
					<!-- to get an API token!-->
					 <form method="get" action="contact" class="register-form"
					id="contactForm" data-sb-form-api-token="API_TOKEN">
						<!-- Name input-->
						<div class="form-floating mb-3">
							<input class="form-control" id="name" type="text"
								placeholder="Enter your name..." data-sb-validations="required" />
							<label for="name">Full name</label>
							<div class="invalid-feedback" data-sb-feedback="name:required">A
								name is required.</div>
						</div>
						<!-- Email address input-->
						<div class="form-floating mb-3">
							<input class="form-control" id="email" type="email"
								placeholder="name@example.com"
								data-sb-validations="required,email" /> <label for="email">Email
								address</label>
							<div class="invalid-feedback" data-sb-feedback="email:required">An
								email is required.</div>
							<div class="invalid-feedback" data-sb-feedback="email:email">Email
								is not valid.</div>
						</div>
						<!-- Phone number input-->
						<div class="form-floating mb-3">
							<input class="form-control" id="phone" type="tel"
								placeholder="(123) 456-7890" data-sb-validations="required" />
							<label for="phone">Phone number</label>
							<div class="invalid-feedback" data-sb-feedback="phone:required">A
								phone number is required.</div>
						</div>
						<!-- Message input-->
						<div class="form-floating mb-3">
							<textarea class="form-control" id="message" type="text"
								placeholder="Enter your message here..." style="height: 10rem"
								data-sb-validations="required"></textarea>
							<label for="message">Message</label>
							<div class="invalid-feedback" data-sb-feedback="message:required">A
								message is required.</div>
						</div>
						<!-- Submit success message-->
						<!---->
						<!-- This is what your users will see when the form-->
						<!-- has successfully submitted-->
						<div class="d-none" id="submitSuccessMessage">
							<div class="text-center mb-3">
								<div class="fw-bolder">Form submission successful!</div>
								 <br /> 
							</div>
						</div>
						<!-- Submit error message-->
						<!---->
						<!-- This is what your users will see when there is-->
						<!-- an error submitting the form-->
						<div class="d-none" id="submitErrorMessage">
							<div class="text-center text-danger mb-3">Error sending
								message!</div>
						</div>
						<!-- Submit Button-->
						<button class="btn btn-primary btn-xl disabled" id="submitButton"
							type="submit">Send</button>
					</form>
				</div>
			</div>
		</div>
	</section>
	<!-- Footer-->
	<footer class="footer text-center">
		<div class="container">
			<div class="row">
				<!-- Footer Location-->
				<div class="col-lg-4 mb-5 mb-lg-0">
					<h4 class="text-uppercase mb-4">Location</h4>
					<p class="lead mb-0">
						300202 Amer<br /> Jaipur, Mo. 123456
					</p>
				</div>
				<!-- Footer Social Icons-->
				<div class="col-lg-4 mb-5 mb-lg-0">
					<h4 class="text-uppercase mb-4">Around the Web</h4>
					<a class="btn btn-outline-light btn-social mx-1" href="#!"><i
						class="fab fa-fw fa-facebook-f"></i></a> <a
						class="btn btn-outline-light btn-social mx-1" href="#!"><i
						class="fab fa-fw fa-twitter"></i></a> <a
						class="btn btn-outline-light btn-social mx-1" href="#!"><i
						class="fab fa-fw fa-linkedin-in"></i></a> <a
						class="btn btn-outline-light btn-social mx-1" href="#!"><i
						class="fab fa-fw fa-dribbble"></i></a>
				</div>
				<!-- Footer About Text-->
				<div class="col-lg-4">
					<h4 class="text-uppercase mb-4">About Me</h4>
					<p class="lead mb-0">
						I am Ashu Shekhawat, a newbie  web developer. This web app is created by me
						 <a href="https://www.linkedin.com/in/ashu-shekhawat-4702601b0">linkedIn profile</a> .
					</p>
				</div>
			</div>
		</div>
	</footer>
	<!-- Copyright Section-->
	<div class="copyright py-4 text-center text-white">
		<div class="container">
			<small>Copyright &copy; My Website 2022</small>
		</div>
	</div>
	<!-- Portfolio Modals-->
	
	<!-- Portfolio Modal 1-->
	<div class="portfolio-modal modal fade" id="portfolioModal1"
		tabindex="-1" aria-labelledby="portfolioModal1" aria-hidden="true">
		<div class="modal-dialog modal-xl">
			<div class="modal-content">
				<div class="modal-header border-0">
				<button class="btn-close" type="button" data-bs-dismiss="modal"
						aria-label="Close"></button>
				</div>
				<div class="modal-body text-center pb-5">
					<div class="container">
						<div class="row justify-content-center">
							<div class="col-lg-8">
								<!-- Portfolio Modal - Title-->
								<h2
									class="portfolio-modal-title text-secondary text-uppercase mb-0">Jaipur
									</h2>
								<!-- Icon Divider-->
								<div class="divider-custom">
									<div class="divider-custom-line"></div>
									<div class="divider-custom-icon">
										<i class="fas fa-star"></i>
									</div>
									<div class="divider-custom-line"></div>
								</div>
								<!-- Portfolio Modal - Image-->
								<img class="img-fluid rounded mb-5"
									src="assets/img/portfolio/hawamahal.jpg" alt="..." />
								<!-- Portfolio Modal - Text-->
								<p class="mb-4"> Jaipur City evokes the royal family that once ruled the region and that, 
founded what is now called the Pink City for its architecture and trademark building color. With gardens, courtyards 
and museums, part of it is still a royal residence. The story goes that in 1876, the Prince of Wales visited India on a 
tour. Since the colour pink was symbolic of hospitality, Maharaja Ram Singh of Jaipur painted the entire city pink. The pink that colours the 
city makes for a marvellous spectacle to behold.Known for Hawa Mahal, Jal Mahal, Amer Fort, Jantar Mantar and several other places to visit, 
Jaipur has numerous stories to tell. .</p>
								<form action="jaipur.jsp">
								<button class= "btn btn-primary input type="submit" value="know more" name="know more" id="submit" >Know more</button>
								</form>
								
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- Portfolio Modal 2-->
	<div class="portfolio-modal modal fade" id="portfolioModal2"
		tabindex="-1" aria-labelledby="portfolioModal2" aria-hidden="true">
		<div class="modal-dialog modal-xl">
			<div class="modal-content">
				<div class="modal-header border-0">
					<button class="btn-close" type="button" data-bs-dismiss="modal"
						aria-label="Close"></button>
				</div>
				<div class="modal-body text-center pb-5">
					<div class="container">
						<div class="row justify-content-center">
							<div class="col-lg-8">
								<!-- Portfolio Modal - Title-->
								<h2
									class="portfolio-modal-title text-secondary text-uppercase mb-0">Delhi
									</h2>
								<!-- Icon Divider-->
								<div class="divider-custom">
									<div class="divider-custom-line"></div>
									<div class="divider-custom-icon">
										<i class="fas fa-star"></i>
									</div>
									<div class="divider-custom-line"></div>
								</div>
								<!-- jalmahal - Image-->
								<img class="img-fluid rounded mb-5"
									src="assets/img/portfolio/delhi.jpg" alt="..." />
								<!-- jalmahal - Text-->
								<p class="mb-4">Delhi is famous for its heritage sites, featuring UNESCO Heritage sites like Red Fort, Humayun's Tomb, 
								Jama Masjid and Qutub Minar. Some of the other popular tourist destinations in Delhi are Old Fort, the famous ISKCON temple 
								- a famous Hindu spiritual destination and Akshardham.</p>
								<form action="delhi.jsp">
								<button class= "btn btn-primary input type="submit" value="know more" name="know more" id="submit" >Know more</button>
								</form>
								
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- Portfolio Modal 3-->
	<div class="portfolio-modal modal fade" id="portfolioModal3"
		tabindex="-1" aria-labelledby="portfolioModal3" aria-hidden="true">
		<div class="modal-dialog modal-xl">
			<div class="modal-content">
				<div class="modal-header border-0">
					<button class="btn-close" type="button" data-bs-dismiss="modal"
						aria-label="Close"></button>
				</div>
				<div class="modal-body text-center pb-5">
					<div class="container">
						<div class="row justify-content-center">
							<div class="col-lg-8">
								<!-- Portfolio Modal - Title-->
								<h2
									class="portfolio-modal-title text-secondary text-uppercase mb-0">Udaipur
									</h2>
								<!-- Icon Divider-->
								<div class="divider-custom">
									<div class="divider-custom-line"></div>
									<div class="divider-custom-icon">
										<i class="fas fa-star"></i>
									</div>
									<div class="divider-custom-line"></div>
								</div>
								<!-- Portfolio Modal - Image-->
								<img class="img-fluid rounded mb-5"
									src="assets/img/portfolio/udaipur.jpg" alt="..." />
								<!-- Portfolio Modal - Text-->
								<p class="mb-4">Udaipur, no doubt will definitely chill  soul because multiple lakes adorn this city. For this particular
         reason, Udaipur is also known as Venice of the East. Some lakes of Udaipur like Lake Pichola are even featured in Hollywood and Bollywood movies. Some lakes would take you to 
        green fields and farms, narrow pathways, scenic villages. Some of the most popular lakes of Udaipur are Fateh Sagar Lake, 
        Lake Pichola, Udaisagar Lake, Jaisamand Lake, Badi Lake, Doodh Talai etc. Visiting Udaipur would be one of the best things 
        to do in Udaipur if you want to experience the feel of Venice in India.</p>
								<form action="udaipur.jsp">
								<button class= "btn btn-primary input type="submit" value="know more" name="know more" id="submit" >Know more</button>
								</form>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
 </div>
	<!-- Portfolio Modal 4-->
	<div class="portfolio-modal modal fade" id="portfolioModal4"
		tabindex="-1" aria-labelledby="portfolioModal4" aria-hidden="true">
		<div class="modal-dialog modal-xl">
			<div class="modal-content">
				<div class="modal-header border-0">
					<button class="btn-close" type="button" data-bs-dismiss="modal"
						aria-label="Close"></button>
				</div>
				<div class="modal-body text-center pb-5">
					<div class="container">
						<div class="row justify-content-center">
							<div class="col-lg-8">
								<!-- Portfolio Modal - Title-->
								<h2
									class="portfolio-modal-title text-secondary text-uppercase mb-0">OOTi</h2>
								<!-- Icon Divider-->
								<div class="divider-custom">
									<div class="divider-custom-line"></div>
									<div class="divider-custom-icon">
										<i class="fas fa-star"></i>
									</div>
									<div class="divider-custom-line"></div>
								</div>
								<!-- Portfolio Modal - Image-->
								<img class="img-fluid rounded mb-5"
									src="assets/img/portfolio/ooti.jpg" alt="..." />
								<!-- Portfolio Modal - Text-->
								<p class="mb-4">The town of Ooty is tucked into the heart of the Nilgiris, making it a part of the 
								Nilgiri Biosphere Reserve. Owing to its perfect geographical location on the hills, it has remained
								 an all-time favorite retreat for travelers of all kinds, from the colonial days to the current 
								 times. The lush landscape with tea estates, valleys, and forested lands on one hand and the classic vibes of the good old days make this hill station the perfect place to escape. The expansive greenery, the pleasant weather, and the endless adventure options are what Ooty is famous for.</p>
								<form action="ooti.jsp">
								<button class= "btn btn-primary input type="submit" value="know more" name="know more" id="submit" >Know more</button>
								</form>
								
								<!-- <button class="btn btn-primary" href="#!"
									data-bs-dismiss="modal">
									<i class="fas fa-times fa-fw"></i> Know More
								</button> -->
								
								
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- Portfolio Modal 5-->
	<div class="portfolio-modal modal fade" id="portfolioModal5"
		tabindex="-1" aria-labelledby="portfolioModal5" aria-hidden="true">
		<div class="modal-dialog modal-xl">
			<div class="modal-content">
				<div class="modal-header border-0">
					<button class="btn-close" type="button" data-bs-dismiss="modal"
						aria-label="Close"></button>
				</div>
				<div class="modal-body text-center pb-5">
					<div class="container">
						<div class="row justify-content-center">
							<div class="col-lg-8">
								<!-- Portfolio Modal - Title-->
								<h2
									class="portfolio-modal-title text-secondary text-uppercase mb-0">Shimla
									</h2>
								<!-- Icon Divider-->
								<div class="divider-custom">
									<div class="divider-custom-line"></div>
									<div class="divider-custom-icon">
										<i class="fas fa-star"></i>
									</div>
									<div class="divider-custom-line"></div>
								</div>
								<!-- Portfolio Modal - Image-->
								<img class="img-fluid rounded mb-5"
									src="assets/img/portfolio/shimla3.jpg" alt="..." />
								<!-- Portfolio Modal - Text-->
								<p class="mb-4">Blessed with picturesque snow clad Himalayan mountains, lush greenery, grand colonial architecture, 
								paradisiacal natural charm, gleaming lakes and numerous other scenic places of delight, Shimla is indeed one of the 
								best places to visit in Himachal Pradesh for an unforgettable holiday. The erstwhile summer capital of India, the 
								'Queen of Hills' captivates tourists and enthralls them with its magical air and wondrous charm. It is hardly 
								surprising then, that it continues to occupy one of the top spots in the bucket list of every traveler</p>
								<form action="shimla.jsp">
								<button class= "btn btn-primary input type="submit" value="know more" name="know more" id="submit" >Know more</button>
								</form>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- Portfolio Modal 6-->
	<div class="portfolio-modal modal fade" id="portfolioModal6"
		tabindex="-1" aria-labelledby="portfolioModal6" aria-hidden="true">
		<div class="modal-dialog modal-xl">
			<div class="modal-content">
				<div class="modal-header border-0">
					<button class="btn-close" type="button" data-bs-dismiss="modal"
						aria-label="Close"></button>
				</div>
				<div class="modal-body text-center pb-5">
					<div class="container">
						<div class="row justify-content-center">
							<div class="col-lg-8">
								<!-- Portfolio Modal - Title-->
								<h2
									class="portfolio-modal-title text-secondary text-uppercase mb-0">Goa</h2>
									
								<!-- Icon Divider-->
								<div class="divider-custom">
									<div class="divider-custom-line"></div>
									<div class="divider-custom-icon">
										<i class="fas fa-star"></i>
									</div>
									<div class="divider-custom-line"></div>
								</div>
								<!-- Portfolio Modal - Image-->
								<img class="img-fluid rounded mb-5"
									src="assets/img/portfolio/goa3.jpg" alt="..." />
								<!-- Portfolio Modal - Text-->
								<p class="mb-4">The coastal paradise, Goa is not unknown to anyone. This tiny state in West India is famous for its plethora of beautiful 
        beaches, great seafood, amazing nightlife, and thrilling watersports. Goa along with being a popular beach destination in India is a perfect honeymoon destination, a great getaway with friends, and an amazing family holiday place, which means, the place is filled with activities and attractions to keep all its visitors engaged.
The state is majorly divided into two districts - North Goa and South Goa. </p>
								<form action="goa.jsp">
								<button class= "btn btn-primary input type="submit" value="know more" name="know more" id="submit" >Know more</button>
								</form>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- Bootstrap core JS-->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
	<!-- Core theme JS-->
	<script src="js/scripts.js"></script>
	<!-- * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *-->
	<!-- * *                               SB Forms JS                               * *-->
	<!-- * * Activate your form at https://startbootstrap.com/solution/contact-forms * *-->
	<!-- * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *-->
	<script src="https://cdn.startbootstrap.com/sb-forms-latest.js"></script>
	<!-- JS -->
	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="js/main.js"></script>
	
	<!-- library used for alert- -->
	<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
	<link rel="stylesheet" href="alert/dist/sweetalert.css">
	<script type="text/javascript">
    var status=document.getElementById("status").value;
    if(status=="success"){
    	swal("Congrats","Your request is succesful","success");
    }

	</script>
</body>
</html>
