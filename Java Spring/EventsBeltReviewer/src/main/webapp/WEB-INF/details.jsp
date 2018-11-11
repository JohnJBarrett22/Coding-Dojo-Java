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
<title><c:out value="${event.name}"/></title>
</head>
<body>
	<div id="top">
		<h1 class="fltleft"><c:out value="${event.name}"/></h1>
		<a class="fltright" href="/logout"><h2>Logout</h2></a>
	</div>
	<div id="container">
		<div id="lftpnl">
			<h3>Host: <c:out value="${event.user.firstName}"/> <c:out value="${event.user.lastName}"/></h3>
			<h3>Date: <fmt:formatDate pattern ="MMMM dd, yyyy" value ="${event.date}"/></h3>
			<h3>Location: <c:out value="${event.location}"/>, <c:out value="${event.state}"/></h3>
			<h3>People who are attending this event: <c:out value="${event.joinedUsers.size()}"/></h3>
			<table class="table table-striped table-bordered table-hover">
				<thead>
	  				<tr>
	    				<th scope="col">Name</th>
					    <th scope="col">Location</th>
	  				</tr>
				</thead>
				<tbody>
  					<c:forEach items="${attendees}" var="attendee">
		  				<tr>
					    	<td><c:out value="${attendee.firstName}"/> <c:out value="${attendee.lastName}"/></td>
					    	<td><c:out value="${attendee.location}"/></td>
						<tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		<div id="rghtpnl">
			<h2>Message Wall</h2>
			<div id="commentbox">
                <c:forEach items="${messages}" var="msg">
                    <p>${msg.user.firstName} says: ${msg.message}</p>
                    <p>--*--*--*--*--*--*--</p>
                </c:forEach>
            </div>
                <form:form method="post" action="/events/addmsg" modelAttribute="messageObj">
                	<h5>
                		<form:input cssClass="txtbox" type="textarea" path="message"/>
					</h5>
					<form:hidden path="user" value="${user.id}"/>
					<form:hidden path="event" value="${event.id}"/>
			   		<input class="btn" type="submit" value="Submit">          
                </form:form>
               	<form:errors cssClass="red" path="message.*"/>
		</div>
	</div>
</body>
</html>