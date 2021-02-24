package com.divya.servlet;

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
 * Servlet implementation class AllStudents
 */
@WebServlet(name = "allStudents", urlPatterns = { "/allStudents" })
public class AllStudents extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private Connection conn;
	private PreparedStatement ps=null;
	private ResultSet rs=null;
	
	private static final String SELECT_QUERY="select Id,Name,Email,Branch,PhNo from javabatch1.student";

	
	@Override
	public void init()
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
	@Override
	public void destroy()
	{
	
		try 
		{
			conn.close();
			ps.close();
			rs.close();
		} 
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AllStudents() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		try 
		{
			PrintWriter pw=response.getWriter();
			ps=conn.prepareStatement(SELECT_QUERY);
			ResultSet rs=ps.executeQuery();
			pw.write("<html>");
			pw.write("<body>");
			pw.write("<center>");
			pw.write("Welcome to All Students");
			pw.write("<table>");
			pw.write("<tr>");
			pw.write("<th>Student ID</th><th>Student Name</th><th>Email ID</th><th>Branch</th><th>Mobile Number</th>");
			pw.write("</tr>");
			while(rs.next())
			{
				int id=rs.getInt("Id");
				pw.write("<tr>");
				pw.write("<td>"+id+"</td>");
				pw.write("<td>"+rs.getString("Name")+"</td>");
				pw.write("<td>"+rs.getString("Email")+"</td>");
				pw.write("<td>"+rs.getString("Branch")+"</td>");
				pw.write("<td>"+rs.getInt("PhNo")+"</td>");
				pw.write("<td><a href=deleteServlet?Id="+id+">Delete</a></td>");
				pw.write("<td><a href=editStudent?Id="+id+">Edit</a></td>");
				pw.write("</tr>");
			}
			pw.write("<br><a href=index.html>Home</a>");
			pw.write("</table>");
			pw.write("</center>");
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
