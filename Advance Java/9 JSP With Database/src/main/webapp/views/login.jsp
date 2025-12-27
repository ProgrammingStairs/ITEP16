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
			<h2>JSP CRUD Example</h2>
			<div id="nav">
				<ul>
					<li><a href="${pageContext.request.contextPath}/index.jsp">Home</a></li>
					<li><a href="<%=request.getContextPath()%>/views/login.jsp">Login</a></li>
					<li><a href="${pageContext.request.contextPath}/views/register.jsp">Register</a></li>
					<li><a href="">About</a></li>
					<li><a href="">Contact</a></li>
				</ul>
			</div>
			<div>
				<h2>Login Form</h2>
				<form action="LoginServlet" method="post">
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