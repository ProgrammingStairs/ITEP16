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
		String driver = config.getInitParameter("driver");
		out.print("Driver Name : "+driver);
		
		String project = application.getInitParameter("project");
		out.print("<br>Project Name : "+project);
	%>
</body>
</html>