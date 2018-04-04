<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.4.4/css/mdb.min.css">
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.4.4/js/mdb.min.js"></script>

<script src="resources/net _resource/js/angular.min.js"></script>
<script src="resources/net _resource/js/angular-route.js"></script>
<script src="resources/js/app.js"></script>

<style>
.footer {
	position: fixed;
	left: 0;
	bottom: 0;
	width: 100%;
	background-color: grey;
	color: black;
}

.fa-facebook {
	background: #3B5998;
	color: white;
	height: 30px;
	width: 25px;
}

.fa-twitter {
	background: #55ACEE;
	color: white;
	height: 30px;
	width: 25px;
}
.a{color: white}
.navbar li a {
	color: white;
}
.navbar li a hover {
	color: red;
}
body {
	background-color: background-color: #e38dd6;
	background-image:url("https://www.transparenttextures.com/patterns/45-degree-fabric-light.png");
}
</style>
</head>
<body ng-app="app">
<nav class="navbar navbar info-color-dark" style="margin:0;border-radius:0">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="#home">SocialChat</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="active"><a href="#!home">Home</a></li>
        <li class="dropdown">
          <a class="dropdown-toggle" data-toggle="dropdown" href="#">Page 1 <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#">Page 1-1</a></li>
            <li><a href="#">Page 1-2</a></li>
            <li><a href="#">Page 1-3</a></li>
          </ul>
        </li>
       
         <li><a href="#blog"><span class="glyphicon glyphicon-log-in"></span> Blog</a></li>
         <li><a href="#forum"><span class="glyphicon glyphicon-log-in"></span> Forum</a></li>
         <li><a href="#job"><span class="glyphicon glyphicon-log-in"></span> Job</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="#profile"><span class="glyphicon glyphicon-log-in"></span> Profile</a></li>
        <li><a href="#register"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
        <li><a href="#login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
       
         
      </ul>
    </div>
  </div>
</nav>
	<div class=footer class="container-fluid"
		style="padding-top: 20px; padding-bottom: 20px; background: #000066; font-size: 15px; color: white">
		<div class="row">
		<div class="col-sm-6 col-md-3">
			<h4>Get to know us</h4>
			<ul>
				<li><a class="a" href="#contactus">Contact Us</a></li>
				<li><a class="a" href="#aboutus">About Us</a></li>
				

			</ul></div>
	
		<div class="col-sm-6 col-md-3 text-center">
			<h4>Follow us on</h4>
			<div class="btn-group">
				<a href="https://www.facebook.com" class="btn btn-success"
					style="width: 5em"> <i class="fa fa-facebook"
					style="font-size: 40px; color: #fff"></i></a> 
				<a href="https://www.twitter.com" class="btn btn-success"
					style="width: 5em"> <i class="fa fa-twitter"
					style="font-size: 40px; color: #fff"></i></a>
				 <a href="https://plus.google.com" class="btn btn-success"
					style="width: 5em"> <i class="fa fa-google-plus"
					style="font-size: 40px; color: #fff"></i></a> 
				<a 	href="https://www.instagram.com/?hl=en" class="btn btn-success"
					style="width: 5em"> <i class="fa fa-instagram"
					style="font-size: 40px; color: #fff"></i></a>
					
			</div>
		</div>
	</div>
	</div>


</body>
</html>