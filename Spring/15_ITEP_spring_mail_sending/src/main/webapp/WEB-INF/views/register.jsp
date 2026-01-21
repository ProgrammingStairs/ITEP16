<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@include file="header.jsp" %>
	<h2>Registration</h2>
	<form action="${pageContext.request.contextPath}/register" method="post">
		<input 
			type="text"
			id="username"
			name="username"
			placeholder="Enter Username"
			required
		> <br>
		<input 
			type="email"
			id="email"
			name="email"
			placeholder="Enter Email"
			required
		> <br>
		<input 
			type="password"
			id="password"
			name="password"
			placeholder="Enter Password"
			required
		> <br>
				<input 
			type="text"
			id="address"
			name="address"
			placeholder="Enter Address"
			required
		> <br>
		
		<input 
			type="submit"
			value="Login"
		><input 
			type="reset"
			value="Reset"
		> <br>
	</form>
</body>
</html>