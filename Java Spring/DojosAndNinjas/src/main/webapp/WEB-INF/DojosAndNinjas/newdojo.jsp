<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/css/main.css">
<title>New Dojo</title>
</head>
<body>
	<div id="container">
		<div id="leftpanel">
			<h1>New Dojo</h1>
			<form:form action="/adddojo" method="post" modelAttribute="dojoObject">		  
			    <h2>
			        <form:label cssClass="label left" path="name">Name:</form:label>
			        <form:input cssClass="box" path="name"/>
			    </h2>
			    <input id="btn" type="submit" value="Create"/>	 
			</form:form>
		</div>
		<div id="rightpanel">
		<form:errors cssClass="red" path="dojoObject.*"/>
		</div>
	</div>
</body>
</html>