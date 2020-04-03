<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Car For Sale</title>

    <link rel="stylesheet" type="text/css" 
    href="car.css">
</head>
<body>
<header>
<form class="container" action="AddCarServlet" enctype="multipart/from-data" method="POST">
<div class="form-group">
<div class="button">

  <a href="managerPage.jsp" class="btn btn-three">Return Home</a>
   </div>
     <label for ="vinNumber">VIN</label><br>
   <input type ="text" name="vinNumber" id="vinNumber" placeholder="Enter VIN"><br>
      </div>
   <div class="form-group">   
      <label for="year">Year</label><br>
   <input type ="text" name="year" id="year" placeholder="Enter year"><br>
       </div>
       <div class="form-group">
       <label for="make">Make</label><br>
   <input type ="text" name="make" id="make" placeholder="Enter make"><br>
         </div>
         <div class="form-group">
         <label for="model">Model</label><br>
   <input type ="text" name="model" id="model" placeholder="Enter model"><br>
         </div>
         <div class="form-group">
         
         <label for="mileage">Mileage</label><br>
   <input type ="text" name="mileage" id="mileage" placeholder="Enter mileage"><br>
        </div>
      
           <div class="form-group">
           <label for="style">Style</label><br>
   <input type ="text" name="style" id="style" placeholder="Enter style"><br>
           </div>
           <div class="form-group">
           <label for="condition">Condition</label><br>
   <input type ="text" name="condition" id="condition" placeholder="Enter condition"><br>
          </div>
          <div class="form-group">
           <label for="color">Color</label><br>
   <input type ="text" name="color" id="color" placeholder="Enter color"><br>
   </div>
   <div class="form-group">
           <label for="pic">Photo</label><br>
   <input type ="text" name="pic" id="color" placeholder=""><br>
   </div>
       <div class="form-group">
         <label for="price">Price</label><br>
   <input type ="text" name="price" id="price" placeholder="Enter price"><br>
           </div>
         <div class ="from-group">

<button type ="submit" class="btn btn-default">Submit</button>
    </div>
</form>
</header>
</body>
</html>