<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored="false" %>
<html>
<head>
	<title>product</title>
</head>
<body>
<h1>
	Add new product
</h1>
<form:form method="post" commandName="product" action="add">
	<table>
		<tr>
			<td>
				Product name 
			</td>
			<td>
				<form:input path="productName"/>
			</td>
		</tr>
		<tr>
			<td>
				<input type="submit" value="Save"/>
			</td>
		</tr>
	</table>
	</form:form>

</body>
</html>