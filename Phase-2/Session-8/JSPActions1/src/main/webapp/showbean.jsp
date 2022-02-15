<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>UseBean Demo</h3>
<jsp:useBean id="object" class="com.simplilearn.usebean.Student" scope="session"></jsp:useBean>
<h4>Display property</h4>
Id: <jsp:getProperty property="id" name="object"/><br>
Name: <jsp:getProperty property="name" name="object"/><br>

</body>
</html>