package com.triveni.genericservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class GenericServletExmpl extends GenericServlet {
	@Override
	public void init(ServletConfig config) {
		String userName = config.getInitParameter("userName");
		String pwd = config.getInitParameter("pwd");
		System.out.println(userName + "" + pwd);
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter ps = res.getWriter();
		ps.write("<html>");
		ps.write("<body>");
		ps.write("<p1>Welcome to Generic ServletPage</p1>");
		ps.write("</html>");
		ps.write("</body>");
	}

}
