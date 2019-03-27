 <%-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ page language="java" contentType="text/html" %>
<%@ page import="java.util.*" %>

    <%@page import="com.employee.management.EmployeeServiceImpl" %>
    <%@page import="java.util.List,java.util.ArrayList" %>
    <%@page import="com.employee.management.Employee" %>
    <%@page import="java.util.Iterator"%> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
table,th,td{
border:2px solid black;

text-align:center;
 
}
</style>
</head>
<body>
<h3 align="right">Welcome User:<%  out.println(session.getAttribute("userName"));%></h3>
<h2 align="center">EMPLOYEE LANDING PAGE</h2>

<%-- <form action="./delete">
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

 Iterator<Employee> iterator = data.iterator();  
 while(iterator.hasNext())  
 {
 Employee empDetails = iterator.next();
 
 %>
 
 <tr><td ><%=empDetails.getEmployeeId()%></td>
 
 <td><%=empDetails.getEmployeeName()%></td>
 <td><%=empDetails.getEmployeeAge()%></td>
 <td><%=empDetails.getGender()%></td>
 <td><%=empDetails.getDesignation()%></td>
 <td><%=empDetails.getDepartment()%></td>
 <td><%=empDetails.getSalary()%></td>
 <td><a href="updateEmployee.jsp">Update</a></td>
 
 <td><input type="submit" value="delete"/><input type="hidden" name="id" value="<%=empDetails.getEmployeeId()%>"/></td>
 </tr>
 <%
 
}
%>
</table><br><br> --%>
<div align="center">
 


<a href="addEmployee.jsp">Add Employee Data</a><br><br>
<a href="listEmployee.jsp">List Employee Data</a><br><br>
<a href="index.jsp" >HomePage</a><br><br>
</div>

</body>
</html>