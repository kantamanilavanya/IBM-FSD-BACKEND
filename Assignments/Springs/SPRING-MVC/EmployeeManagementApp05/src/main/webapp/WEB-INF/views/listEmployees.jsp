<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta charset="ISO-8859-1">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<title>Employees List</title>
</head>

<spring:url value="/" var="contextPath" htmlEscape="true" />


<body class="container"><br><br>
<div class="alert  btn-danger btn-lg">
  <h4 align="center">LIST EMPLOYEE PAGE</h4>
</div>
<br><br>
	<div  align="center">
	

	<table class="table table-bordered table-striped ">
		<tr class="table table-primary ">
			<th>Name</th>
			<th>Age</th>
			<th>Gender</th>
			<th>Contractor</th>
			<th>Skills</th>
			<th>Designation</th>
			<th>Department</th>
			<th>Address</th>
			<th>Country</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>

		<c:if test="${empty empList}">
			<tr>
				<td colspan="11" align="center">No record found to display.</td>
			</tr>
		</c:if>

		<c:forEach var="emp" items="${empList}">
			<tr>
				<td>${emp.name}</td>
				<td>${emp.age}</td>
				<td>${emp.gender}</td>
				<td>${emp.contractor ? "Yes" : "No"}</td>
				<td>${emp.skills}</td>
				<td>${emp.designation}</td>
				<td>${emp.department}</td>
				<td>${emp.address}</td>
				<td>${emp.country}</td>
				<td><a href="${contextPath}/employee/update/${emp.id}">Edit</a></td>
				<td><a href="${contextPath}/employee/delete/${emp.id}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
	<br />

</div >
<div align="center">
	<a href="${contextPath}/employee" class="btn btn-primary"> Add New Employee</a> &nbsp;&nbsp;
	<a href="${contextPath}/loginController/logout" class="btn btn-danger">Logout</a>
</div>
</body>
</html>