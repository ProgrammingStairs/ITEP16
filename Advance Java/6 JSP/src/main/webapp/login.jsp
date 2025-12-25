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
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			
			if(email.equals("andrew@gmail.com") && password.equals("andrew@123")){
				session.setAttribute("email", email);
				response.sendRedirect("welcome.jsp");
			}else{
				response.sendRedirect("index2.jsp");
			}
		%>
	</body>
</html>