<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
<style>
label {
	font-size: 20px;
	text-align: left;
}

.input {
	width: 80px;
	height: 20px;
}

input, select {
	width: 350px;
	height: 30px;
	font-size: 15px;
}

.button {
	width: 150px;
	height: 40px;
}

div {
	display: block;
}
</style>
</head>
<body>
	<h1 align="center">Update Employee Form</h1>
	<div align="center">
		<form action="update?id=<%=request.getParameter("id") %>" method="POST">
<div>
				<input type="text" name="employeeName"
					placeholder="Enter EmployeeFirstName" value="<%=request.getParameter("name")%>" />
			</div>
			<br>
			<div>
				<input type="date" name="DOB" placeholder="Select DOB" value="<%=request.getParameter("date")%>" />
			</div>
			<br>
			<div>
				<input type="email" name="emailId" placeholder="Enter EmailID" value="<%=request.getParameter("emailId")%>" />
			</div>
			<br>
			<div>
				<select name="city">
				<option value="Bangalore">Bangalore</option>
				<option value="Chennai">Chennai</option>
				<option value="Hyderabad">Hyderabad</option>
				<option value="Mumbai">Mumbai</option>
				</select>
			</div>
			<br>
			<div>
				<input type="text" name="designation"
					placeholder="Enter Designation" value="<%=request.getParameter("designation")%>"/>
			</div>
			<br>
			<div>
				<input type="text" name="department" placeholder="Enter Department" value="<%=request.getParameter("department")%>" />
			</div>
			<br><div>
				<input type="number" name="salary" placeholder="Enter salary" value="<%=request.getParameter("salary")%>"/>
			</div>
			<br>
			<div>
			
				<input type="radio" name="gender" value="male" class="input">
				Male <input type="radio" name="gender" value="female" class="input">
				Female 
				</div>
			<br> <input type="submit" value="submit" class="button" />
			<button type="reset" class="button">RESET</button>

		</form>
	</div>
</body>
</html>