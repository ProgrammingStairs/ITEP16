<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Example of Standard Tag</h2>
	<form action="viewDetails.jsp">
		Enter Username<br>
		<input
			type="text"
			placeholder="Enter Username"
			name="username"
			id="username"
		><br>
		Enter Email <br>
		<input
			type="email"
			placeholder="Enter Email"
			name="email"
			id="email"
		><br>
		Enter Password <br>
		<input
			type="password"
			placeholder="Enter Password"
			name="password"
			id="password"
		><br>
		
		<input
			type="submit"
			value="Register"
		><input
			type="reset"
			value="Reset"
		>
		<br>
	</form>
</body>
</html>