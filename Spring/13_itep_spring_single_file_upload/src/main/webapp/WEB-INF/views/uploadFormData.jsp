<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="css/style.css" rel="stylesheet">
</head>
<body>
	<%@include file="header.jsp" %>	
	<h2>Upload Data</h2>
	<h3>${message}</h3>
	<form action="${pageContext.request.contextPath}/uploadFormData" method="post" enctype="multipart/form-data">
		<input
			type="text"
			name="username"
			id="username"
			placeholder="Enter Username"
			required
		> <br>
		<textarea
			name="description"
			id="description"
			placeholder="Enter Description"
			required
			rows="3"
			cols="21"
		></textarea> <br>
		<input
			type="file"
			name="filename"
			id="filename"
			required
		> <br>
		<input
			type="submit"
			value="Upload"
		>
		<input
			type="reset"
			value="Reset"
		>
	</form>
</body>
</html>