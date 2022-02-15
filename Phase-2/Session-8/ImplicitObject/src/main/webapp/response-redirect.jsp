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
String office= request.getParameter("office");
	if(office!=null)
	{
		out.print("Value of Office: "+office);
	}
	else
	{	
		out.print("No value found");
	}
%>
</body>
</html>