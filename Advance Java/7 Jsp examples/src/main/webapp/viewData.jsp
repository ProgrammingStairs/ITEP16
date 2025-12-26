<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% 
		String name = request.getParameter("username");
		String email= request.getParameter("email");
		String age = request.getParameter("age");
	%>
	<h2>Username : <%=name%></h2>
	<h2>Email : <%=email%></h2>
	<h2>Age : <%=age%></h2>
</body>
</html>