<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="viewProducts"> View Products</a>

<form action="addProduct">
<h2> Add Product</h2>
Product ID <input type="text" name="pID"/><br/>
Product Name <input type="text" name="pName"/><br/>
Product Cost <input type="text" name="pCost"/><br/>
<input type="submit" name="Add Product"/><br/>
</form>

<form action="updateProduct">
<h2> Update Product</h2>
Product ID <input type="text" name="pID"/><br/>
Product Name <input type="text" name="pName"/><br/>
Product Cost <input type="text" name="pCost"/><br/>
<input type="submit" name="Update Product"/><br/>
</form>

<form action="deleteProduct">
<h2> Add Product</h2>
Product ID <input type="text" name="pID"/><br/>

<input type="submit" name="Delete Product"/><br/>
</form>
</body>
</html>