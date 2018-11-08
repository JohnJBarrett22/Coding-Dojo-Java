<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Your Dog!</title>
</head>
<body>
	<h3>You created a <c:out value="${dog.breed}"/>!</h3>
	<c:out value="${dog.showAffection()}"/>
</body>
</html>