<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta charset="utf-8">
  
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<title>Employee Management App</title>
<spring:url value="/" var="contextPath" htmlEscape="true" />
</head>
<body>
<br><br>
<div align="center" class="container">
<div class="alert  btn-primary">
  <h3>Welcome to Employee Management App</h3>
</div>
<br><br>
	
	
	 <a href="${contextPath}/registerController/registerp" class="btn btn-warning btn-lg"> Employee Registration Form</a><br><br>
	 <a href="${contextPath}/loginController/login" class="btn btn-danger btn-lg">Employee Login Form</a><br>
	 
	 </div>
</body>
</html>
