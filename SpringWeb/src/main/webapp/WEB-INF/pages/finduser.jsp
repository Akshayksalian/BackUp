<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@ page isELIgnored="false" %>
	<h4>Message - ${message}</h4>
	<form name="userform" method="post" onsubmit="return OnSubmitForm();">
		User ID : <input type="text" id="userid" name="userid">
		<input type="submit" value="Submit">
	</form>
	<script type="text/javascript">
		function OnSubmitForm(){
			var userid = document.getElementById("userid").value;
				document.userform.action="user/"+userid;
				return true;
		}
	</script>
</body>
</html>