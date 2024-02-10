<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book Addition</title>
</head>
<body bgcolor="#34eb92">
<h1 align="center">Library Management System</h1>
<hr>
<h2 align="center">Add Book To Library</h2>
<form action="LibraryServlet" method="post">
	<table align="center" width="30%" border="0">
		<tr>
			 <td>Book Id</td>
			 <td><input type="number" name="bid"></td>
		</tr>
		<tr>
			 <td>Book Name</td>
			 <td><input type="text" name="bname"></td>
		</tr>
		<tr>
			 <td>Publisher</td>
			 <td><input type="text" name="publisher"></td>
		</tr>
		<tr>
			 <td>Price</td>
			 <td><input type="number" name="price"></td>
		</tr>
		<tr>
		     
			 <td colspan="3" align="center"><input type="submit" name="action" value="Register"></td>
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