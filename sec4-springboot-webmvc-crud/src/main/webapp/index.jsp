<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SpringBoot MVC CRUD Example - Product</title>
</head>
<body>
<a href="viewProducts">View Products</a>

<form action="addProduct">
<h3> Add Product</h3>
Product ID <input type="text" name="pID"/><br/>
Product Name <input type="text" name="pName"/><br/>
Product Cost <input type="text" name="pCost"/><br/>
<input type="submit" name="Add Product"/><br/>

</form>

<form action="updateProduct">
<h3> Update Product</h3>
Product ID <input type="text" name="pID"/><br/>
Product Name <input type="text" name="pName"/><br/>
Product Cost <input type="text" name="pCost"/><br/>
<input type="submit" name="Update Product"/><br/>

</form>

<form action="deleteProduct">
<h3> Delete Product</h3>
Product ID <input type="text" name="pID"/><br/>
<input type="submit" name="Delete Product"/><br/>

</form>


</body>
</html>