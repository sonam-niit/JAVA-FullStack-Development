<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="handle-error-page.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Implicit objects</title>
</head>
<body>
<%
	String responseCheck= request.getParameter("office");
	if(responseCheck!=null)
	{
		response.setStatus(response.SC_MOVED_TEMPORARILY);
		response.setHeader("Location", "response-redirect.jsp?office="+responseCheck);
	}
	
	String errorCheck= request.getParameter("error");
	if(errorCheck!=null)
	{
		int x=0;
		if(x==0)
			throw new RuntimeException("Exception has benn raised");
	}
%>
<%
	int serverPort= request.getServerPort();
	out.print("the server is running on port "+serverPort+"<br>");
	out.print("Servlt Name "+config.getServletContext()+"<br>");
	out.print("Server Info "+application.getServerInfo()+"<br>");
	
	String pageName=page.toString();
	out.print("The name of a page is "+pageName+"<br>");
	
	pageContext.setAttribute("userid", "Sonam Soni");
	out.print("get attribute from page context "+ pageContext.getAttribute("userid")+"<br>");
%>

<a href="index.jsp?office=head-office">Show usage of response object</a>
<a href="index.jsp?error=1">Show usage of error object</a>

<%
	if(response.containsHeader("Location"))
		out.print("Current Location is " +response.getHeader("Location"));
%>
</body>
</html>