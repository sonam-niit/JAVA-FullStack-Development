<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="test.jsp">Click Here</a>

<%= "Welcome "+"User" %>

<br><br>
<%= 7*6 %>
<br>
<%
	out.println("Welcome User");
%>

</body>
</html>