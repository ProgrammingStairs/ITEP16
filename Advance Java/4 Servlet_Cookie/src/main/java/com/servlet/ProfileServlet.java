package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ProfileServlet extends HttpServlet{
	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		Cookie cks[] = request.getCookies();
		if(cks!=null) {
			for(Cookie cookie : cks) {
				if(cookie.getName().equals("email")) {
					RequestDispatcher rd = request.getRequestDispatcher("index.html");
					rd.include(request, response);					
					out.print("Welcome  "+cookie.getValue()+"&nbsp;&nbsp;|&nbsp;&nbsp;<a href='LogoutServlet'>Logout</a>");
				}else {
					out.print("<script>alert('Please Login First')</script>");
					RequestDispatcher rd = request.getRequestDispatcher("index.html");
					rd.include(request, response);					
				}
			}
		}else {
			out.print("<script>alert('Please Login First')</script>");
			RequestDispatcher rd = request.getRequestDispatcher("index.html");
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