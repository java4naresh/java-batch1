package com.divya;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class GenericServletEx extends javax.servlet.GenericServlet
{
	Connection conn=null;
	@Override
	public void init(ServletConfig config) throws ServletException
	{
		String un=config.getInitParameter("userName");
		String pwd=config.getInitParameter("password");
		System.out.println(un);
		System.out.println(pwd);
		//System.out.println(un+" "+pwd);
		 try
		 {
			 Class.forName("com.mysql.jdbc.Driver");
			 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javabatch1",un,pwd);
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
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
	{
		String id=req.getParameter("empId");
		int empId=Integer.parseInt(id);
		try
		{
			PreparedStatement ps=conn.prepareStatement("select empName from employee where empId=?");
			ps.setInt(1, empId);
			ResultSet rs=ps.executeQuery();
			PrintWriter pw=res.getWriter();
			pw.write("<html>");
			pw.write("<body>");
			
			while(rs.next())
			{
			    //System.out.println(rs.getString("empName"));
				pw.write("<p1>"+rs.getString("empName")+"</p1>");

			}
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
