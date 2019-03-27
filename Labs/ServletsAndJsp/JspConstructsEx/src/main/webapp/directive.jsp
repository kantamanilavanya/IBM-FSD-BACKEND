<%@page import="java.time.LocalDate"%>
<%@page import="java.util.List,java.util.ArrayList,java.util.Map,java.util.HashMap"%>
<%@page import="java.util.Arrays"%>
<html>
<body>
	<h2>Hello Lavanya!</h2>
	<h3>
		Countries:<%
		List<String> countries = Arrays.asList("India", "USA", "Cannada");
	Map<Integer,String> value=new HashMap<Integer,String>();
	value.put(1, "lavanya");
	value.put(2, "janaki");
	
		out.println(countries);
		out.println();
		out.println(value);
		out.println();
		out.println(request.getRemoteAddr());
		%>
	</h3>
</body>
</html>
