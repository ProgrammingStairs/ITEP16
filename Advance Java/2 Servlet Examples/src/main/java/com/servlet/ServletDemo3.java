package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class ServletDemo3 extends GenericServlet{
	
	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException,IOException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("Servlet created by <h2>extending GenericServlet class</h2>");
	}
	
}

















