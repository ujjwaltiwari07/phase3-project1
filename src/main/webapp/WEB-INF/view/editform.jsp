	<%@ page language="java" contentType="text/html; charset=ISO-8859-1"     
		pageEncoding="ISO-8859-1"%>
		<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
	<!DOCTYPE html>
	<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>edit form</title>
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
	
	<div class="frame">
		  <h1>Edit Employee</h1>  
	       <form:form method="POST" action="/SearchingforaSpecificUser/editsave">    
	        <table >    
	        <tr>  
	        <td>User id</td>    
	         <td><form:input  path="userid" /></td>  
	         </tr>   
	         <tr>    
	          <td>Name : </td>   
	          <td><form:input path="userName"  /></td>  
	         </tr>    
	         <tr>    
	          <td>Mobile :</td>    
	          <td><form:input path="phone" /></td>  
	         </tr>
	         <tr>    
	          <td> </td>    
	          <td><input type="submit" value="Save changes" /></td>    
	         </tr>    
	        </table>    
	       </form:form>
	</div>
	</body>
	</html>