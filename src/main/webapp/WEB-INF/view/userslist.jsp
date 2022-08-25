<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Users List</title>
</head>
<style>
.data-table{
position:absolute;
top:10%;
left:42.5%;
}
</style>

<body>

<h1 align="center">Users List</h1>


<table class="data-table" border="1">
	<tr><th>User Id</th><th>User Name</th><th>Mobile Number</th></tr>
	<c:forEach var="p" items="${list }">
	
		<tr>
			<td>${p.userid }</td>
			<td>${p.userName }</td>
			<td>${p.phone }</td>
		
		</tr>
	
	</c:forEach>
	
</table>


</body>
</html>