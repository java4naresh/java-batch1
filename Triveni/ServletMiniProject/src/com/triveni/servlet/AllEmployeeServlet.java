package com.triveni.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AllEmployeeServlet
 */
@WebServlet(name = "allEmployees", urlPatterns = { "/allEmployees" })
public class AllEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private Connection con;
	private PreparedStatement pst = null;
	private ResultSet rs = null;
	
	private static final  String SELECT_Query="select empId,empName,empSalary,empDesignation from employe";

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

	public AllEmployeeServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {


			PreparedStatement pst=con.prepareStatement(SELECT_Query);
			ResultSet rs=pst.executeQuery();
			PrintWriter pw=response.getWriter();
			pw.write("<html>");
			pw.write("<body>");
			pw.write("<center>");
            pw.write("<table>");
            pw.write("<tr>");
            pw.write("<th>EmpId</th><th>EmpName</th><th>EmpSalary</th><th>EmpDesignation</th>");
            pw.write("</tr>");
			while (rs.next()) {
				pw.write("<tr>");
				pw.write("<td>" + rs.getInt("empId") + "</td>");
				pw.write("<td>" + rs.getString("empName") + "</td>");
				pw.write("<td>" + rs.getInt("empSalary") + "</td>");
				pw.write("<td>" + rs.getString("empDesignation") + "</td>");
				pw.write("<td><a href=deleteEmployee?empId="+rs.getInt("empId")+">delete<a></td>");
				pw.write("<td><a href=editEmployee?empId="+rs.getInt("empId")+">Edit<a></td>");
				pw.write("</tr>");
			}
			pw.write("</table>");
			pw.write("</center>");
			pw.write("</body>");
			pw.write("</html>");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
