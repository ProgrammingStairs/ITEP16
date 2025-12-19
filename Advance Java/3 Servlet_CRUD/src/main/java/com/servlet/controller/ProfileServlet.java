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
import jakarta.servlet.http.HttpSession;

public class ProfileServlet extends HttpServlet{
	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		/*
		out.print("<link href='css/style.css' rel='stylesheet'>");		
		out.print("<body>");
		out.print("<blockquote>");
		out.print("<h2>Servlet CRUD Example</h2>");
		out.print("<div id='nav'>");
		out.print("<ul>");
		out.print("<li>Welcome </li>");
		out.print("<li><a href='ProfileServlet'>Home</a></li>");
		out.print("<li><a href=''>Update</a></li>");
		out.print("<li><a href=''>DeActivate</a></li>");
		out.print("<li><a href=''>Logout</a></li>");
		out.print("</ul>");
		out.print("</div>");
		out.print("<div>");
		out.print("<h2>Profile</h2>");
		out.print("<p>");
		out.print("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum");
		out.print("</p>");
		out.print("</div>");
		out.print("</blockquote>");
		out.print("</body>");
		*/
		HttpSession session = request.getSession();
	 	String email = (String)session.getAttribute("email");
	 	
		RequestDispatcher rd = request.getRequestDispatcher("profileHeader.html");
		rd.include(request, response);
		out.print("<blockquote><div>");
		out.print("<h2>Welcome "+email+"</h2>");
		out.print("<p>");
		out.print("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum");
		out.print("</p>");
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