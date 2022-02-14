<%@page import="java.util.Date"%>
<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Scriptlet</h1>
<p> Write full Java code in HTML</p>
<%
	int a=10;
	int b=20;
	int c=a+b;
	if(c>20)
		out.print("Addition is "+c);
	else
		out.print("Not valid result");
%>
<h1>Declaration</h1>
<p>Declare variable declare method</p>
<%! int number=20; 
	Date d= new Date();
%>
<%! int cube(int n)
	{
		return n*n*n;
	}
%>
<h1>Expression</h1>
<p> To display value can use expression</p>
<h3>Value of number: <%=number %></h3><br>
<h3>cube of 5 is: <%= cube(5) %></h3>
<h3>Date <%=  Calendar.getInstance().getTime() %></h3>
<h3>Date <%= d.getDate() %></h3>
</body>
</html>