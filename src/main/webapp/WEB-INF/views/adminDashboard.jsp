<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c"
uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">

<title>Admin Dashboard</title>

</head>

<body>

<h1>Admin Dashboard</h1>

<table border="1" cellpadding="10">

<tr>

    <th>ID</th>

    <th>Customer Name</th>

    <th>Mobile</th>

    <th>Address</th>

    <th>Device Type</th>

    <th>Problem</th>

    <th>Status</th>

    <th>Update</th>

    <th>Delete</th>

</tr>

<c:forEach var="b" items="${bookings}">

<tr>

    <td>${b.id}</td>

    <td>${b.customerName}</td>

    <td>${b.mobile}</td>

    <td>${b.address}</td>

    <td>${b.deviceType}</td>

    <td>${b.problem}</td>

    <td>${b.bookingStatus}</td>

    <td>

        <a href="updateStatus?id=${b.id}">

        Complete

        </a>

    </td>

    <td>

        <a href="deleteBooking?id=${b.id}">

        Delete

        </a>

    </td>

</tr>

</c:forEach>

</table>

</body>

</html>