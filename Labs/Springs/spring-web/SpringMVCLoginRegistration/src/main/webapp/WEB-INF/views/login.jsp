<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<style>
label{
font-size:20px;
text-align:left;}
input {
	width: 350px;
	height: 30px;
	font-size:15px;
}
div{
display:block;}
</style>
</head>
<body>
<div align="center">
<h2 align="center">EMPLOYEE LOGIN PAGE</h2>
<form action="logins" method="post">
<label>Enter userName:</label><div><input type="text" name="userName" /></div><br>
<label>Enter password:</label><div><input type="password" name="password" /></div><br>
<p><input type="submit" value="login"/></p>
</form>
</div>
</body>
</html>