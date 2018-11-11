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
<title>Question Details</title>
</head>
<body>
	<div id="container">
		<h1>Question</h1>
		<h2>Tags:</h2>
		<div id="leftpanel">
			<table class="table table-striped table-bordered table-hover">
				<thead>
					<tr>
						<th scope="col">Answers</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>Mark</td>
					</tr>
				</tbody>
			</table>
		</div>
		<div id="rightpanel">
		<h2>Add your answer:</h2>
				<form:form action="addanswer" method="post" modelAttribute="answerObject">
			<h2>
				<form:label cssClass="#" path="answer">Answer:</form:label>
				<form:input cssClass="#" path="answer"/>		
			</h2>
			<input id="btn" type="submit" value="Submit"/>
		</form:form>
		<form:errors cssClass="red" path="answerObject.*"/>
		</div>
	</div>
</body>
</html>