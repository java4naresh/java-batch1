package com.triveni.httpservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HttpServlet
 */
public class HttpServletExpl extends javax.servlet.http.HttpServlet {
	private static final long serialVersionUID = 1L;
	PreparedStatement pstmt = null;
	Connection con = null;

	/*
	 * Student s = new Student(null, null, null, 0); {
	 * 
	 * }
	 */
	public void destroy() {
		try {
			con.close();
			pstmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public HttpServletExpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void init(ServletConfig config) {

		String userName = config.getInitParameter("userName");
		String pwd = config.getInitParameter("pwd");
		System.out.println(userName + "" + pwd);
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/javabatch1";
			con = DriverManager.getConnection(url, userName, pwd);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String firstName = req.getParameter("firstName");
		String lastName = req.getParameter("lastName");
		String emailId = req.getParameter("emailId");
		String phoneNo = req.getParameter("phoneNo");

		PrintWriter pw = resp.getWriter();
		pw.write("<html>");
		pw.write("<body>");
		pw.write("<h1>Student Registration Form </h1>");
		try {

			String query = "insert into Student values(?,?,?,?)";
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, firstName);
			pstmt.setString(2, lastName);
			pstmt.setString(3, emailId);
			pstmt.setString(4, phoneNo);

			int x = pstmt.executeUpdate();

			if (x == 1) {
				pw.println("Values Inserted Successfully");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pw.write("</html>");
		pw.write("</body>");
		pw.close();
	}
}
