<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<link rel="stylesheet" href="/css/main.css">
<title><c:out value="${language.name}"/></title>
</head>
<body>
	<div id="container">
	<div id="top">
		<a href="/languages"><h1 class="shift">Dashboard</h1></a>
	</div>
		<h1 class="gap"><c:out value="${language.name}"/></h1>
		<h1 class="gap"><c:out value="${language.creator}"/></h1>
		<h1 class="gap"><c:out value="${language.currentVersion}"/></h1>
		<a href="/languages/edit/<c:out value="${language.id}"/>"><h1 class="gap">Edit</h1></a>
		<a href="/languages/delete/<c:out value="${language.id}"/>"><h1 class="gap">Delete</h1></a>
	</div>
</body>
</html>