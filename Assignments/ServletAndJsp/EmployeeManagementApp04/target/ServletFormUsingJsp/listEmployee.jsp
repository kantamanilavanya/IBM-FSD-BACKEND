
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html"%>
<%@ page import="java.util.*,java.sql.ResultSet"%>

<%@page import="com.employee.management.EmployeeServiceImpl"%>
<%@page import="java.util.List,java.util.ArrayList,java.time.LocalDate"%>
<%@page import="com.employee.management.Employee"%>
<%@page import="java.util.Iterator"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<title>Insert title here</title>
<style>

</style>
</head>
<body>
<div class="container">
<nav class="navbar navbar-expand-sm bg-danger navbar-dark" >
  <h4 align="center">LIST EMPLOYEE DATA</h4>
</nav>


	<h6 align="right">
		Welcome:<% out.println(session.getAttribute("userName"));%>
	</h6>
	<form action="./delete">
		<table  class="table table-striped">
			<tr>
				<th>EmployeeID</th>
				<th>EmployeeName</th>
				<th>DOB</th>
				<th>Age</th>
				<th>Gender</th>
				<th>City</th>
				<th>EmailId</th>
				<th>Designation</th>
				<th>Department</th>
				<th>Salary</th>
				<th>Update</th>
				<th>Delete</th>

			</tr>
			<% LocalDate age=LocalDate.now(); %>
			<%
				// Iterating through subjectList
				EmployeeServiceImpl service = new EmployeeServiceImpl();
				List<Employee> data = service.listEmployee();
				
				Iterator<Employee> iterator = data.iterator();
				while (iterator.hasNext()) {
					//int datas=iterator.next().getEmployeeId();
					Employee empDetails = iterator.next();
					
			%>
			<%  %>
			<tr>
				<td><%=empDetails.getEmployeeId()%></td>

				<td><%=empDetails.getEmployeeName()%></td>
				<td><%=empDetails.getDate()%></td>
				<td><%=empDetails.getEmployeeAge()%></td>
				<td><%=empDetails.getGender()%></td>
				<td><%=empDetails.getCity()%></td>
				
				<td><%=empDetails.getEmailId()%></td>
				<td><%=empDetails.getDepartment()%></td>
				<td><%=empDetails.getDesignation()%></td>
				<td><%=empDetails.getSalary()%></td>
				<td><a class="btn btn-info" href="updateEmployee.jsp?name=<%=empDetails.getEmployeeName()%>&id=<%=empDetails.getEmployeeId()%>&date=<%=empDetails.getDate() %>&city=<%=empDetails.getCity()%>&designation=<%=empDetails.getDesignation()%>&department=<%=empDetails.getDepartment()%>&salary=<%=empDetails.getSalary()%>&emailId=<%=empDetails.getEmailId()%>">Update</a></td>

				<td><a  class="btn btn-danger" href="delete?id=<%=empDetails.getEmployeeId()%>">delete</a>



				</td>
			</tr>

			<%
				}
			%>
		</table>
		<br> <br>
		

	</form>
	<a href="success.jsp">HomePage</a>
	</div>
</body>
</html>