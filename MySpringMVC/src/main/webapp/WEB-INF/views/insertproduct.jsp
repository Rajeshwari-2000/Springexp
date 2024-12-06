<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add New Product</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f4f4f4;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
        margin: 0;
    }

    form {
        background-color: white;
        padding: 20px;
        border-radius: 5px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        width: 300px; 
    }

    label {
        display: block;
        margin: 10px 0 5px;
    }

    input[type="text"] {
        width: 90%;
        padding: 10px;
        margin-bottom: 15px;
        border: 1px solid #ccc;
        border-radius: 4px;
    }

    button {
        background-color: #4CAF50;
        color: white;
        padding: 10px;
        border: none;
        border-radius: 4px;
        cursor: pointer;
        width: 100%;
        font-size: 16px;
    }

    button:hover {
        background-color: #45a049;
    }
</style>
</head>
<body>
<form action="insertProduct" method="post">
    <label for="pid">Product Id:</label>
    <input type="text" name="pid" id="pid" required>

    <label for="pname">Product Name:</label>
    <input type="text" name="pname" id="pname" required>

    <label for="qty">Product Qty:</label>
    <input type="text" name="qty" id="qty" required>

    <label for="price">Product Price:</label>
    <input type="text" name="price" id="price" required>

    <label for="ldt">Product Expdate:</label>
    <input type="text" name="ldt" id="ldt" required>

    <label for="cid">Product Cid:</label>
    <input type="text" name="cid" id="cid" required>

    <button type="submit" name="btn" id="insert">Add New Product</button>
</form>
</body>
</html>