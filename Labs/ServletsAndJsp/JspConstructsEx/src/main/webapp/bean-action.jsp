
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Bean Example</h2>
<%!String first="lavanyajanaki"; %>
<jsp:useBean id="emp"  class="com.jsp.bean.EmployeeBean" />
<jsp:setProperty property="firstName" name="emp" value="<%=first%>"/>
<jsp:getProperty name="emp" property="firstName"  />
<jsp:getProperty name="emp" property="age" />
</body>
</html>