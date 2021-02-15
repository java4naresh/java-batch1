package com.divya;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class GenericServletEx extends GenericServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1321136903911545442L;

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
	{
		PrintWriter pw=res.getWriter();
		pw.write("<html>");
		pw.write("<body>");
		pw.write("<p1>Generic Servlet</p1>");
		pw.write("</body>");
		pw.write("</html>");
	}

}
