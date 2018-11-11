<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<link rel="stylesheet" href="/css/main.css">
<title>Top Ten Songs</title>
</head>
<body>
	<div class="container">
		<div class="top1">
			<h2 class="left">Top Ten Songs:</h2>
			<a href="/dashboard"><h2 class="right">Dashboard</h2></a>
		</div>
		<ul>
			<c:forEach items="${songs}" var="song">
				<li>
					<h2><c:out value="${song.rating}"/> - <a href="/songs/${song.id}"><c:out value="${song.title}"/></a> - <c:out value="${song.artist}"/></h2>
				</li>
			</c:forEach>
		</ul>
	</div>
</body>
</html>