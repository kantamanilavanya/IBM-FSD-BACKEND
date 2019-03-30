
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
<title>Update Employee Form</title>
</head>
<body>
<div class="container">
	<div class="row justify-content-center">
		<div class="col-md-8">
			<div class="card">
				<div class="card-header bg-danger text-white" align="center"><h3>UPDATE EMPLOYEE PAGE</h3></div>
				<div class="card-body">


					<form class="form-horizontal" method="post" action="update?id=<%=request.getParameter("id") %>">
						
						<div class="form-group">
							<label for="employeeName" class="cols-sm-2 control-label">Employee
								Name</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-user fa"
										aria-hidden="true"></i></span> <input type="text"
										class="form-control" name="employeeName" value="<%=request.getParameter("name")%>"
										id="employeeName" />
								</div>
							</div>
						</div>
						
						<div class="form-group">
							<label for="DOB" class="cols-sm-2 control-label"> DOB </label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-user fa"
										aria-hidden="true"></i></span> <input type="date"
										class="form-control" name="DOB" id="DOB" value="<%=request.getParameter("date")%>"
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
										type="text" class="form-control" name="emailId" id="emailId" value="<%=request.getParameter("emailId")%>"
										placeholder="Enter your Email"  />
								</div>
							</div>
						</div>
						<div class="form-group">
							<label for="city" class="cols-sm-2 control-label">Select
								City </label>
							<div class="cols-sm-10">
								<div class="input-group">
									<select class="form-control" name="city" >
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
										class="form-control" name="designation" value="<%=request.getParameter("designation")%>"
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
										type="text" class="form-control" name="department" value="<%=request.getParameter("department")%>"
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
										type="number" class="form-control" name="salary" value="<%=request.getParameter("salary")%>"
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
							<input type="submit" value="Update Employee"
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