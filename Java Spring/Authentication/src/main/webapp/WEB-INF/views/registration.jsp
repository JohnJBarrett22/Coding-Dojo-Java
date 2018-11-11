<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/css/main.css">
<title>Registration Page</title>
</head>
<body>
	<h1>Register!</h1>   
	<form:form method="post" action="/register" modelAttribute="userObj">
		<p>
			<form:label path="email">Email:</form:label>
			<form:input type="email" path="email"/>
		</p>
		<p>
			<form:label path="password">Password:</form:label>
			<form:password path="password"/>
		</p>
		<p>
			<form:label path="passwordConfirmation">Password Confirmation:</form:label>
			<form:password path="passwordConfirmation"/>
		</p>
		<input type="submit" value="Register!"/>
	</form:form>
	<p><form:errors path="userObj.*"/></p>
    <p><c:out value="${error}" /></p>
</body>
</html>