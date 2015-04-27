<!DOCTYPE HTML><%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@page import="bean.FirstBean"%>
<html>
<head>
<title>index1</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
	<form action="../first" method="post" name="form1">
	<jsp:useBean id="first" class="bean.FirstBean" scope="session"/>
	<c:if test="${ first.name eq null }">
		<input type="text" name="name" id="name"/>
	</c:if>
	<c:if test="${ first.name ne null }">
		<input type="text" name="name" id="name" value="<c:out value="${first.name}"/>"/>
	</c:if>
	<input type="submit" value="FIRST_PAGE1"/> 
	</form>
</body>
</html>