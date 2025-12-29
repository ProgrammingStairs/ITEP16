<jsp:useBean id="userDao" class="com.jsp.dao.UserDao"></jsp:useBean>>
<%
	String email = request.getParameter("email");
	String password = request.getParameter("password");
	boolean status = userDao.loginUser(email, password);
	if(status){
		session.setAttribute("email", email);	
		session.setAttribute("message", "Welcome to JSP");
%>
	<jsp:forward page="profile.jsp"></jsp:forward>
<%
	}else{
		out.print("<script>alert('Error while Login')</script>");
%>
	<jsp:forward page="login.jsp"></jsp:forward>	
<%
	}
%>