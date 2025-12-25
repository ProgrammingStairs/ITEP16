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
				pageContext.setAttribute("email", email,PageContext.SESSION_SCOPE);
				response.sendRedirect("welcome1.jsp");
			}else{
				response.sendRedirect("index3.jsp");
			}
		%>
	</body>
</html>