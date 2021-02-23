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
 * Servlet implementation class Edit
 */
@WebServlet(name = "editStudent", urlPatterns = { "/editStudent" })
public class EditStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private Connection conn;
	private PreparedStatement ps=null;
	private ResultSet rs=null;
	
	private static final String EDIT_QUERY="update javabatch1.student set Name=?,Email=?,Branch=?,PhNo=? where Id=?";
	private static final String SELECT_QUERY="select Id,Name,Email,Branch,PhNo from javabatch1.student where Id=?";
	
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
    public EditStudent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter pw=response.getWriter();
		try
		{
			String idStr=request.getParameter("Id");
			int id=Integer.parseInt(idStr);
			PreparedStatement ps=conn.prepareStatement(SELECT_QUERY);
			ps.setInt(1,id);
			ResultSet rs=ps.executeQuery();
			pw.write("<html>");
			pw.write("<body>");
			pw.write("<center>");
			pw.write("<form method='post'>");
			while(rs.next())
			{
				int id1=rs.getInt("Id");
				pw.write("Student ID:<input type='text' name='id' value="+id1+"><br>");
				pw.write("Student Name:<input type='text' name='name' value="+rs.getString("Name")+"><br>");
				pw.write("Email Id:<input type='email' name='email' value="+rs.getString("Email")+"><br>");
				pw.write("Branch:<input type='text' name='branch' value="+rs.getString("Branch")+"><br>");
				pw.write("Mobile Number:<input type='text' name='phNo' value="+rs.getInt("PhNo")+"><br>");
				pw.write("<input type='submit' name='edit'>");	
			}
			pw.write("</form>");
			pw.write("</center>");
			pw.write("</body>");
			pw.write("</html>");

		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//pw.write("Edited Student Details Succesfully");
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		try 
		{
			String idStr=req.getParameter("id");
			int id=Integer.parseInt(idStr);
			String phNoStr=req.getParameter("phNo");
			int phNo=Integer.parseInt(phNoStr);
			PreparedStatement ps=conn.prepareStatement(EDIT_QUERY);
			//ps.setInt(1,id);
			ps.setString(1,req.getParameter("name"));
			ps.setString(2,req.getParameter("email"));
			ps.setString(3,req.getParameter("branch"));
			ps.setInt(4,phNo);
			ps.setInt(5,id);

			
			PrintWriter pw=resp.getWriter();
			pw.write("<html>");
			pw.write("<body>");
			pw.write("<center>");
			if(ps.executeUpdate() != 0)
			{
				pw.write("<p1 style=color:green>Student Details Edited Succesfully</p1><br>");

			}
			else
			{
				pw.write("<p1 style=color:red>Student Details Editing Failed</p1><br>");

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
		//resp.getWriter().append("doPost");
	}

}
