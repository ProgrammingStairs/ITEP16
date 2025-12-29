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
					<li><a href="${pageContext.request.contextPath}/views/profile.jsp">Home</a></li>
					<li><a href="${pageContext.request.contextPath}/views/update.jsp">UpdateProfile</a></li>
					<li><a href="${pageContext.request.contextPath}/views/viewAll.jsp">ViewAll</a></li>
					<li><a href="${pageContext.request.contextPath}/views/viewAll.jsp">DeActivate</a></li>
					<li><a href="${pageContext.request.contextPath}/views/logout.jsp">Logout</a></li>
				</ul>
			</div>
			<div>
				<% 
					String email = (String)session.getAttribute("email"); 
				  	String message = (String)session.getAttribute("message");
				%>
				<h2>Welcome <%=email %></h2>
				<h3><%=message %></h3>
				<p>
				Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum
				</p>
			</div>
		</blockquote>
	</body>
	</html>