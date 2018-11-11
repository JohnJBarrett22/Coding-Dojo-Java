<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/main.css">
<title>Survey Results</title>
</head>
<body>
	<div id="container">
		<h2>Submitted Info</h2>
		<h2 class="push">Name: <c:out value="${name}"/></h2>
		<h2 class="push">Dojo Location: <c:out value="${location}"/></h2>
		<h2 class="push">Favorite Language: <c:out value="${language}"/></h2>
		<h2 class="push">Comment: <c:out value="${comment}"/></h2>
	</div>
</body>
</html>