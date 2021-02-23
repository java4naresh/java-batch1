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
 * Servlet implementation class Delete
 */
@WebServlet(name = "deleteServlet", urlPatterns = { "/deleteServlet" })
public class DeleteStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private Connection conn;
	private PreparedStatement ps=null;
	private ResultSet rs=null;
	
	private static final String DELETE_QUERY="delete from student where Id=?";

	
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
    public DeleteStudent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter pw=response.getWriter();
		String idStr=request.getParameter("Id");
		int id=Integer.parseInt(idStr);
		try
		{
			ps=conn.prepareStatement(DELETE_QUERY);
			ps.setInt(1,id);
			pw.write("<html>");
			pw.write("<body>");
			pw.write("<center>");
			if(ps.executeUpdate() != 0)
			{
				pw.write("<p1 style=color:green>Student Details Deleted Succesfully</p1><br>");

			}
			else
			{
				pw.write("<p1 style=color:red>Student Details Deletion Failed</p1><br>");

			}
			pw.write("<a href=index.html>Home</a>");
			pw.write("</center>");
			pw.write("</body>");
			pw.write("</html>");
		} 
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//pw.write("Deleted Student Details Succesfully"+request.getParameter("Id"));
	}

}
