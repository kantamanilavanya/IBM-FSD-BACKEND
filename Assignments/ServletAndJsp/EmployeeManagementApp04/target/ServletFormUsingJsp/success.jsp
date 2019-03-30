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
<body>
<div align="center" class="container">
	<h2 align="center">EMPLOYEE LANDING PAGE</h2>
	<h3 align="right">
		Welcome:<%
		out.println(session.getAttribute("userName"));
	%>
	</h3>
	

	
		<a href="addEmployee.jsp" class="btn btn-info">Add Employee Data</a><br> <br> <a
			href="listEmployee.jsp" class="btn btn-info">List Employee Data</a><br> <br> <a
			href="index.jsp" class="btn btn-info">HomePage</a><br> <br>
	</div>

</body>
</html>