<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<blockquote>
		<h2>Example of Spring MVC</h2>
		<hr>
			<a href="${pageContext.request.contextPath}/user">Home</a> &nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;
			<a href="${pageContext.request.contextPath}/user/register">Register</a> &nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;
			<a href="${pageContext.request.contextPath}/student/">StudentPortal</a>
		<hr>
		<h2>Registration Form</h2>
		<form:form modelAttribute="user">
			
		</form:form>
	</blockquote>
</body>
</html>