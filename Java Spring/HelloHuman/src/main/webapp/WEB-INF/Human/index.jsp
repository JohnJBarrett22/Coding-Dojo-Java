<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello Human</title>
</head>
<body>
	<h1>Hello <c:out value="${name}"/>!</h1>
	<h2>Welcome to SpringBoot!</h2>
</body>
</html>