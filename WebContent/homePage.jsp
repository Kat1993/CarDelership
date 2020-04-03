<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ page import="com.car.Customer" %>
    <%Customer customer =(Customer)session.getAttribute("customer");%>
  
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Home Page </title>

    <link rel="stylesheet" type="text/css" 
    href="car.css">

</head>
<body>
<header>

	<form action="SignInServlet" method ="post">
	
	<div class="row">
	
		<ul class="main-nav">
		
	
			<li class="active"> <a href="">HOME</a></li>
			<li> <a href="inventory.jsp">Car For Sale</a></li>
			
			<li><a href ="signIn.jsp">Sign in</a>
			<li> <a href="">Contact Information</a></li>
		</ul>
		</div>
		
	
 <div class="hero">
   
 
		<h3> Hello <%out.print(customer.getFirstName()); %> 
		<br>Lets Shops Some Cars</h3>
		
		<div class="button">
		    <a href="" class="btn btn-one">Cars For Sale</a>
		  
		</div>
	</div>
</form>
</header>

	
</body>
</html>