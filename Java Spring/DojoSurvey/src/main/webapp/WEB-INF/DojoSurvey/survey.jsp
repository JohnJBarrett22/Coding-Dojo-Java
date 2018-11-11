<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/main.css">
<title>Dojo Survey</title>
</head>
<body>
	<div id="container">
		<form action="/process" method="post">
			<h2>Your Name: <input class="formfields" type="text" name="name"></h2>
			<h2>Dojo Location: <select class="formfields" name="location"></h2>
				  <option value="Berkley">Berkley</option>
				  <option value="Boise">Boise</option>
				  <option value="Chicgao">Chicago</option>
				  <option value="Dallas">Dallas</option>
  				  <option value="Los Angeles">Los Angeles</option>
				  <option value="Seattle">Seattle</option>
				  <option value="Silicon Valley">Silicon Valley</option>
				  <option value="Tulsa">Tulsa</option>
  				  <option value="Tyson's Corner">Tyson's Corner</option>
				  </select>
			<h2>Favorite Language: <select class="formfields" name="language"></h2>
				  <option value="Java">Java</option>
				  <option value="Python">Python</option>
				  <option value="C#/.NET">C#/.NET</option>
				  <option value="MEAN">MEAN</option>
				  <option value="Ruby">Ruby</option>
				  <option value="iOS/Swift">iOS/Swift</option>
				  </select>
				<h2>Comment (optional):</h2>
			<h2><input class="formfieldscomment" type="textarea" name="comment"></h2>
			<h2><input class="formfieldsbutton" type="submit" value="Submit"></h2>
		</form>
	</div>
</body>
</html>