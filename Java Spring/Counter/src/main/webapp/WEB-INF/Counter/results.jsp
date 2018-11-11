<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/main.css">
<title>Current Visit Count</title>
</head>
<body>
	<h1>You have visited <a href="http://localhost:8080/">http://localhost:8080/</a> <c:out value="${count}"/> times.</h1>
	<a href="http://localhost:8080/"><h1>Take another visit?</h1></a>
</body>
</html>