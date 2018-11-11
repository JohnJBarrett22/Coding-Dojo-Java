<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<link rel="stylesheet" href="/css/main.css">
<title>Questions Dashboard</title>
</head>
<body>
	<div id="container">
		<h1>Questions Dashboard</h1>
		<table class="table table-striped table-bordered table-hover dark">
			<thead>
				<tr>
					<th scope="col">Question</th>
					<th scope="col">Tags</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>Mark</td>
					<td>Otto</td>
				</tr>
			</tbody>
		</table>
		<a href="/questions/new"><h3 class="shiftright">New Question</h3></a>
	</div>
</body>
</html>