package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{
	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		if(email.equals("andrew@gmail.com") && password.equals("andrew@123")) {
			
			Cookie cookie = new Cookie("email",email);
			cookie.setMaxAge(60*60*24); // for making persistence
// if we not write setmax age method then it will be non persistence			
			response.addCookie(cookie);
			
			out.print("<script>alert('Cookie setted successfully | Now you can go on profile')</script>");
			RequestDispatcher rd = request.getRequestDispatcher("login.html");
			rd.include(request, response);
			
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