<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
	<title>Login</title>
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
<style>
.error {
	color: #ff0000;
}

.errorblock {
	color: #000;
	background-color: #ffEEEE;
	border: 3px solid #ff0000;
	padding: 8px;
	margin: 16px;
}
</style>
<spring:url value="/" var="contextPath" htmlEscape="true" />
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



						<form:form class="form-horizontal" method="POST" action="${contextPath}/loginController/authenticate" modelAttribute="login">
							<div class="form-group">
								<form:label path="userName" for="userName" class="cols-sm-2 control-label">UserName
								</form:label>
								<div class="cols-sm-10">
									<div class="input-group">
										<span class="input-group-addon"><i
											class="fa fa-user fa" aria-hidden="true"></i></span> <form:input
											type="text" class="form-control" name="userName" path="userName"
											id="userName" placeholder="Enter your userName" />
									</div>
								</div>
							</div>
							<div class="form-group">
								<form:label path="password" for="password" class="cols-sm-2 control-label">Password
								</form:label>
								<div class="cols-sm-10">
									<div class="input-group">
										<span class="input-group-addon"><i
											class="fa fa-user fa" aria-hidden="true"></i></span> <form:input
											type="password" path="password" class="form-control" name="password"
											id="password" placeholder="Enter your password" />
									</div>
								</div>
							</div>
							<div class="form-group " align="center">
							<input  type="submit" value="Login"
								class="btn btn-primary btn-md  login-button" />
								<a href="${contextPath}/" class="btn btn-warning">HomePage</a><br> <br>
						</div>



</form:form>
</div>
</div>
</div>
</div>
</body>
</html>