package com.servlet.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.servlet.dao.UserDao;
import com.servlet.dto.UserDto;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class ViewAllUsersServlet extends HttpServlet{
	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
	 	String email = (String)session.getAttribute("email");
	 	
	 	UserDao userDao = new UserDao();
	 	List<UserDto> userDtoArray = userDao.getAllUsers();
	 	
		RequestDispatcher rd = request.getRequestDispatcher("profileHeader.html");
		rd.include(request, response);
		out.print("<blockquote><div>");

	 	out.print("<bloclquote><table border='1' cellspacing='0' cellpadding='8'><caption> <h2>All User List </h2> </caption><tr><th>UserId</th><th>Username</th><th>Email</th><th>Password</th><th>Address</th><th colspan='2'>Action</th></tr>");
	 	for(UserDto user :  userDtoArray) {
	 		out.print("<tr><td>"+user.getUid()+"</td><td>"+user.getUsername()+"</td><td>"+user.getEmail()+"</td><td>"+user.getPassword()+"</td><td>"+user.getAddress()+"</td><td><a href='UpdateProfileForm?email="+user.getEmail()+"'>Update</a></td><td>Delete</td></tr>");
	 	}
	 	out.print("</table>");
		out.print("</div></blockquote>");
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		processRequest(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		processRequest(request, response);
	}
}