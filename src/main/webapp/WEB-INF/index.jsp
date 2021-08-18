<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Products and Categories</title>
</head>
<body>
<h1>Categories and their products</h1>
	
	<p>
		<c:forEach items="${categories}" var="c">
			<c:out value="${c.name}"/>
		</c:forEach>
	</p>
	<a href="/categories/new">Create Category</a>
	<a href="/products/new">Create products</a>

</body>
</html>