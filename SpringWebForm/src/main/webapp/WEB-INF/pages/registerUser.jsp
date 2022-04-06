<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
*{
	background-color: #b2dfdb;
	font-family:sans-serif;
	font-weight: bold;
}
input{
	color: green;
}
body{
	text-align: center;
}
.myTabel{
	 margin-left: auto;
  	margin-right: auto;
}
.error {
	color: red;
	font-weight: bold;
}
</style>
</head>
<body>
	<h1>Register User</h1>
	<form:form action="showreguser" modelAttribute="user" method="post">
	<table class="myTabel">
		<tr>
			<td><form:label path="firstName">First Name</form:label></td>
			<td><form:input path="firstName" id="firstname" /></td>
			<td><form:errors path="firstName" cssClass="error" /></td>
		</tr>
		<tr>
			<td><form:label path="lastName">Last Name</form:label></td>
			<td><form:input path="lastName" id="lastName" /></td>
			<td><form:errors path="lastName" cssClass="error" /></td>
		</tr>
		<tr>
			<td><form:label path="password">PassWord</form:label></td>
			<td><form:input path="password" id="password" /></td>
			<td><form:errors path="password" cssClass="error" /></td>
		</tr>
		<tr>
			<td><form:label path="email">Email or Gmail</form:label></td>
			<td><form:input path="email" id="email" /></td>
			<td><form:errors path="email" cssClass="error" /></td>
		</tr>
		<tr>
			<td>Subscribe to newsletter?:</td>
			<td><form:checkbox path="receiveNews" /></td>
		</tr>
	</table>
	<input type="submit" value="Procced">
	</form:form>
</body>
</html>