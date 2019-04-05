<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<meta charset="ISO-8859-1">
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<html>
<head>
<title>Add Employee</title>
</head>

<style>

.error{
                color: red;
            }
</style>

<spring:url value="/" var="contextPath" htmlEscape="true" />

<body>
	<div class="container">
	
	<div class="row justify-content-center">
		<div class="col-md-8">
			<div class="card">
				<div class="card-header bg-danger text-white" align="center"><h3>REGISTRATION PAGE</h3></div>
				<div class="card-body">
	<form:form method="POST" class="form-horizontal" action="${contextPath}/registerController/register" modelAttribute="register">
		<%-- <form:errors path="*" cssClass="errorblock" element="div" /> --%>
		<div class="form-group">
							<form:label path="name" for="name" class="cols-sm-2 control-label" cssClass="form-control">Employee
								Name </form:label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-user fa"
										aria-hidden="true"></i></span> <form:input type="text"
										cssClass="form-control" name="name" id="name" path="name"
										placeholder="Enter your employeeName" /><form:errors path="name"
						cssClass="error" />
								</div>
							</div>
						</div>
						
						<div class="form-group">
							<form:label path="password" for="password" class="cols-sm-2 control-label">Employee
								Password </form:label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-user fa"
										aria-hidden="true"></i></span> <form:input type="password"
										class="form-control" name="password" id="password" path="password"
										placeholder="Enter your password" /><form:errors path="password"
						cssClass="error" />
								</div>
							</div>
						</div>
						
						<div class="form-group">
							<form:label path="age" for="age" class="cols-sm-2 control-label">Employee
								Age </form:label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-user fa"
										aria-hidden="true"></i></span> <form:input type="number"
										class="form-control" name="age" id="age" path="age"
										placeholder="Enter your age" /><form:errors path="age"
						cssClass="error" />
								</div>
							</div>
						</div>
						
						<div class="form-group">
							<form:label path="country" for="country" class="cols-sm-2 control-label">Employee
								Country </form:label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-user fa"
										aria-hidden="true"></i></span> <form:select class="form-control" path="country" items="${countries}" /><form:errors path="country"
						cssClass="error" />
								</div>
							</div>
						</div>
						
						<div class="form-group">
							<form:label path="address" for="address" class="cols-sm-2 control-label">Employee
								Address </form:label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-user fa"
										aria-hidden="true"></i></span> <form:textarea type="text"
										class="form-control" name="address" id="address" path="address"
										placeholder="Enter your address" /><form:errors path="address"
						cssClass="error" />
								</div>
							</div>
						</div>
						
						<div class="form-group">
							<form:label path="gender" for="gender" class="cols-sm-2 control-label">Employee
								Gender </form:label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-user fa"
										aria-hidden="true"></i></span> <form:radiobuttons path="gender" items="${genderOptions}" />
					&nbsp; <form:errors path="gender" cssClass="error,input" />
								</div>
							</div>
						</div>
						
						<div class="form-group " align="center">
							<input type="submit" value="Register"
								class="btn btn-primary  login-button" />
								<a
					href="${contextPath}/employee/list" class="btn btn-warning">Back</a>
					</div>
		
		
	</form:form>
	</div>
	</div>
	</div>
	</div>
	</div>
	
</body>
</html>
