package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class ServletDemo2 implements Servlet{
	
	ServletConfig servletConfig = null;
	
	@Override
	public void init(ServletConfig config) throws ServletException{
		this.servletConfig=config;
	}
	
	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException,IOException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("Servlet created by <h2>implementing Servlet Interface</h2>");
	}
	
	@Override 
	public void destroy() {}
	
	@Override
	public ServletConfig getServletConfig() {
		return servletConfig;
	}
	
	@Override
	public String getServletInfo() {
		return "created by ITEP-16";
	}
}

















