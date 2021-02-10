package com.webApp.divya;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Demo implements Servlet {

	public void destroy() {

	}

	public ServletConfig getServletConfig()
	{
		// TODO Auto-generated method stub
		return null;
	}

	public String getServletInfo() 
	{
		// TODO Auto-generated method stub
		return null;
	}

	public void init(ServletConfig arg0) throws ServletException 
	{
		// TODO Auto-generated method stub

	}

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		PrintWriter pw=res.getWriter();
		pw.write("<html>");
		pw.write("<body>");
		pw.write("<p1>Welcome to my page</p1>");
		pw.write("</body>");
		pw.write("</html>");

	}

}
