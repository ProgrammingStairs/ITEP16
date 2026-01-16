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
		<jsp:include page="headerProfile.jsp"></jsp:include>
		<% 
			String email = (String)session.getAttribute("email");
		%>
		<h2>Welcome <%=email%></h2>
		<h2>Update Form</h2>
		<form action="" method="post">
			<input type="text" placeholder="Enter Username" id="username" name="username"/>
			
			<input type="email" placeholder="Enter Email" id="email" name="email"/>
			
			<input placeholder="Enter Password" id="password" name="password"/>
			
			<input id="male" value="male" name="gender"/>Male
			<input id="female" value="female" name="gender"/>Female
			
			<input id="cricket" value="Cricket" name="hobbies"/>Cricket
			<input id="football" value="Football" name="hobbies"/>Football
			
			<select id="subject" name="subject">
				<option value="">Select Subject</option>
				<option value="C Language">C Language</option>
				<option value="Java">Java</option>
				<option value="Python">Python</option>
				<option value="React js">React js</option>
			</select>
			
			<!-- need to change type submit -->
			<button type="button">Update</button>
			<button type="reset">Reset</button>

		</form>
	</blockquote>
</body>
</html>