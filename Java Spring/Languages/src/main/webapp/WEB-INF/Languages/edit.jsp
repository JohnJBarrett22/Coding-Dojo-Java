<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
		<a href="/languages/delete/<c:out value="${language.id}"/>"><h1 class="shift">Delete</h1></a>
	</div>
		<form:form action="/languages/${language.id}" method="post" modelAttribute="language">
		    <input type="hidden" name="_method" value="put">
			    <p>
			        <form:label cssClass="label" path="name">Name</form:label>
			        <form:input cssClass="box" path="name"/>
			        <form:errors cssClass="red" path="name"/>

			    </p>
			    <p>
			        <form:label cssClass="label" path="creator">Creator</form:label>
			        <form:input cssClass="box" path="creator"/>
    				<form:errors cssClass="red" path="creator"/>
			    </p>
			    <p>
			        <form:label cssClass="label" path="currentVersion">Version</form:label>
			        <form:input cssClass="box" path="currentVersion"/>
     		 		<form:errors cssClass="red" path="currentVersion"/>
			    </p>
		    <input id="btn" type="submit" value="Submit"/>
		</form:form>
	</div>
</body>
</html>