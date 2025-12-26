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
	<h2>Details : </h2>
	<b>Username : <jsp:getProperty name="obj" property="username"/> </b><br>
	<b>Email : <jsp:getProperty name="obj" property="email"/> </b><br>
	<b>Password : <jsp:getProperty name="obj" property="password"/> </b><br>
 -->

<!-- request scope -->
	<jsp:useBean id="obj1" class="com.servlet.Dto.Student" scope="request"/>	
	<h2>Details : </h2>
	<b>Username : <jsp:getProperty name="obj1" property="username"/> </b><br>
	<b>Email : <jsp:getProperty name="obj1" property="email"/> </b><br>
	<b>Password : <jsp:getProperty name="obj1" property="password"/> </b><br>

	
</body>
</html>