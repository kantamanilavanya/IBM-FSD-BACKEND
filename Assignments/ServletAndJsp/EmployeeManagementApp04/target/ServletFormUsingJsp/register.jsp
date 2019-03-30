<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<title>Register</title>
<style>
.note
{
    text-align: center;
    height: 80px;
    background: -webkit-linear-gradient(left, #0072ff, #8811c5);
    color: #fff;
    font-weight: bold;
    line-height: 80px;
}
.form-content
{
    padding: 5%;
    border: 1px solid #ced4da;
    margin-bottom: 2%;
}
.form-control{
    border-radius:1.5rem;
}
.btnSubmit
{
    border:none;
    border-radius:1.5rem;
    padding: 1%;
    width: 20%;
    cursor: pointer;
    background: #0062cc;
    color: #fff;
}
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
<div class="container register-form">
	<h2 align="center">EMPLOYEE REGISTRATION FORM</h2>
	<div align="center">
		
		            <div class="form">
		 <div class="note">
                    <p>This is a simpleRegister Form made using Boostrap.</p>
                </div>
                <form action="register.do" method="POST">

			<div>
				<input type="number" name="employeeId"
					placeholder="Enter EmployeeId" />
			</div>
			<br>
			<div>
				<input type="text" name="employeeFirstName"
					placeholder="Enter EmployeeFirstName" />
			</div>
			<br>

			<div>
				<input type="text" name="employeeLastName"
					placeholder="Enter EmployeeLastName" />
			</div>
			<br>
			<div>
				<input type="date" name="DOB" placeholder="select DOB" />
			</div>
			<br>

			<div>
				<input type="password" name="password" placeholder="Enter Password" />
			</div>
			<br>
			<div>
				<input type="email" name="email" placeholder="Enter Email" />
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
				<input type="checkbox" name="skills" value="java" class="input" />Java
				<input type="checkbox" name="skills1" value="Oracle" class="input" />Oracle
				<input type="checkbox" name="skills2" value="Angular" class="input" />Angular
				<input type="checkbox" name="skills3" value="ReactJS" class="input" />ReactJS

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
	</div>
	</div>
</body>
</html> --%>

<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<div class="container">
	<div class="row justify-content-center">
		<div class="col-md-8">
			<div class="card">
				<div class="card-header" align="center">Register</div>
				<div class="card-body">


					<form class="form-horizontal" method="post" action="register.do">
<div class="form-group">
							<label for="employeeId" class="cols-sm-2 control-label">Employee Id
								</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-user fa"
										aria-hidden="true"></i></span> <input type="number"
										class="form-control" name="employeeId"
										id="employeeId" placeholder="Enter your employeeId" />
								</div>
							</div>
						</div>
						<div class="form-group">
							<label for="name" class="cols-sm-2 control-label">First
								Name</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-user fa"
										aria-hidden="true"></i></span> <input type="text"
										class="form-control" name="employeeFirstName"
										id="employeeFirstName" placeholder="Enter your FirstName" />
								</div>
							</div>
						</div>
						<div class="form-group">
							<label for="name" class="cols-sm-2 control-label">Last
								Name</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-user fa"
										aria-hidden="true"></i></span> <input type="text"
										class="form-control" name="employeeLastName"
										id="employeeLastName" placeholder="Enter your LastName" />
								</div>
							</div>
						</div>
						<div class="form-group">
							<label for="DOB" class="cols-sm-2 control-label"> DOB
								</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-user fa"
										aria-hidden="true"></i></span> <input type="date"
										class="form-control" name="DOB"
										id="DOB" placeholder="Enter your DOB" />
								</div>
							</div>
						</div>
						<div class="form-group">
							<label for="email" class="cols-sm-2 control-label">Your
								Email</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i
										class="fa fa-envelope fa" aria-hidden="true"></i></span> <input
										type="text" class="form-control" name="email" id="email"
										placeholder="Enter your Email" />
								</div>
							</div>
						</div>
						<div class="form-group">
							<label for="city" class="cols-sm-2 control-label">Select City
								</label>
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
							<label for="skills" class="cols-sm-2 control-label">Select Skills</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<div class="checkbox">
      <label><input type="checkbox" name="skills" value="Java">  Java</label>
    
      <label><input type="checkbox" name="skills1" value="Angular"> Angular</label>
    
      <label><input type="checkbox"  name="skills2" value="ReactJS" > ReactJS</label>
    </div>
								</div>
							</div>
						</div>
						<div class="form-group">
							<label for="password" class="cols-sm-2 control-label">Password</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i
										class="fa fa-lock fa-lg" aria-hidden="true"></i></span> <input
										type="password" class="form-control" name="password"
										id="password" placeholder="Enter your Password" />
								</div>
							</div>
						</div>
						<div class="form-group">
							<label for="gender" class="cols-sm-2 control-label">Gender</label>
							<div class="cols-sm-10">
								<div class="radio">
  <label><input type="radio" name="gender" > Male</label>

  <label><input type="radio" name="gender"> Female</label>
</div>

							</div>
						</div>
						
						<div class="form-group ">
							<input type="submit" value="Register"
								class="btn btn-primary btn-lg btn-block login-button"/>
						</div>
						
					</form>
				</div>

			</div>
		</div>
	</div>
</div>