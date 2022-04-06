<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@ page isELIgnored="false" %>
<style>
*{
	background-color: #b2dfdb;
	font-family:sans-serif;
	font-weight: bold;
	text-align: center;
	margin-top: 50px;
}
</style>
</head>
<body>
	<h3>First Name : ${user.firstName}</h3>
	<h3>Last Name : ${user.lastName}</h3>
	<h3>Email : ${user.email}</h3>
	<h3>receiveNews : ${user.receiveNews}</h3>
	
</body>
</html>