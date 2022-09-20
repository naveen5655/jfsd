<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="./base.jsp" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

</head>
<body>

<div class="container mt-3">
<div class="row">

<div class="col-md-12">

<table class="table table-hover">
  <thead>
    <tr>
      <th scope="col">Id</th>
      <th scope="col">Product Name</th>
      <th scope="col">Description</th>
      <th scope="col">Price</th>
      <th scope="col">Action</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach items="${products }" var="p">
  
  <tr>
      <th scope="row">${p.id}</th>
      <td>${p.name }</td>
      <td>${p.description }</td>
      <td>${p.price }</td>
      <td>
      <a href ="delete-product/${p.id }">Delete</a>
      <a href ="update-product/${p.id }">Update</a>
      
      </td>
    </tr>
  
  
  </c:forEach>
    
   
  </tbody>
</table>
<div class="container">

<a href="add-product" class="btn btn-outline-success">Add Product</a> 

</div>




</div>


</div>




</div>


</body>
</html>