package com.triveni.servlet2;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SqldataServlet implements Servlet {
	private Connection con;
	PreparedStatement pst = null;
	ResultSet rs = null;

	@Override
	public void destroy() {
		try {

			pst.close();
			rs.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

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
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javabatch1", "root", "12345");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String IDstr = req.getParameter("id");
		int id = Integer.parseInt(IDstr);
	
		try {

			pst = con.prepareStatement("select * from emp where id=?");
			pst.setInt(1, id);
			rs = pst.executeQuery();
			PrintWriter ps = res.getWriter();
			ps.write("<html>");
			ps.write("<body>");

			while (rs.next()) {
				ps.write("<p1>" + rs.getString("id") + "</p1>");
				ps.write("<p1>" + rs.getString("name") + "</p1>");
				ps.write("<p1>" + rs.getString("address") + "</p1>");

			}
			ps.write("</html>");
			ps.write("</body>");

		} catch (Exception e) {
			e.printStackTrace();

		}
	}

}
