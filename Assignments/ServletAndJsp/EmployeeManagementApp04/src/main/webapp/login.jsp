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
<title>Login</title>

</head>
<body>
	<br>
	<br><br>
	<br><br>
	<br>
	<div class="container">
		<div class="row justify-content-center">
			<div class="col-md-8">
				<div class="card">
					<div class="card-header bg-danger text-white" align="center"><h3>LOGIN PAGE</h3></div>
					<div class="card-body" >



						<form class="form-horizontal" action="login.do" method="post">
							<div class="form-group">
								<label for="userName" class="cols-sm-2 control-label">UserName
								</label>
								<div class="cols-sm-10">
									<div class="input-group">
										<span class="input-group-addon"><i
											class="fa fa-user fa" aria-hidden="true"></i></span> <input
											type="text" class="form-control" name="userName"
											id="userName" placeholder="Enter your userName" />
									</div>
								</div>
							</div>
							<div class="form-group">
								<label for="password" class="cols-sm-2 control-label">Password
								</label>
								<div class="cols-sm-10">
									<div class="input-group">
										<span class="input-group-addon"><i
											class="fa fa-user fa" aria-hidden="true"></i></span> <input
											type="password" class="form-control" name="password"
											id="password" placeholder="Enter your password" />
									</div>
								</div>
							</div>
							<div class="form-group " align="center">
							<input type="submit" value="LoginPage"
								class="btn btn-primary btn-md  login-button" />
								<a
			href="index.jsp" class="btn btn-warning">HomePage</a><br> <br>
						</div>
							<!-- <label>Enter userName:</label><div><input type="text" name="userName" /></div><br>
<label>Enter password:</label><div><input type="password" name="password" /></div><br>
<p><input type="submit" value="login"/></p> -->

						</form>

					</div>
				</div>
			</div>
		</div>
	</div>


</body>
</html>