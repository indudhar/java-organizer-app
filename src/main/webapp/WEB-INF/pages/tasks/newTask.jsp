<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link type="text/css" rel="stylesheet" href="static/style.css"/>
<title>Register new User</title>
</head>
<body>
<h1>Register New User</h1>
	<sf:form method="POST" modelAttribute="registrant">
		<fieldset>
		<legend>Registrant Details</legend>
			<table>
				<tr>
					<th><sf:label for="regName" path="regName">Name:</sf:label></th>
					<td><sf:input path="regName"/> <sf:errors path="regName" cssClass="error"/></td>
				</tr>
				<tr>
					<th></th><td><input type="submit" /></td>
				</tr>
			</table>
		</fieldset>
	</sf:form>
</body>
</html>