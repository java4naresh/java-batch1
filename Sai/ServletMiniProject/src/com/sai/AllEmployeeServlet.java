package com.sai;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
    private PreparedStatement ps=null;
    private ResultSet rs=null;
    private static final String SELECT_QUERY="select empName,empSalary,empId,designation from employee";
	@Override
	public void init() {
		   try {
				Class.forName("com.mysql.jdbc.Driver");
				 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javabatch", "root", "sai25");
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
	@Override
	public void destroy(){
		try {
			con.close();
			rs.close();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AllEmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	     try {
	    	 PrintWriter pw=response.getWriter();
			PreparedStatement ps=con.prepareStatement(SELECT_QUERY);
			ResultSet rs=ps.executeQuery();
			pw.write("<html>");
			pw.write("<body>");
            pw.write("<table>");
            pw.write("<tr>");
            pw.write("<th>Employee Name</th><th>Employee Id</th><th>Designation</th><th>Salary</th>");
            pw.write("</tr>");
			while (rs.next()) {
				int empid=rs.getInt("empId");
				pw.write("<tr>");
				pw.write("<td>" + rs.getString("empName") + "</td>");
				pw.write("<td>" + empid+ "</td>");
				pw.write("<td>" + rs.getString("designation") + "</td>");
				pw.write("<td>" + rs.getInt("empsalary") + "</td>");
				pw.write("<td><a href=deleteEmployee?empId="+empid+">delete<a></td>");
				pw.write("<td><a href=editEmployee?empId="+empid+">edit<a></td>");
				pw.write("</tr>");
			}
			pw.write("</table>");
			pw.write("</body>");
			pw.write("</html>");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
