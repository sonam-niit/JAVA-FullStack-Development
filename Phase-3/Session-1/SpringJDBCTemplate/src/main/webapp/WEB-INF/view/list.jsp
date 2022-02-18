<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>List</h1>
<table>
	<tr>
		<th>Id</th><th>Name</th><th>Price</th><th>date</th>
	</tr>
	<c:forEach var="product" items="${result }">
		<tr>
			<td>${product.ID }</td>
			<td>${product.name }</td>
			<td>${product.price}</td>
			<td>${product.dateAdded }</td>
		</tr>
	</c:forEach>
	
</table>
</body>
</html>