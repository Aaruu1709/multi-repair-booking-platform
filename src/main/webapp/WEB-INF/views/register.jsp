<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>User Registration</title>

<style>

    body{
        margin:0;
        padding:0;
        font-family: Arial, sans-serif;
        background: linear-gradient(to right, #141e30, #243b55);
        height:100vh;
        display:flex;
        justify-content:center;
        align-items:center;
    }

    .register-container{
        background:white;
        padding:40px;
        width:400px;
        border-radius:12px;
        box-shadow:0px 0px 15px rgba(0,0,0,0.3);
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
    input[type="email"],
    input[type="password"],
    textarea{
        width:100%;
        padding:10px;
        margin-top:8px;
        margin-bottom:20px;
        border:1px solid #ccc;
        border-radius:6px;
        font-size:15px;
        box-sizing:border-box;
    }

    textarea{
        resize:none;
        height:80px;
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

<div class="register-container">

    <h1>User Registration</h1>

    <form action="register" method="post">

        <label>Name</label>
        <input type="text" name="name" placeholder="Enter Full Name">

        <label>Email</label>
        <input type="email" name="email" placeholder="Enter Email">

        <label>Password</label>
        <input type="password" name="password" placeholder="Enter Password">

        <label>Mobile</label>
        <input type="text" name="mobile" placeholder="Enter Mobile Number">

        <label>Address</label>
        <textarea name="address" placeholder="Enter Address"></textarea>

        <input type="submit" value="Register">

    </form>

</div>

</body>
</html>