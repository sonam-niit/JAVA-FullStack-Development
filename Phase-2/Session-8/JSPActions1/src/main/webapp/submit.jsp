<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% 
	String uname=request.getParameter("uname");
	String password=request.getParameter("pass");
	if(uname.equals("admin") && password.equals("admin123"))
	{
%>
	<jsp:forward page="success.jsp">
		<jsp:param value="${uname }" name="user"/>
	</jsp:forward>
<%} else{ %>
	
	<h3>Wrong username or password try to login again</h3>
	<jsp:include page="index.jsp"></jsp:include>
	
	
<% } %>
</body>
</html>