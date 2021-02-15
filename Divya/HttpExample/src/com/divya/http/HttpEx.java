package com.divya.http;

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
 * Servlet implementation class HttpEx
 */
public class HttpEx extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection conn;
	
	@Override
	public void init(ServletConfig config) throws ServletException
	{
	   try
	   {
		 Class.forName("com.mysql.jdbc.Driver");
		 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javabatch1","root","4420");
	   } 
	   catch (SQLException e)
	   {
		// TODO Auto-generated catch block
		e.printStackTrace();
	   }
	   catch (ClassNotFoundException e) 
	  {
		// TODO Auto-generated catch block
		e.printStackTrace();
	  }
	}
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HttpEx() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		//String id=request.getParameter("empId");
		//int empId=Integer.parseInt(id);
		try
		{
			PreparedStatement ps=conn.prepareStatement("select * from employee");
			//ps.setInt(1, empId);
			ResultSet rs=ps.executeQuery();
			PrintWriter pw=response.getWriter();
			pw.write("<html>");
			pw.write("<body>");
			pw.write("<table>");
			pw.write("<tr>");
			pw.write("<th>EmpId</th><th>EmpName</th><th>Designation</th><th>Salary</th>");
			pw.write("</tr>");
			while(rs.next())
			{
			    //System.out.println(rs.getString("empName"));
				pw.write("<tr>");
				pw.write("<td>"+rs.getInt("empId")+"</td>");
				pw.write("<td>"+rs.getString("empName")+"</td>");
				pw.write("<td>"+rs.getString("designation")+"</td>");
				pw.write("<td>"+rs.getInt("sal")+"</td>");
				pw.write("</tr>");

			}
			pw.write("</table>");
			pw.write("</body>");
			pw.write("</html>");
		} 
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
