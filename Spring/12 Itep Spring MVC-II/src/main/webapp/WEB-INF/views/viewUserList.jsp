<%@page import="com.springboot.entity.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	(()=>{
		window.history.forward();
	})();
</script>
</head>
<body>
	<blockquote>
		<h2>Example of Spring MVC</h2>
		<jsp:include page="headerProfile.jsp"></jsp:include>
		<% 
			String email = (String)session.getAttribute("email");
		%>
		<h2>Welcome <%=email%></h2>
		<% 
			Object obj = request.getAttribute("userList");
	//		System.out.println(">>>>>>>>>>>>>>>>>>>>>> "+obj);
			if(obj!=null && obj instanceof List<?> ){
				List<User> users = (List<User>)obj;
		%>
		<h3>User List</h3>
		<h4>${message}</h4>
			<table border="1" cellspacing="0" cellpadding="6">
				<tr>
					<th>Id</th>
					<th>Username</th>
					<th>Email</th>
					<th>Password</th>
					<th>Gender</th>
					<th>Hobbies</th>
					<th>Subject</th>
					<th colspan="2">Action</th>
				</tr>
				<% for(User user : users){  %>
				<tr>
					<td><%= user.getUid()%></td>
					<td><%= user.getUsername()%></td>
					<td><%= user.getEmail()%></td>
					<td><%= user.getPassword()%></td>
					<td><%= user.getGender()%></td>
					<td><%= user.getHobbies()%></td>
					<td><%= user.getSubject()%></td>
					<td>
						<a href="${pageContext.request.contextPath}/updateUser/<%= user.getUid()%>">Update</a>
					</td>
					<td>
						<a href="${pageContext.request.contextPath}/deleteUser?uid=<%= user.getUid()%>">Delete</a>
					</td>
				</tr>
				<% } %>
			</table>
		<% }else{ %>
			<h3>No Record Found</h3>		
		<% } %>
	</blockquote>
</body>
</html>