<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product List</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f4f4f4;
        margin: 20px;
    }

    table {
        width: 100%;
        border-collapse: collapse;
        margin-bottom: 20px;
    }

    th, td {
        padding: 10px;
        text-align: left;
        border: 1px solid #ddd;
    }

    th {
        background-color: #4CAF50;
        color: white;
    }

    tr:nth-child(even) {
        background-color: #f2f2f2;
    }

    tr:hover {
        background-color: #ddd;
    }

    button {
        background-color: #4CAF50;
        color: white;
        padding: 10px 15px;
        border: none;
        cursor: pointer;
        font-size: 16px;
    }

    button:hover {
        background-color: #45a049;
    }

    a {
        text-decoration: none;
        color: #4CAF50;
    }

    a:hover {
        text-decoration: underline;
    }
</style>
</head>
<body>
<table>
<tr>
   <th>Product Id</th>
   <th>Name</th>
   <th>Qty</th>
   <th>Price</th>
   <th>ExpDate</th>
   <th>Cid</th>
   <th>Actions</th>
</tr>
<c:forEach var="prod" items="${plist}">
  <tr>
    <td>${prod.pid}</td>
    <td>${prod.pname}</td>
    <td>${prod.qty}</td>
    <td>${prod.price}</td>
    <td>${prod.ldt}</td>
    <td>${prod.cid}</td>
    <td>
      <a href="editproduct/${prod.pid}">edit</a> /
      <a href="deleteproduct/${prod.pid}">delete</a>
    </td>
  </tr>
</c:forEach>
</table>
<form action="addnewproduct">
  <button type="submit" name="btn" id="add">Add new Product</button>
</form>
</body>
</html>