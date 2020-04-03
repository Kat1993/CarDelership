<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix ="c" uri ="http://java.sun.com/jsp/jstl/core" %>
    <%@ page import="com.car.Vehicle" %>
    <%@ page import ="java.util.*" %>
    <% ArrayList<Vehicle> vehicles =(ArrayList<Vehicle>)session.getAttribute("vehicles"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Car For Sale</title>
 <link rel="stylesheet" type="text/css" 
    href="car.css">
    <link rel ="stylesheet"type="text/css"href=".styles/styles.css">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
 integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
</head>
<body>
<header>
  <form action="InventoryServlet" method ="post">

<div class="row">
	
		<ul class="main-nav">
		
	
			<li class="active"> <a href="managerPage.jsp">HOME</a></li>
			
			</ul>
			<button type="submit" class="button"> Inventory</button>
			</div>
			
   
 <table  class="table table-dark" >
<c:if test="${vehicles!=null }">

   <tr>
   <th scope="col"> Photo</th>
     <th scope="col"> Make</th>
     <th scope="col"> Model</th>
     <th scope="col"> Year</th>
     <th scope="col"> Mileage</th>
     <th scope="col"> Style</th>
     <th scope="col"> Condition</th>
     <th scope="col"> Color</th>
     <th scope="col"> Price</th>
     <th scope="col"> </th>
     
<c:forEach var="vehicle" items="${vehicles}">
  <tr>
 
    <td><img src="${vehicle.pic}"/></td>
    <td><c:out value="${vehicle.make}"/></td>
    <td><c:out value="${vehicle.model}"/></td>
    <td><c:out value="${vehicle.year}"/></td>
    <td><c:out value="${vehicle.mileage}"/></td>
    <td><c:out value="${vehicle.style}"/></td>
    <td><c:out value="${vehicle.condition}"/></td>
    <td><c:out value="${vehicle.color}"/></td>
    <td><c:out value="${vehicle.price}"/></td>
     
    
    <td>
    <button name="buy" type ="button" > Buy</button>
 </td>
 </tr>
 </c:forEach>
 </tr>
 </c:if>
 </table>
 
  </form>


</header>

</body>
</html>