<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="bootstrap/css/bootstrap-responsive.css" rel="stylesheet">
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" media="screen">
</head>
<body>
	<form class="form-reg" action="InsertUserServlet" method="POST">
		Username &nbsp<input type="text" name="U" class="form-control" placeholder="Username" required autofocus><br>
		Password <input type="password" name="P" class="form-control" placeholder="Password" required autofocus><br>
		Confirm password <input type="password" name="RP" class="form-control" placeholder="Confirm Password" required autofocus><br>
		Name <input type="text" name="N" class="form-control" placeholder="Name" required autofocus> <br>
		Lastname<input type="text" name="L" class="form-control" placeholder="Lastname" required autofocus><br>
		Gender &nbsp
		<label class="radio-inline">
	    	<input type="radio" name="optionsRadiosGender" id="optionsRadiosMale" value="option1" checked>
    		Male
  		</label>
		<label class="radio-inline">
    		<input type="radio" name="optionsRadiosGender" id="optionsRadiosFemale" value="option2">
   			 Female
  		</label><br>
		Email <input type="text" name="E" class="form-control" placeholder="Email" required autofocus><br>
		Photo <input type="file" name="photo" size="50"/><br>
		<button class="btn btn-lg btn-primary btn-block"  type="submit" >Accept</button>
		
		</form>
	<script src="http://code.jquery.com/jquery.js"></script>
	<script src="bootstrap/js/bootstrap.min.js"></script>
</body>
</html>