<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
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
	<h1 align="center">Add Employee Form</h1>
	<div align="center">
		<form action="add.do" method="POST">
<div>
				<input type="text" name="employeeName"
					placeholder="Enter EmployeeName" />
			</div>
			<br>
			<div>
				<input type="date" name="DOB" placeholder="select DOB" />
			</div>
			<br><div>
				<input type="text" name="designation"
					placeholder="Enter Designation" />
			</div>
			<br>
			<div>
				<input type="email" name="emailId" placeholder="Enter Email" />
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
				<input type="text" name="department" placeholder="Enter Department" />
			</div>
			<br><div>
				<input type="number" name="salary" placeholder="Enter salary" />
			</div>
			<br>
			<div>
				<input type="radio" name="gender" value="male" class="input">
				Male <input type="radio" name="gender" value="female" class="input">
				Female 
				</div>
			<br> <input type="submit" value="submit" class="button" />
			<button type="reset" class="button">RESET</button>

		</form><br>
		<a href="success.jsp">HomePage</a>
	</div>
</body>
</html> --%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->
</head>
<body>
<div class="container">
	<div class="row justify-content-center">
		<div class="col-md-8">
			<div class="card">
				<div class="card-header bg-danger text-white" align="center"><h3>ADD EMPLOYEE PAGE</h3></div>
				<div class="card-body">


					<form class="form-horizontal" method="post" action="add.do">
						
						<div class="form-group">
							<label for="employeeName" class="cols-sm-2 control-label">Employee
								Name</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-user fa"
										aria-hidden="true"></i></span> <input type="text"
										class="form-control" name="employeeName"
										id="employeeName" placeholder="Enter your Name" />
								</div>
							</div>
						</div>
						
						<div class="form-group">
							<label for="DOB" class="cols-sm-2 control-label"> DOB </label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-user fa"
										aria-hidden="true"></i></span> <input type="date"
										class="form-control" name="DOB" id="DOB"
										placeholder="Enter your DOB" />
								</div>
							</div>
						</div>
						<div class="form-group">
							<label for="emailId" class="cols-sm-2 control-label">Your
								Email</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i
										class="fa fa-envelope fa" aria-hidden="true"></i></span> <input
										type="text" class="form-control" name="emailId" id="emailId"
										placeholder="Enter your Email" />
								</div>
							</div>
						</div>
						<div class="form-group">
							<label for="city" class="cols-sm-2 control-label">Select
								City </label>
							<div class="cols-sm-10">
								<div class="input-group">
									<select class="form-control" name="city" id="sel1">
										<option value="Bangalore">Bangalore</option>
										<option value="Chennai">Chennai</option>
										<option value="Hyderabad">Hyderabad</option>
										<option value="Mumbai">Mumbai</option>
									</select>
								</div>
							</div>
						</div>
						<div class="form-group">
							<label for="designation" class="cols-sm-2 control-label">
								Designation</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-user fa"
										aria-hidden="true"></i></span> <input type="text"
										class="form-control" name="designation"
										id="designation" placeholder="Enter your Designation" />
								</div>
							</div>
						</div>
						
						<div class="form-group">
							<label for="department" class="cols-sm-2 control-label">Department</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i
										class="fa fa-lock fa-lg" aria-hidden="true"></i></span> <input
										type="text" class="form-control" name="department"
										id="department" placeholder="Enter your Department" />
								</div>
							</div>
						</div>
						<div class="form-group">
							<label for="salary" class="cols-sm-2 control-label">Salary</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i
										class="fa fa-lock fa-lg" aria-hidden="true"></i></span> <input
										type="number" class="form-control" name="salary"
										id="salary" placeholder="Enter your Salary" />
								</div>
							</div>
						</div>
						<div class="form-group">
							<label for="gender" class="cols-sm-2 control-label">Gender</label>
							<div class="cols-sm-10">
								<div class="radio">
									<label><input type="radio" name="gender" value="male"> Male</label>

									<label><input type="radio" name="gender" value="female">
										Female</label>
								</div>

							</div>
						</div>

						<div class="form-group " align="center">
							<input type="submit" value="Add Employee"
								class="btn btn-primary  login-button" />
								<a
			href="success.jsp" class="btn btn-warning">HomePage</a><br> <br>
						</div>

					</form>
				</div>

			</div>
		</div>
	</div>
</div>
</body></html>