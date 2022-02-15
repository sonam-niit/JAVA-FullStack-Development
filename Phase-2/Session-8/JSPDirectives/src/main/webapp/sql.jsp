<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     <%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<sql:setDataSource var="db" driver="com.mysql.cj.jdbc.Driver" 
url="jdbc:mysql://localhost:3306/ecommerce" user="root" password="Sonam@123"/>

<sql:query var="rs" dataSource="${db }" >
	select * from eproduct
</sql:query>
<table>
<tr><th>Id</th><th>Name</th><th>Price</th><th>Date</th><tr>
<c:forEach var="product" items="${rs.rows }">
<tr>
<td><c:out value="${product.id }"></c:out></td>
<td><c:out value="${product.name }"></c:out></td>
<td><c:out value="${product.price }"></c:out></td>
<td><c:out value="${product.date_added}"></c:out></td>
</tr>
</c:forEach>
</table>
</body>
</html>