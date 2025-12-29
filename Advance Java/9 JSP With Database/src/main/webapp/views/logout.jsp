<% 
	session.setAttribute("email", null);
	session.setAttribute("message", null);
	session.invalidate();
	response.sendRedirect("login.jsp");
%>
