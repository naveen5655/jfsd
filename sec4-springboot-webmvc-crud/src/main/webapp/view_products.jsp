<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
	<h2>SpringBoot MVC and CRUD Select</h2>

	<c:if test="${not empty products}">

		<ul>
			<c:forEach var="p" items="${products}">
				<li>${p.pID}</li>
				<li>${p.pName}</li>
				<li>${p.pCost}</li>
			</c:forEach>
		</ul>

	</c:if>
</body>
</html>