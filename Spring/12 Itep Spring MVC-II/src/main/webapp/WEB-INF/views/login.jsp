<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<blockquote>
		<h2>Example of Spring MVC</h2>
		<jsp:include page="header.jsp"></jsp:include>
		<h2>Login Form</h2>
		<h3>${message}</h3>
		<form action="${pageContext.request.contextPath}/loginData" method="post">
			<input type="email" placeholder="Enter Email" id="email" name="email"/>
			<br>
			
			<input type="password" placeholder="Enter Password" id="password" name="password"/>
			<br>
			
			<button type="submit">Login</button>
			<button type="reset">Reset</button>
		</form>
	</blockquote>
</body>
</html>