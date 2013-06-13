<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<link type="text/css" rel="stylesheet" href="../static/style.css"/>
<script type="text/javascript" src="../static/script.js"></script>
<title>Search for Registrant</title>
</head>
<body>
<h1>Registrant Search</h1>
	<sf:form method="POST" modelAttribute="registrant">
		<fieldset>
		<legend>Registrant Details</legend>
			<table>
				<tr>
					<th><sf:label for="id" path="id">By Id:</sf:label></th>
					<td><sf:input path="id"/> <sf:errors path="id" cssClass="error"/></td>
				</tr>
				<tr><th></th><th>Or</th></tr>
				<tr>
					<th><sf:label for="regName" path="regName">By Name:</sf:label></th>
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