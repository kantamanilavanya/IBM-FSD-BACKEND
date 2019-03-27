 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ page language="java" contentType="text/html" %>
<%@ page import="java.util.*" %>

    <%@page import="com.employee.management.EmployeeServiceImpl" %>
    <%@page import="java.util.List,java.util.ArrayList" %>
    <%@page import="com.employee.management.Employee" %>
    <%@page import="java.util.Iterator"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
table,th,td{
border:2px solid black;
border-collapse:collapse;
text-align:center;
 padding: 15px;
}
</style>
</head>
<body>
<h3 align="right">Welcome User:<%  out.println(session.getAttribute("userName"));%></h3>

<form action="./delete">
<table>
<tr>
<th>EmployeeID</th>
<th>EmployeeName</th>
<th>Age</th>
<th>Gender</th>
<th>Designation</th>
<th>Department</th>
<th>Salary</th>
<th>Update</th>
<th>Delete</th>

</tr>
<%
// Iterating through subjectList
 EmployeeServiceImpl service=new EmployeeServiceImpl();
List<Employee> data=service.listEmployee();
session.setAttribute("employees",data);
  
 %>
 <c:forEach var="employee" items="${employees}">
 <c:url var="emp" value="delete?${employee.id}"/>
 <tr><td>"${employee.employeeId}"</td>
 <tr><td>${employee.employeeName}</td>
 <tr><td>${employee.employeeAge}</td>
 <tr><td>${employee.gender}</td>
 <tr><td>${employee.designation}</td>
 <tr><td>${employee.department}</td>
 <tr><td>${employee.salary}</td>
 
 
 </c:forEach>
 
 
</table><br><br>

<a href="index.jsp">HomePage</a>

<a href="addEmployee.jsp">AddEmployee</a>
</form>
</body>
</html>