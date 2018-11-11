<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<link rel="stylesheet" href="/css/main.css">
<title>New Dojo</title>
</head>
<body>
	<div id="container">
		<h1><c:out value="${dojo.name}"/> Ninjas</h1>
		<table class="table table-striped table-dark table-hover ">
			<thead>
				<tr>
			    	<th scope="col">First Name</th>
			      	<th scope="col">Last Name</th>
			      	<th scope="col">Age</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${dojo.ninjas}" var="ninja">
				<tr>
				    <td><c:out value="${ninja.firstName}"/></td>
				    <td><c:out value="${ninja.lastName}"/></td>
				    <td><c:out value="${ninja.age}"/></td>
				 </tr>
				 </c:forEach>
			 </tbody>
		</table>
	</div>
</body>
</html>