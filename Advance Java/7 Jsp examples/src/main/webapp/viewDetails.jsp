<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 
	// session scope 
	<jsp:useBean id="obj" class="com.servlet.Dto.Student" scope="session"/>
	<jsp:setProperty name="obj" property="*"/>
	
	
	<h2>Details : </h2>
	<b>Username : <jsp:getProperty name="obj" property="username"/> </b><br>
	<b>Email : <jsp:getProperty name="obj" property="email"/> </b><br>
	<b>Password : <jsp:getProperty name="obj" property="password"/> </b><br>

	<form action="viewAnother.jsp">
		<button>Submit</button>
	</form>
	
	 -->
	 <!-- request scope -->
	<jsp:useBean id="obj1" class="com.servlet.Dto.Student" scope="request"/>
	<jsp:setProperty name="obj1" property="*"/>
	
	
	<h2>Details... : </h2>
	<b>Username : <jsp:getProperty name="obj1" property="username"/> </b><br>
	<b>Email : <jsp:getProperty name="obj1" property="email"/> </b><br>
	<b>Password : <jsp:getProperty name="obj1" property="password"/> </b><br>

	<jsp:forward page="viewAnother.jsp"></jsp:forward>
</body>
</html>