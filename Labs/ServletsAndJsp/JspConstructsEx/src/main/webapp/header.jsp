<%@page
	import="java.util.List,java.util.ArrayList,java.util.Map,java.util.HashMap"%>
<%@page import="java.util.Arrays"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p>
		<%
		List<String> countries = Arrays.asList("India", "USA", "Cannada");
		out.println(countries);
		
	%>
	</p>
</body>
</html>