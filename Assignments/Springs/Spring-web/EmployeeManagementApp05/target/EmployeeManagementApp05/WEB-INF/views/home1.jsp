<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>Employee Management App</title>
<spring:url value="/register" var="contextPath" htmlEscape="true" />
</head>
<body>
	<h1>Welcome to Employee Management App!</h1>
	<p> Current Time: ${serverTime} </p>
	<p> <a href="${contextPath}/register">Register</a>
</body>
</html>
