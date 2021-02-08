<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Inserting data into memory H2</title>
</head>
<body>
	
	<form action = "addAlien">
  <label for="fname">Enter Your Name:</label><br><br>
  <input type="text" id="name" name="name" placeholder="Soumyadeep"><br><br><br> <br>
  <label for="lname">Enter Your ID:</label><br> <br>
  <input type="number" id="id" name="id" placeholder="ID"><br><br><br>
  <input type="submit" value="Submit">
</form> 

<br><br><br><br><br>

<form action = "getAlien">
  <label for="fname">Enter the ID to search:</label><br><br>
  <input type="number" id="id" name="id" placeholder="eg. 1,2,3"><br>
  <br><br>
  <input type="submit" value="Submit">
  </form>

</body>
</html>