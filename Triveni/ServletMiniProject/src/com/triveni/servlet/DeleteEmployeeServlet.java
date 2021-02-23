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
 * Servlet implementation class DeleteEmployeeServlet
 */
@WebServlet(name = "deleteEmployee", urlPatterns = { "/deleteEmployee" })
public class DeleteEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteEmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    private Connection con;
	private PreparedStatement pst = null;
	private ResultSet rs = null;
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

	private static final  String DELETE_Query="delete from employe where empId=?";
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		String empIdstr=request.getParameter("empId");
		int empId=Integer.parseInt(empIdstr);
		try {
			PreparedStatement pst=con.prepareStatement(DELETE_Query);
			pst.setInt(1, empId);
			pw.write("<html>");
			pw.write("<body>");
			pw.write("<center>");
			
			if(pst.executeUpdate()!=0) {
				pw.write("<p1 style=color:Green>Employee Deleted Successfully</p1>");
			}
			else pw.write("<p1 style=color:red>Employee NotDeleted Successfully</p1>");
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
