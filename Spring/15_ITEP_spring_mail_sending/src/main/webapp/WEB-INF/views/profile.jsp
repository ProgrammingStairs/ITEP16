<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Welcome To Profile Page</h2>
	<% 
		HttpSession session1 = request.getSession();
	    String email = (String)session1.getAttribute("email");
	%>
	<%= "Hello "+email %>
	<h2>
		<a href="${pageContext.request.contextPath}/logout">Logout</a>
	</h2>
</body>
</html>