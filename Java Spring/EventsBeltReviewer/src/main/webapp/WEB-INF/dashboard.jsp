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
<title>Events</title>
</head>
<body>
	<div id="container">
		<h1 class="fltleft">Welcome, <c:out value="${user.firstName}"/></h1>
		<a class="fltright" href="/logout"><h2>Logout</h2></a>
		<h2>Here are some of the events in your state:</h2>
		<c:if test="${instate.size() == 0}"><h5>There are currently no events in your area...</h5></c:if>
        <c:if test="${instate.size() > 0}">
			<table class="table table-striped table-bordered table-hover">
				<thead>
	  				<tr>
	    				<th scope="col">Name</th>
					    <th scope="col">Date</th>
					    <th scope="col">Location</th>
					    <th scope="col">Host</th>
					    <th scope="col">Action/Status</th>
	  				</tr>
				</thead>
				<tbody>
					<c:forEach items="${instate}" var="in">
	  				<tr>
	  					<td><a href="/events/${in.id}"><c:out value="${in.name}"/></a></td>
					    <td><fmt:formatDate pattern ="MMMM dd, yyyy" value ="${in.date}"/></td>
					    <td><c:out value="${in.location}"/></td>
					    <td><c:out value="${in.user.firstName}"/></td>
                        <c:choose>
                        <c:when test="${in.user == user}">
                            <td>*Attending* | <a href="/events/${in.id}/edit">Edit</a> | <a href="events/${in.id}/delete">Delete</a></td>
                        </c:when>
                        <c:otherwise>
                            <c:set var="attending" value="${false}"/>
                            <c:forEach items="${in.getJoinedUsers()}" var="attendee">
                                <c:if test="${attendee == user}">
                                    <c:set var="attending" value="${true}"/>
                                </c:if>
                            </c:forEach>
                            <c:choose>
                                <c:when test="${attending == false}">
                                    <td><a href="/events/${in.id}/join">Join</a></td>
                                </c:when>
                                <c:otherwise>
                                    <td>*Attending* | <a href="events/${in.id}/cancel">Cancel</a></td>
                                </c:otherwise>
                            </c:choose>
                        </c:otherwise>
                        </c:choose>  
	  				</tr>
	  				</c:forEach>
				</tbody>
			</table>
		</c:if>
		<h2>Here are some of the events in other states:</h2>
		<table class="table table-striped table-bordered table-hover">
			<thead>
  				<tr>
    				<th scope="col">Name</th>
				    <th scope="col">Date</th>
				    <th scope="col">Location</th>
				    <th scope="col">State</th>
				    <th scope="col">Host</th>
				    <th scope="col">Action</th>
  				</tr>
			</thead>
			<tbody>
				<c:forEach items="${outofstate}" var="out">
  				<tr>
  					<td><a href="/events/${out.id}"><c:out value="${out.name}"/></a></td>
				    <td><fmt:formatDate pattern ="MMMM dd, yyyy" value ="${out.date}"/></td>
				    <td><c:out value="${out.location}"/></td>
				    <td><c:out value="${out.state}"/></td>
				    <td><c:out value="${out.user.firstName}"/></td>
					<c:choose>
                        <c:when test="${out.user == user}">
                            <td>*Attending* | <a href="/events/${out.id}/edit">Edit</a> | <a href="events/${out.id}/delete">Delete</a></td>
                        </c:when>
                        <c:otherwise>
                            <c:set var="attending" value="${false}"/>
                            <c:forEach items="${out.getJoinedUsers()}" var="goer">
                                <c:if test="${goer == user}">
                                    <c:set var="attending" value="${true}"/>
                                </c:if>
                            </c:forEach>
                            <c:choose>
                                <c:when test="${attending == false}">
                                    <td><a href="/events/${out.id}/join">Join</a></td>
                                </c:when>
                                <c:otherwise>
                                    <td>*Attending* | <a href="events/${out.id}/cancel">Cancel</a></td>
                                </c:otherwise>
                            </c:choose>
                        </c:otherwise>
                    </c:choose>
  				</tr>
  				</c:forEach>
			</tbody>
		</table>
		<div id="lftpnl">
			<h2>Create an Event:</h2>
			<form:form method="post" action="/addevent" modelAttribute="eventObj">
				<h4 class="avoid">
					<form:label path="name">Name:</form:label>
					<form:input cssClass="fields" type="text" path="name"/>
				</h4>
				<h4 class="avoid">
					<form:label path="date">Date:</form:label>
					<form:input cssClass="fields" type="date" path="date"/>
				</h4>
				<h4 class="avoid">
					<form:label path="location">Location:</form:label>
					<form:select cssClass="state" path="state">
						<c:forEach items="${states}" var="state">
							<form:option value="${state}"><c:out value="${state}"/></form:option>
						</c:forEach>
					</form:select>
					<form:input cssClass="smfields" type="text" path="location"/>
				</h4>
				<form:hidden path="user" value="${user.id}"/>
				<input class="btn" type="submit" value="Create"/>
			</form:form>
			<form:errors cssClass="red" path="eventObj.*"/>
		</div>
		<div id="rghtpnl">
		</div>
	</div>
</body>
</html>