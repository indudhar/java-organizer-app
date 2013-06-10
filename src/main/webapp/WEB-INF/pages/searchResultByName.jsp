<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Details</title>
</head>
<body>
<h2>List of Registrants</h2>
<c:forEach items="${userList}" var="user">
		<p>User Id : <c:out value="${user.id}"/></p>
		<p>Name : <c:out value="${user.name}"/> </p>
		<p>Email: <c:out value="${user.email}"/></p>
</c:forEach>
</body>
</html>