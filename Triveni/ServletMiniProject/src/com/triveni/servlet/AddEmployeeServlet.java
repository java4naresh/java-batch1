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
 * Servlet implementation class AddEmployeeServlet
 */
@WebServlet(name = "addEmployee", urlPatterns = { "/addEmployee" })
public class AddEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection con;
	private PreparedStatement pst = null;
	private ResultSet rs = null;
	
	private static final  String INSERT_Query="insert into employee(empId,empName,empSalary,empDesignation)values(?,?,?,?)";

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

	public AddEmployeeServlet() {
		super();
		// TODO Auto-generated constructor stub
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

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String empIdstr=request.getParameter("empId");
		int empId=Integer.parseInt(empIdstr);
		String empName=request.getParameter("empName");
		String empSalarystr=request.getParameter("empSalary");
		int empSalary=Integer.parseInt(empSalarystr);
		String empDesignation=request.getParameter("empDesignation");
		try {
			PreparedStatement pst=con.prepareStatement(INSERT_Query);
			pst.setInt(1,empId);
			pst.setString(2,empName);
			pst.setInt(3,empSalary);
			pst.setString(4,empDesignation);
			PrintWriter pw=response.getWriter();
			pw.write("<html>");
			pw.write("<body>");
			pw.write("<center>");
			
			if(pst.executeUpdate()!=0) {
				pw.write("<p1 style=color:Green>Employee Inserted Successfully</p1>");
			}
			else pw.write("<p1 style=color:red>Employee NotInserted Successfully</p1>");
			pw.write("<br><a href='index.html'>Home</a>");
	

			pw.write("</center>");
			pw.write("</body>");
			pw.write("</html>");
			 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
