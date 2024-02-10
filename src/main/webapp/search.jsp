<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Searching</title>
</head>
<body bgcolor="#34eb92">
<h1 align="center">Library Management System</h1>
<hr>
<h2 align="center">Book Search</h2>

<form action="LibraryServlet" method="get">
  <table align="center" width="35%" border="0">
     <tr>
			<td>Book Name</td>
			<td><input type="text" name="bname"></td>
     </tr>
     <tr>
			<td colspan="2" align="center"><input type="submit" name="action" value="Search"></td>
     </tr>
   </table>
</form>

<br>
<p align="center"><a href="index.jsp">Back</a></p>
<br>
<hr>
<footer align="center">@Copyright 2023-24</footer>
</body>
</html>