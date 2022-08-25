<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	   <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Requested Users</title>
</head>
<style>
.data-table{
position:absolute;
top:10%;
left:41%;
}

</style>
<body>

	<h1 align="center">Requested User</h1>

	<table class="data-table" border="1">
		<tr>
			<th>User Id</th>
			<th>User Name</th>
			<th>Mobile Number</th>
			<th>Edit</th>
		</tr>

		<tr>
			<td>${req.userid }</td>
			<td>${req.userName }</td>
			<td>${req.phone }</td>
			<td><a href="edit/${req.userid}">Edit</a></td>
		</tr>

	</table>

</body>
</html>