<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">

<title>User Dashboard</title>

<style>

    *{
        margin:0;
        padding:0;
        box-sizing:border-box;
        font-family: Arial, sans-serif;
    }

    body{
        background:#f4f6f9;
    }

    /* Navbar */

    .navbar{
        width:100%;
        background:#243b55;
        color:white;
        display:flex;
        justify-content:space-between;
        align-items:center;
        padding:18px 40px;
        box-shadow:0px 2px 10px rgba(0,0,0,0.2);
    }

    .logo{
        font-size:28px;
        font-weight:bold;
    }

    .nav-links a{
        text-decoration:none;
        color:white;
        margin-left:25px;
        font-size:17px;
        transition:0.3s;
    }

    .nav-links a:hover{
        color:#00c6ff;
    }

    /* Main Container */

    .container{
        width:500px;
        background:white;
        margin:50px auto;
        padding:40px;
        border-radius:12px;
        box-shadow:0px 0px 15px rgba(0,0,0,0.2);
    }

    h1{
        text-align:center;
        color:#243b55;
        margin-bottom:30px;
    }

    label{
        font-weight:bold;
        color:#333;
    }

    input[type="text"],
    textarea,
    select{
        width:100%;
        padding:10px;
        margin-top:8px;
        margin-bottom:20px;
        border:1px solid #ccc;
        border-radius:6px;
        font-size:15px;
    }

    textarea{
        resize:none;
    }

    input[type="submit"]{
        width:100%;
        padding:12px;
        background:#243b55;
        color:white;
        border:none;
        border-radius:6px;
        font-size:16px;
        cursor:pointer;
        transition:0.3s;
    }

    input[type="submit"]:hover{
        background:#141e30;
    }

</style>

</head>

<body>

<!-- Navbar -->

<div class="navbar">

    <div class="logo">
        Multi-Repair Platform
    </div>

    <div class="nav-links">

        <a href="dashboard">Home</a>
        <a href="myBookings">My Bookings</a>
        <a href="profile">Profile</a>
        <a href="logout">Logout</a>

    </div>

</div>

<!-- Booking Form -->

<div class="container">

    <h1>Repair Booking Form</h1>

    <form action="booking" method="post">

        <label>Customer Name</label>
        <input type="text" name="customerName" required>

        <label>Mobile Number</label>
        <input type="text" name="mobile" required>

        <label>Address</label>
        <textarea name="address" rows="4" required></textarea>

        <label>Select Device Type</label>

        <select name="deviceType">

            <option value="Mobile">Mobile</option>
            <option value="Laptop">Laptop</option>
            <option value="Car">Car</option>
            <option value="Cycle">Cycle</option>

        </select>

        <label>Problem Description</label>

        <textarea name="problem" rows="5" required></textarea>

        <input type="submit" value="Book Repair">

    </form>

</div>

</body>

</html>