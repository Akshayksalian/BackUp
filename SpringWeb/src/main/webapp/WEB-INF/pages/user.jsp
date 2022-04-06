<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Form</title>
<%-- for css styling
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css" type="text/css"></link> --%>
</head>
<body>
	<%@ page isELIgnored = "false" %>
	<h1>Enter User Details</h1>
	<h4>Message- ${message}</h4>
	<form:form action="showUser" modelAttribute="user" method="post">
	<table>
	<tr>
		<td>
			<form:label path="firstName">First Name</form:label>
		</td>
		<td>
			<form:input path="firstName" id="fistname"/>
		</td>
	</tr>
	<tr>
		<td>
			<form:label path="lastName">Last Name</form:label>
		</td>
		<td>
			<form:input path="lastName" id="lastname"/>
		</td>
	</tr>
	</table>
	<input type="submit" value="sumbit">
	</form:form>
</body>
</html>