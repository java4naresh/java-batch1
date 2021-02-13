package com.naresh.http;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HttpServletExample
 */
public class HttpServletExample extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private Connection con;
	private PreparedStatement pst = null;
    private ResultSet rs = null;
	
	@Override
	public void init(ServletConfig arg0) throws ServletException {
      try {
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javabatch1", "root", "root");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		
	}
	}
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HttpServletExample() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String empIdStr = request.getParameter("empId");
		int empId = Integer.parseInt(empIdStr);
		try {
			pst = con.prepareStatement("select empId,addId,city,empName,salary from employee where empId=?");
			pst.setInt(1, empId);
			rs = pst.executeQuery();
			PrintWriter pw = response.getWriter();
			pw.write("<html>");
			pw.write("<body>");
            pw.write("<table>");
            pw.write("<tr>");
            pw.write("<th>EmpId</th><th>AddId</th><th>City</th><th>EmpName</th><th>Salary</th>");
            pw.write("</tr>");
			while (rs.next()) {
				pw.write("<tr>");
				pw.write("<td>" + rs.getInt("empId") + "</td>");
				pw.write("<td>" + rs.getInt("addId") + "</td>");
				pw.write("<td>" + rs.getString("city") + "</td>");
				pw.write("<td>" + rs.getString("empName") + "</td>");
				pw.write("<td>" + rs.getInt("salary") + "</td>");
				pw.write("</tr>");
			}
			pw.write("</table>");
			pw.write("</body>");
			pw.write("</html>");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

		}
	}

}
