<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ page import="com.car.Customer" %>
    <%Customer customer =(Customer)session.getAttribute("customer");%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login </title>

 <link rel="stylesheet" type="text/css" 
    href="signin.css">

<body class="contain">

 <div class="loginbox">
 <img  src="imeg/ic.jpg" class = "avatar">
    <h1>Login Here</h1>
    <form action="SignInServlet" method="post" >
    <p>Email</p>
    <input type="text" name="email"  placeholder="Enter your email">
    <p>Password</p>
    <input type="text" name="password"  placeholder="Enter your password">
    <input type="submit" name="" value="login" >
    
  </form>
   </div>
 
</body>
</head>
</html>