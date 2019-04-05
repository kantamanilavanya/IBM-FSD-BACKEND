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
<title>Update Employee</title>
</head>

<style>
</style>

<spring:url value="/" var="contextPath" htmlEscape="true" />

<body>
	<div class="container">

		<div class="row justify-content-center">
			<div class="col-md-8">
				<div class="card">
					<div class="card-header bg-danger text-white" align="center">
						<h3>UPDATE EMPLOYEE FORM</h3>
					</div>
					<div class="card-body">
						<form:form method="POST" class="form-horizontal"
							action="${contextPath}/employee/update" modelAttribute="employee">
							<form:errors path="*" cssClass="errorblock" element="div" />
							<div class="form-group">
								<form:label path="name" for="name"
									class="cols-sm-2 control-label">Employee
								Name </form:label>
								<div class="cols-sm-10">
									<div class="input-group">
										<span class="input-group-addon"><i
											class="fa fa-user fa" aria-hidden="true"></i></span>
										<form:hidden path="id" />
										<form:input type="text" class="form-control" name="name"
											id="name" path="name" placeholder="Enter your employeeName" />
										<form:errors path="name" cssClass="error" />
									</div>
								</div>
							</div>

							<div class="form-group">
								<form:label path="department" for="department"
									class="cols-sm-2 control-label">Employee
								Department </form:label>
								<div class="cols-sm-10">
									<div class="input-group">
										<span class="input-group-addon"><i
											class="fa fa-user fa" aria-hidden="true"></i></span>
										<form:input type="text" class="form-control" name="department"
											id="department" path="department"
											placeholder="Enter your department" />
										<form:errors path="department" cssClass="error" />
									</div>
								</div>
							</div>
							<div class="form-group">
								<form:label path="designation" for="designation"
									class="cols-sm-2 control-label">Employee
								Designation </form:label>
								<div class="cols-sm-10">
									<div class="input-group">
										<span class="input-group-addon"><i
											class="fa fa-user fa" aria-hidden="true"></i></span>
										<form:input type="text" class="form-control"
											name="designation" id="designation" path="designation"
											placeholder="Enter your designation" />
										<form:errors path="designation" cssClass="error" />
									</div>
								</div>
							</div>
							<div class="form-group">
								<form:label path="contractor" for="contractor"
									class="cols-sm-2 control-label">Employee
								Contractor </form:label>
								<div class="cols-sm-10">
									<div class="input-group">
										<span class="input-group-addon"><i
											class="fa fa-user fa" aria-hidden="true"></i></span>
										<form:checkbox class="form-control" name="contractor"
											id="contractor" path="contractor" />
										<form:errors path="contractor" cssClass="error" />
									</div>
								</div>
							</div>
							<div class="form-group">
								<form:label path="skills" for="skills"
									class="cols-sm-2 control-label">Employee
								Skills </form:label>
								<div class="cols-sm-10">
									<div class="input-group">
										<span class="input-group-addon"><i
											class="fa fa-user fa" aria-hidden="true"></i></span>
										<form:checkboxes path="skills" items="${skillList}"
											class="form-control" name="skills" id="skill" />
										<form:errors path="skills" cssClass="error" />
									</div>
								</div>
							</div>

							<div class="form-group">
								<form:label path="age" for="age" class="cols-sm-2 control-label">Employee
								Age </form:label>
								<div class="cols-sm-10">
									<div class="input-group">
										<span class="input-group-addon"><i
											class="fa fa-user fa" aria-hidden="true"></i></span>
										<form:input type="number" class="form-control" name="age"
											id="age" path="age" placeholder="Enter your age" />
										<form:errors path="age" cssClass="error" />
									</div>
								</div>
							</div>

							<div class="form-group">
								<form:label path="country" for="country"
									class="cols-sm-2 control-label">Employee
								Country </form:label>
								<div class="cols-sm-10">
									<div class="input-group">
										<span class="input-group-addon"><i
											class="fa fa-user fa" aria-hidden="true"></i></span>
										<form:select class="form-control" path="country"
											items="${countries}" />
										<form:errors path="country" cssClass="error" />
									</div>
								</div>
							</div>

							<div class="form-group">
								<form:label path="address" for="address"
									class="cols-sm-2 control-label">Employee
								Address </form:label>
								<div class="cols-sm-10">
									<div class="input-group">
										<span class="input-group-addon"><i
											class="fa fa-user fa" aria-hidden="true"></i></span>
										<form:textarea type="text" class="form-control" name="address"
											id="address" path="address" placeholder="Enter your address" />
										<form:errors path="address" cssClass="error" />
									</div>
								</div>
							</div>

							<div class="form-group">
								<form:label path="gender" for="gender"
									class="cols-sm-2 control-label">Employee
								Gender </form:label>
								<div class="cols-sm-10">
									<div class="input-group">
										<span class="input-group-addon"><i
											class="fa fa-user fa" aria-hidden="true"></i></span>
										<form:radiobuttons path="gender" items="${genderOptions}" />
										&nbsp;
										<form:errors path="gender" cssClass="error,input" />
									</div>
								</div>
							</div>

							<div class="form-group " align="center">
								<input type="submit" value="AddEmployee"
									class="btn btn-primary  login-button" /> <a
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


