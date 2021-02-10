package com.naresh.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class HomeServlet implements Servlet {

	@Override
	public void destroy() {
		System.out.println("destroy");
	}

	@Override
	public ServletConfig getServletConfig() {
		return null;
	}

	@Override
	public String getServletInfo() {
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("init");
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("service");
		PrintWriter pw = res.getWriter();
		pw.write("<html>");
		pw.write("<body>");
		pw.write("<p1>Welcome to Home Page</p1>");
		pw.write("</body>");
		pw.write("</html>");
	}

}
