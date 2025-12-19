package com.servlet.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.servlet.dao.UserDao;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet{
	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		UserDao userDao = new UserDao();
		boolean status = userDao.loginUser(email, password);
		if(status) {
			HttpSession session =  request.getSession();
			session.setAttribute("email", email);
			
			RequestDispatcher rd = request.getRequestDispatcher("ProfileServlet");
			rd.forward(request, response);
		}else {
			out.print("<script>alert('Error while Login')</script>");
			RequestDispatcher rd = request.getRequestDispatcher("login.html");
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