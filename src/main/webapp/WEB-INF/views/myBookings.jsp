<%@ page language="java"
contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<%@ taglib prefix="c"
uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">

<title>My Bookings</title>

</head>

<body>

<h1>My Repair Bookings</h1>

<table border="1" cellpadding="10">

<tr>

    <th>ID</th>

    <th>Device</th>

    <th>Problem</th>

    <th>Status</th>

</tr>

<c:forEach var="b" items="${bookings}">

<tr>

    <td>${b.id}</td>

    <td>${b.deviceType}</td>

    <td>${b.problem}</td>

    <td>${b.bookingStatus}</td>

</tr>

</c:forEach>

</table>

<br><br>

<a href="dashboard">Back to dashbord</a>

</body>

</html>