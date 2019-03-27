<%@page import="javax.servlet.http.HttpServletRequest" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Employee Details</h1>
<h3>Id:<%  out.println(session.getAttribute("id"));%></h3>
<h3>firstName:<%  out.println(session.getAttribute("userName"));%></h3>
<h3>lastName:<%  out.println(session.getAttribute("lastName"));%></h3>
<h3>Gender:<%  out.println(session.getAttribute("gender"));%></h3>
<h3>city:<%  out.println(session.getAttribute("city"));%></h3>
<h3>Email:<%  out.println(session.getAttribute("email"));%></h3>
<h3>Age:<%  out.println(session.getAttribute("age"));%></h3>
<a href="index.jsp">HomePage</a>

</body>
</html>