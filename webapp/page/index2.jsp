<!DOCTYPE HTML><%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@page import="bean.SecondBean"%>

<html>
<head>
<title>index2</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
	<form action="../second" method="post">
	<jsp:useBean id="second" class="bean.SecondBean" scope="session"/>
	<c:if test="${ second.name eq null }">
		<input type="text" name="name" id="name"/>
	</c:if>
	<c:if test="${ second.name ne null }">
		<input type="text" name="name" id="name" value="<c:out value="${second.name}"/>"/>
	</c:if>

		<input type="submit" value="SECOND_PAGE2"/> 
	</form>
</body>
</html>