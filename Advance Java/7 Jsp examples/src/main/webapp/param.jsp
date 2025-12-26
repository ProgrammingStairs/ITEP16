<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:forward page="viewData.jsp">
		<jsp:param name="username" value="Andrew Anderson"></jsp:param>
		<jsp:param name="email" value="andrew@gmail.com"></jsp:param>
		<jsp:param name="age" value="56"></jsp:param>
	</jsp:forward>
</body>
</html>