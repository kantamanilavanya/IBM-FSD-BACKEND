<%@page import="java.time.LocalDate" %>

<html>
<body>
<h2>Hello Lavanya!</h2>

<!-- Declaration tag -->
<%! int a=10;
int b=2;

%>
<!--  scripletTag -->
<h3>Sum:<%  out.println(a+b); %></h3>
<!-- Expression tag -->
<h3>Power:<%  out.println(Math.pow(a, b)*100); %></h3>

</body>
</html>
