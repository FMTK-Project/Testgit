<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="bootstrap/css/bootstrap-responsive.css" rel="stylesheet">
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" media="screen">
<link href="bootstrap/css/signin.css" rel="stylesheet">
</head>
<body>
	<div class="container">
		<h1 class="form-signin-heading">Login Page</h1>
		<form class="form-signin" action="LoginServlet" method="POST">
			<input type="text" name="U" class="form-control" placeholder="Username" required autofocus> <input type="password" class="form-control" placeholder="Password" required name="P">
			<button class="btn btn-lg btn-primary btn-block"  type="submit" >Sign In</button>
			<br> <a href="forgotpassword.jsp">Forgot my password ?</a>
		</form>
	</div>
	<br>
	<br>
	<br>
	<br>
	<div id="tabsignup">
		<div class="col-xs-4"></div>
		<div class="col-xs-4" style="margin-top: 80px;">
			<h1 class="regfont">Hihihihi</h1>
		</div>
		<div class="col-xs-2" style="margin-top: 80px;">
			<button class="btn btn-lg btn-warning btn-block" type="submit">Sign Up</button>
		</div>
	</div>
	<script src="http://code.jquery.com/jquery.js"></script>
	<script src="bootstrap/js/bootstrap.min.js"></script>
</body>
</html>

