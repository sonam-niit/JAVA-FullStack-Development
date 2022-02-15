<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set var="input" value="${300*10 }"></c:set>
<c:out value="${input}"></c:out>
<br>
<c:choose>
	<c:when test="${input>=4000 }">
		Income is good
	</c:when>
	<c:otherwise>
		Not good
	</c:otherwise>
</c:choose>
<br>
<c:catch var="error">
	<% int x=10/0; %>
</c:catch>
<c:if test="${error!=null }">
	The exception is ${error }
	<br>
	Message: ${error.message }
</c:if>
</body>
</html>  