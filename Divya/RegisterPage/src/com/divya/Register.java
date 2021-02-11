package com.divya;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Register implements Servlet {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
	{
		String fs=req.getParameter("firstName");
		String ls=req.getParameter("lastName");
		String ph=req.getParameter("phNo");
		String mail=req.getParameter("mailId");
		String m=req.getParameter("male");
		String f=req.getParameter("female");
		String pass=req.getParameter("password");
		String Cpass=req.getParameter("cPass");
		PrintWriter pw=res.getWriter();
		pw.write("<html>");
		pw.write("<body>");
		pw.write("<p1>Registration Succesfull</p1>");
		pw.write("</body>");
		pw.write("</html>");
	}

}
