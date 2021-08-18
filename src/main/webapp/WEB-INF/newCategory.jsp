<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Category</title>
</head>
<body>
	<h1>New Category</h1>
	
	<form:form action="/categories/new" method="post" modelAttribute="category">
		<p>
			Category name:
			<form:errors path="name" />
			<form:input path="name" />
		 </p>
		
		 <input type = "submit" value="create Category" />
	</form:form>
	
	<c:forEach items="${categories}" var="c">
		<li><c:out value="${c.name}"/> </li>
	</c:forEach>
	

</body>
</html>