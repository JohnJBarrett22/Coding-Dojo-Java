<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<link rel="stylesheet" href="/css/main.css">
<title>Details</title>
</head>
<body>
	<div class="container">
		<div class="top1">
			<a href="/dashboard"><h2 class="right">Dashboard</h2></a>
		</div>
		<h2>Title:  <c:out value="${song.title}"/></h2>
		<h2>Artist:  <c:out value="${song.artist}"/></h2>
		<h2>Rating (1-10):  <c:out value="${song.rating}"/></h2>
		<a href="/delete/<c:out value="${song.id}"/>"><h2>Delete</h2></a>
	</div>
</body>
</html>