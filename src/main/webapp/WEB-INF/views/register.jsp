<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
</head>
<body>
<h1>user regisration</h1>
<form action="register" method="post">

 Name:
    <input type="text" name="name">
    <br><br>

    Email:
    <input type="email" name="email">
    <br><br>

    Password:
    <input type="password" name="password">
    <br><br>

    Mobile:
    <input type="text" name="mobile">
    <br><br>

    Address:
    <textarea name="address"></textarea>
    <br><br>

    <input type="submit" value="Register">
</form>

</body>
</html>