<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Of Books</title>
</head>
<%@page import="com.bean.Book" %>
<%@page import="java.util.List" %>
<% List<Book> bookList=(List<Book>)request.getAttribute("LIST");%>
<body bgcolor="#34eb92">
<h1 align="center">Library Management System</h1>
<hr>
<h2 align="center">Book List</h2><br>

<table border="1" align="center" width="80%" color="blue">
<tr>
<th>Book_Id</th>
<th>Book Name</th>
<th>Publisher</th>
<th>Price</th>
</tr>
<% for(Book b:bookList){ %>
<tr>
<td><%= b.getBook_id()%></td>
<td><%= b.getName()%></td>
<td><%= b.getPublisher()%></td>
<td><%= b.getPrice()%></td>
<td align="center"><a href="LibraryServlet?action=Delete&id=<%= b.getBook_id()%>">delete</a></td>
</tr>
<%} %>

</table>
<br>
<p align="center"><a href="index.jsp">Back</a></p>
<br>
<hr>

<footer align="center">@Copyright 2023-24</footer>
</body>
</html>