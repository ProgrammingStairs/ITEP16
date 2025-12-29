
<jsp:useBean id="user" class="com.jsp.dto.UserDto"></jsp:useBean>
<jsp:setProperty name="user" property="*"/>
<jsp:useBean id="userDao" class="com.jsp.dao.UserDao"></jsp:useBean>

<%
	int i = userDao.addUser(user);
	if(i==1){
	out.print("<script>alert('User Added Successfully')</script>");
%>
	<jsp:include page="login.jsp"></jsp:include>
<%
	}else if(i==2){
	out.print("<script>alert('Email-Id Already Exist | Please try with another Email-Id')</script>");
%>
	<jsp:include page="register.jsp"></jsp:include>
<%}else{
	out.print("<script>alert('Something Went Wrong')</script>");
%>
	<jsp:include page="register.jsp"></jsp:include>	
<%}%>