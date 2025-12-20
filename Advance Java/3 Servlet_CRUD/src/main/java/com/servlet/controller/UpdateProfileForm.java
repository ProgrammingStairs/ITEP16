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

public class UpdateProfileForm extends HttpServlet{
	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
	 	String email = (String)session.getAttribute("email");
	 	UserDao userDao = new UserDao();
	 	
	 	// checking starts
	 	String urlEmail = request.getParameter("email");
	 	String em = urlEmail==null ? email : urlEmail;
	 	System.out.println("============ urlEmail : "+em);
	 	// checking ends
	 	
	 	UserDto user = userDao.getUserByEmail(em);
	 	
		RequestDispatcher rd = request.getRequestDispatcher("profileHeader.html");
		rd.include(request, response);
		out.print("<blockquote><div>");
		out.print("<h2>Welcome "+email+"</h2>");
		out.print("<div>");
		out.print("<h2>Update Form</h2>");
		out.print("<form action='UpdateServlet' method='post'>");
		//out.print("<input type='hidden' value='<%=user.getUid()%>' placeholder='Enter Uid' name='username' id='username' required> <br>");
		out.print("<input type='text' value='"+user.getUsername()+"' placeholder='Enter Username' name='username' id='username' required> <br>");
		out.print("<input type='email' value='"+user.getEmail()+"' readonly placeholder='Enter Email' name='email' id='email' required> <br>");
		out.print("<input type='text' value='"+user.getPassword()+"' placeholder='Enter Password' name='password' id='password' required> <br>");
		out.print("<input type='address' value='"+user.getAddress()+"' placeholder='Enter Address' name='address' id='address' required> <br>");
		out.print("<br> <br>");
		out.print("<input type='submit' value='Update'>");
		out.print("<input type='reset' value='Reset'> <br>");
		out.print("</form>");
		out.print("</div>");

		
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