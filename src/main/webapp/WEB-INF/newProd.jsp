<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Product</title>
</head>
<body>

	<form:form action="/products/new" method="post" modelAttribute="product">
		<p>
			Product name:
			<form:errors path="name" />
			<form:input path="name" />
		 </p>
		 <p>
		 	Product Description:
		 	<form:errors path="description"/>
		 	<form:input path="description"/>
		 </p>
		 <p>
		 	Price:
		 	<form:errors path="price"/>
		 	<form:input path="price"/>
		 </p>
		 <p>
		 	<form:label path="categories">Choose your product's category</form:label>
		 	<form:errors path="categories"/>
		 	<form:select path="categories">
		 		<option value ="categories" disabled selected>
		 		<c:forEach items="${categories}" var="category">
		 			<form:option value="${category.id}">
		 			<c:out value="${category.name}" />
		 			</form:option>
		 		</c:forEach>
		 	</form:select>
		 </p>
		 
		
		 <input type = "submit" value="create Product" />
	</form:form>
</body>
</html>