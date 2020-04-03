<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration</title>

    <link rel="stylesheet" type="text/css" 
    href="car.css">

</head>
<body>
<header>

<form class="container" action="RegistrationServlet" method="POST" >
<div class="form-group">
	<div class="button">
    	 <a href="frontPage.jsp" class="btn btn-three">Return Home</a>
    	
    </div>
		<label for ="firstName">First Name </label>
		<input type="text" class = "from-control" name="firstName" id = "firstName" placeholder="First Name" >
	</div>
	<div class = "from-group">
    <label for ="lastName">Last Name </label>
		<input type="text" class = "from-control" name="lastName" id = "firstName" placeholder="Last Name" >
	  </div>
<div class = "from-group">
    <label for ="email">email </label>
		<input type="text" class = "from-control" name="email" id = "examleinputEmail1" placeholder="Email" >
	  </div>

<div class = "from-group">
    <label for ="password">Password </label>
		<input type="text" class = "from-control" name="password" id = "password" placeholder="Password" >
</div>
<br>Address<br>
<div class="form-group">
		<label for ="street">Street </label>
		<input type="text" class = "from-control" name="street" id = "street" placeholder="Street" >
	</div>
<div class="form-group">
		<label for ="city">City </label>
		<input type="text" class = "from-control" name="city" id = "street" placeholder="City" >
	</div>
	
<div class="form-group">
		<label for ="state">State </label>
		<input type="text" class = "from-control" name="state" id = "state" placeholder="State" >
	</div>
<div class="form-group">
		<label for ="zipCode">zipCode </label>
		<input type="text" class = "from-control" name="zipCode" id = "zipCode" placeholder="Zip Code" >
	</div>

<div class ="from-group">

<button type ="submit" class="btn btn-default">Submit</button>
    </div>

    </form>
 </header>  
</body>
</html>