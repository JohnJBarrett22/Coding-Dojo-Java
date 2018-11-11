<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Collections"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
<link rel="stylesheet" href="css/main.css">
<title>Ninja Gold</title>
</head>
<body>
	<div id="container">
        <div id="header">
            <h2 id="counter">Your Gold: <c:out value="${gold}"/></h2>
            <a id="link" href="/reset"><h1 id="ninjagold">Ninja Gold</h1></a>
        </div>
        <div id="forms">
            <form class="form" action="/process" method="post">
                <h2 id="location">Farm</h2>
                <img src="/images/farm.jpg" alt="Picture of a farm">
                <h3 id="desc">(earns 10-20 golds)</h3>
                <input type="hidden" name="building" value="farm">
                <button type="submit" class="btn btn-warning">Find Gold!</button>
            </form>
            <form class="form" action="/process" method="post">
                <h2 id="location">Cave</h2>
                <img src="/images/cave.jpg" alt="Picture of a cave">
                <h3 id="desc">(earns 5-10 golds)</h3>
                <input type="hidden" name="building" value="cave">
                <a href='/process_money'><button type="submit" class="btn btn-warning">Find Gold!</button></a>
            </form>
            <form class="form" action="/process" method="post">
                <h2 id="location">House</h2>
                <img src="/images/house.jpeg" alt="Picture of a house">
                <h3 id="desc">(earns 2-5 golds)</h3>
                <input type="hidden" name="building" value="house">
                <a href='/process_money'><button type="submit" class="btn btn-warning">Find Gold!</button></a>
            </form>
            <form class="form" action="/process" method="post">
                <h2 id="location">Casino</h2>
                <img src="/images/casino.png" alt="Picture of a casino">
                <h3 id="desc">(earns/takes 0-50 golds)</h3>
                <input type="hidden" name="building" value="casino">
                <a href='/process_money'><button type="submit" class="btn btn-warning">Find Gold!</button></a>
            </form>
        </div>
        <div id="output">
  			<ul>
		        <% if(session.getAttribute("activities") != null){ %>
       			<% ArrayList<String> activities = (ArrayList<String>) session.getAttribute("activities"); %>
       			<% for(int i = 0; i < activities.size(); i++) { %>
       			<% if(activities.get(i).contains("lost")) { %>
       				<li style = "color: red;"><%= activities.get(i) %></li>
       			<% } else { %>
       				<li style = "color: green;"><%= activities.get(i) %></li>
       			<% } %>
       			<% } %>
       			<% } %>
        	</ul>
        </div>
    </div>
</body>
</html>