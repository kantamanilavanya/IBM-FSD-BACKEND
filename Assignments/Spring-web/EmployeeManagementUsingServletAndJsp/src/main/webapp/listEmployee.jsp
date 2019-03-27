
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
<title>Insert title here</title>
<style>
table, th, td {
	border: 2px solid grey;
	padding: 8px;
	text-align: center;
}
</style>
</head>
<body>
	<h3 align="right">
		Welcome User:<%
		out.println(session.getAttribute("userName"));
	%>
	</h3>
	<h2 align="center">LIST EMPLOYEE DATA</h2>
	<br>
	<form action="./delete">
		<table align="center">
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
				<td><a href="updateEmployee.jsp?name=<%=empDetails.getEmployeeName()%>&id=<%=empDetails.getEmployeeId()%>&date=<%=empDetails.getDate() %>&city=<%=empDetails.getCity()%>&designation=<%=empDetails.getDesignation()%>&department=<%=empDetails.getDepartment()%>&salary=<%=empDetails.getSalary()%>&emailId=<%=empDetails.getEmailId()%>">Update</a></td>

				<td><a href="delete?id=<%=empDetails.getEmployeeId()%>">delete</a>



				</td>
			</tr>

			<%
				}
			%>
		</table>
		<br> <br>

	</form>
	<a href="success.jsp">HomePage</a>
</body>
</html>