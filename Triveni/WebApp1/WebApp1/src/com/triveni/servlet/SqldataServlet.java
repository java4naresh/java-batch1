package com.triveni.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SqldataServlet implements Servlet {



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
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter ps=res.getWriter();
		String id=req.getParameter("ID");
		System.out.print("<h1>Display The Triveni Table<h1>");
		System.out.print("<table><tr><th>ID</th><th>Name</th><th>Address</th></tr>");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javabatch1", "root", "12345");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from Triveni where ID="+id+"");
			while(rs.next()) {
				System.out.println("<tr><td>");
				System.out.println(rs.getInt(1));
				System.out.println("</td>");
				
				System.out.println("<td>");
				System.out.println(rs.getString(2));
				System.out.println("</td>");
				
				System.out.println("<td>");
				System.out.println(rs.getString(3));
				System.out.println("</td>");
				
			}
			
		}catch(Exception p) {
		System.out.println(p);

	}
		System.out.println("</table>");
}
}
