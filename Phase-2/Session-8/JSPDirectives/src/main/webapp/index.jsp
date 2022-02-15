<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.Date" info="This is my first JSP Page"
    isELIgnored="false"
   %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%= "Today's Date "+new Date() %>
<br>
<h2>Use Expression Language</h2>
${'Hello World' }
<h1>Login Page</h1>
<%@include file="login.jsp" %>
</body>
</html>