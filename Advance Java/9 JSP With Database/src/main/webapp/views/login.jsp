<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
		<title>JSP CRUD Example</title>
		<link href="../css/style.css" rel="stylesheet">
	</head>
		<body>
		<blockquote>
			<jsp:include page="header.jsp"></jsp:include>			
			<div>
				<h2>Login Form</h2>
				<form action="loginData.jsp" method="post">
					<input
						type="email"
						placeholder="Enter Email"
						name="email"
						id="email"
						required
					> <br>
					<input
						type="password"
						placeholder="Enter Password"
						name="password"
						id="password"
						required
					> <br> <br>
					<input
						type="submit"
						value="Login"
					> 
					<input
						type="reset"
						value="Reset"
					> <br>
				</form>
			</div>
		</blockquote>
	</body>
</html>