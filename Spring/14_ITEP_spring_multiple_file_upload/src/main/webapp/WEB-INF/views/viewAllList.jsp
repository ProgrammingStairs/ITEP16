<%@page import="com.spring.entity.UserEntity"%>
<%@page import="java.util.List"%>
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
	<% Object obj = request.getAttribute("listData"); 
	if(obj!=null && obj instanceof List<?>){	
	List<UserEntity> list = ((List<UserEntity>)obj);
	%>
		<table border="1" cellspacing="0" cellpadding="8">
			<tr>
				<th>Uid</th>
				<th>Username</th>
				<th>Description</th>
				<th>UploadAt</th>
				<th>Image</th>
			</tr>
			<% for(UserEntity user : list){
			   String fileNames[] = user.getFilename().split(",");	 	
			%>
			<tr>
				<td><%= user.getUid()%></td>
				<td><%= user.getUsername()%></td>
				<td><%= user.getDescription()%></td>
				<td><%= user.getUploadat()%></td>
				<td>
				<% for(String fileName : fileNames){%>
					<a href="uploads/<%=fileName%>" download>
						<img src="uploads/<%=fileName%>" height="40" width="60" alt="image">
					</a>
					<%} %>
				</td>
			</tr>
			<%} %>
		</table>
	<%}else{ %>
	<div>No Record Found</div>
	<%} %>
</body>
</html>