<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="assets/css/main.css">
<title>Button Clicker</title>
</head>
<body>
	<div id="container">
		<a href="/ButtonClicker/Counter"><button>Click Me!</button></a>
		<h1>You have clicked the button <c:out value="${count}"/> time(s)!</h1>
	</div>
</body>
</html>