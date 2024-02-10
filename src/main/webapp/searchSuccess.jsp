<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Searching Status</title>
</head>
<%@page import="com.bean.Book" %>

<% Book b=(Book)request.getAttribute("BOOK"); %>
<body bgcolor="#34eb92">
<h1 align="center">Library Management System</h1>
<hr>
<h2 align="center">Searched Book</h2>
<table border="1" align="center" width="40%">
<tr>
    <th>Book_Id</th>
    <th>Book_Name</th>
    <th>Publisher</th>
    <th>Price</th>
</tr>
<tr>
    <td><%= b.getBook_id()%></td>
    <td><%= b.getName()%></td>
    <td><%= b.getPublisher()%></td>
    <td><%= b.getPrice()%></td>
</tr>
</table>
<br>
<p align="center"><a href="index.jsp">Back</a></p>
<br>
<hr>
<footer align="center">@Copyright 2023-24</footer>
</body>
</html>