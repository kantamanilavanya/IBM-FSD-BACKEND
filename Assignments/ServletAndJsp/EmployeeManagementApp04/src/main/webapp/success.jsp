<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<title>Insert title here</title>

</head>
<body><br>
<p align="right">
		Welcome:<%
		out.println(session.getAttribute("userName"));
	%>
	<p>
<div align="center" class="container">
<form action="./delete" class="form-horizontal">

	<div class="alert  btn-primary">
  <h4>EMPLOYEE MANAGEMENT LANDING PAGE</h4>
</div>
<br>
	
	
	

	
		<a href="addEmployee.jsp" class="btn btn-info btn-lg">Add Employee Data</a><br> <br> <a
			href="listEmployee.jsp" class="btn btn-danger btn-lg">List Employee Data</a><br> <br> <a
			href="index.jsp" class="btn btn-warning btn-lg">Back To HomePage</a><br> <br>
	
	</form>
</div>
</body>
</html>