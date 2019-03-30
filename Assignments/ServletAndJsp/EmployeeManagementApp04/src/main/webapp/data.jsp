<%@page import="javax.servlet.http.HttpServletRequest" %>
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
<title>Employee Details</title>
</head>
<body>
<div class="container">
	<div class="row justify-content-center">
		<div class="col-sm-8">
			<div class="card">
				<div class="card-header bg-danger text-white" align="center"><h3>Employee Details</h3></div>
				<div class="card-body" align="center"><br><br>

Employee Id:<% out.println(session.getAttribute("id"));%><br><br>
Employee FirstName:<% out.println(session.getAttribute("userName"));%><br><br>
Employee LastName:<% out.println(session.getAttribute("lastName"));%><br><br>
Employee Gender:<% out.println(session.getAttribute("gender"));%><br><br>
Employee City:<% out.println(session.getAttribute("city"));%><br><br>
Employee Email:<% out.println(session.getAttribute("email"));%><br><br>
Employee Age:<% out.println(session.getAttribute("age"));%><br><br>
<div class="form-group " align="center">
							
								<a
			href="index.jsp" class="btn btn-primary btn-lg">HomePage</a><br> <br>
						</div>
</div>
</div>
</div>
</div>
</div>

</body>
</html>