<%@page import="com.spring.entity.User"%>
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
		<%
			Object obj = request.getAttribute("userObj");
			User userObj = (User)obj;
		%>
		<form action="${pageContext.request.contextPath}/updateFormData" method="post">
			<input type="hidden" value="<%=userObj.getUid() %>" id="uid" name="uid"/><br>
			
			<input type="text" value="<%=userObj.getUsername()%>" placeholder="Enter Username" id="username" name="username"/><br>
			
			<input type="email" value="<%=userObj.getEmail()%>" placeholder="Enter Email" id="email" name="email"/><br>
			
			<input placeholder="Enter Password" value="<%=userObj.getPassword()%>" id="password" name="password"/><br>
		
			<input type="radio" id="male" name="gender" value="male"
    <%= "male".equalsIgnoreCase(userObj.getGender()) ? "checked" : "" %> />
<label for="male">Male</label>

<input type="radio" id="female" name="gender" value="female"
    <%= "female".equalsIgnoreCase(userObj.getGender()) ? "checked" : "" %> />
<label for="female">Female</label>
<br>		
	<% String hobbies = userObj.getHobbies();
	if(hobbies.equalsIgnoreCase("Cricket,Football")){%>
 <input type="checkbox" id="cricket" value="Cricket" name="hobbies" checked/>Cricket	
 <input type="checkbox" id="football" value="Football" name="hobbies" checked/>Football			
	<%}else if(hobbies.equalsIgnoreCase("Cricket")){%>
		 <input type="checkbox" id="cricket" value="Cricket" name="hobbies" checked/>Cricket	
		 <input type="checkbox" id="football" value="Football" name="hobbies" />Football	
		<%}else if(hobbies.equalsIgnoreCase("Football")){%>
		<input type="checkbox" id="cricket" value="Cricket" name="hobbies" />Cricket	
		 <input type="checkbox" id="football" value="Football" name="hobbies" checked/>Football	
		<% } %>		<br>
		
			
			<select id="subject"  name="subject">
				<option value="<%=userObj.getSubject() %>"><%=userObj.getSubject() %></option>
				<option value="C Language">C Language</option>
				<option value="Java">Java</option>
				<option value="Python">Python</option>
				<option value="React js">React js</option>
			</select> <br>
			
			<!-- need to change type submit or set input type="submit" -->
			<button type="submit">Update</button>
			<button type="reset">Reset</button>

		</form>
	</blockquote>
</body>
</html>