<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
 <%@include file="./base.jsp" %>
</head>
<body>

<div class ="container mt-3">
<div class="row">
<div class="col-md-6 offset-md-3">


<form action ="${pageContext.request.contextPath}/handle-product" method ="post">

<input type="hidden" value="${product.id }" name="id"/>

<div class="form-group">
<label for="name">Product Name</label>
<input type="text" class="form-control" id="name" aria-describedby="emailHelp" name="name"
placeholder="Enter Your Product Name"
value="${product.name }">

</div>

<div class="form-group">
<label for="name">Product Description</label>
<textarea class="form-control" name="description" id="description" rows="5" 
placeholder="Enter your product Description">
${product.description }
</textarea>
</div>

<div class="form-group">
<label for="name">Product Price</label>
<input type="text" class="form-control" id="price" name="price"
placeholder="Enter Your Product Price"
value="${product.price }">

</div>

<div class="container text-center">
<a href="${pageContext.request.contextPath}/" class="btn btn-outline-danger">Back</a>
<button type="submit" class="btn btn-primary">Update</button>

</div>



</form>



</div>


</div>




</div>

</body>
</html>