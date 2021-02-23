package com.divya.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class AddStudent
 */
@WebServlet(name = "addStudent", urlPatterns = { "/addStudent" })
public class AddStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private Connection conn;
	private PreparedStatement ps=null;
	private ResultSet rs=null;
	
	private static final String INSERT_QUERY="insert into javabatch1.student(Id,Name,Email,Branch,PhNo) values(?,?,?,?,?)";
	
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
    public AddStudent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String idStr=request.getParameter("id");
		int id=Integer.parseInt(idStr);
		String name=request.getParameter("name");
		String emailId=request.getParameter("email");
		String branch=request.getParameter("branch");
		String phNoStr=request.getParameter("phNo");
		int phNo=Integer.parseInt(phNoStr);
		try 
		{
			PreparedStatement ps=conn.prepareStatement(INSERT_QUERY);
			ps.setInt(1,id);
			ps.setString(2,name);
			ps.setString(3,emailId);
			ps.setString(4,branch);
			ps.setInt(5,phNo);
			PrintWriter pw=response.getWriter();
			pw.write("<html>");
			pw.write("<body>");
			pw.write("<center>");
			if(ps.executeUpdate() != 0)
			{
				pw.write("<p1 style=color:green>Student Details Inserted Succesfully</p1><br>");

			}
			else
			{
				pw.write("<p1 style=color:red>Student Details Insertion Failed</p1><br>");

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
	}

}
