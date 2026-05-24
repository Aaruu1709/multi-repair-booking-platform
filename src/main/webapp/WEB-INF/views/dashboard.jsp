<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">

<title>User Dashboard</title>

</head>

<body>

<h1>Repair Booking Form</h1>
<br><br>
<a href="myBookings">view my Bookings</a>

<form action="booking" method="post">

    <label>Customer Name:</label>
    <input type="text" name="customerName" required>

    <br><br>

    <label>Mobile Number:</label>
    <input type="text" name="mobile" required>

    <br><br>

    <label>Address:</label>

    <br>

    <textarea name="address" rows="4" cols="30" required></textarea>

    <br><br>

    <label>Select Device Type:</label>

    <select name="deviceType">

        <option value="Mobile">Mobile</option>

        <option value="Laptop">Laptop</option>

        <option value="Car">Car</option>

        <option value="Cycle">Cycle</option>

    </select>

    <br><br>

    <label>Problem Description:</label>

    <br>

    <textarea name="problem" rows="5" cols="40" required></textarea>

    <br><br>

    <input type="submit" value="Book Repair">

</form>

<br><br>

<a href="logout">Logout</a>

</body>

</html>