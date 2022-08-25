 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Id Search</title>
</head>
<style>
.frame{
position:absolute;
top:35%;
left:40%;
border:3px solid black;
width:14%;
border-radius:20px;
padding-top:10px;
padding-right:-10px;
padding-bottom:10px;
padding-left:40px;
}

</style>
<body>


<a href="listUser">List All Users</a>
<br>
<br>
<div class="frame">
<h2 align="center">User Id Search</h2>
<form action="search">
User ID : <input type="number" name="userid">
<br>
<br>
<input type="submit" value="Search">
</form>
</div>
</body>
</html>
