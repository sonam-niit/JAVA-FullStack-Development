<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Profile Page</h1>
<%
	String name= (String)session.getAttribute("email");
%>
<h3>Welcome <%=name %></h3>
<a href="logout.jsp">logout</a>
<a></a>
</body>
</html>