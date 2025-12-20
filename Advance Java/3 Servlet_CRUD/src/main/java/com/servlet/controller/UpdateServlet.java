package com.servlet.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.servlet.dao.UserDao;
import com.servlet.dto.UserDto;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class UpdateServlet extends HttpServlet{
	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String username = request.getParameter("username");
		String email= request.getParameter("email");
		String password = request.getParameter("password");
		String address = request.getParameter("address");
		
		//System.out.println(username+" , "+email+" , "+password+" , "+address);
		UserDto userDto = new UserDto();
		userDto.setUsername(username);
		userDto.setEmail(email);
		userDto.setPassword(password);
		userDto.setAddress(address);
		
		UserDao userDao = new UserDao();
		int i = userDao.updateUser(userDto);
		if(i!=0) {
			System.out.println("User Updated successfully");
			out.print("<script>alert('User Updated successfully')</script>");
			RequestDispatcher rd = request.getRequestDispatcher("ProfileServlet");
			rd.include(request, response);
			
		}
		else {
			System.out.println("Error while Updating User");
			out.print("<script>alert('Error while Updating User')</script>");
			RequestDispatcher rd = request.getRequestDispatcher("UpdateProfileForm");
			rd.include(request, response);
		}
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