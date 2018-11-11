<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<link rel="stylesheet" href="/css/main.css">
<title>Search</title>
</head>
<body>
	<Div class="container">
		<div class="top">
			<h2 class="left">Songs by artist: <c:out value="${artist}"/></h2>
			<div class="formright">
				<form action="/search" method="post">
					<input class="form2" type="search" name="artist" placeholder="Artist">
					<input class="form2" type="submit" value="New Search">
				</form>
				<a href="/dashboard"><h2 class="right2">Dashboard</h2></a>
			</div>
		</div>
		<table class="table table-striped table-hover table-bordered tblbrd blkbrd">
		    <thead>
		        <tr>
		            <th scope="col">Title</th>
		            <th scope="col">Rating</th>
		            <th scope="col">Action</th>
		        </tr>
		    </thead>
		    <tbody>
		        <c:forEach items="${songs}" var="song">
		        <tr>
		            <td><a href="songs/<c:out value="${song.id}"/>"><c:out value="${song.title}"/></a></td>
		            <td><c:out value="${song.rating}"/></td>
		            <td><a href="/delete/<c:out value="${song.id}"/>">Delete</a></td>
		        </tr>
		        </c:forEach>
		    </tbody>
		</table>
	</Div>
</body>
</html>