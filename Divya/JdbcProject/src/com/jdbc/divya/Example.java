package com.jdbc.divya;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Example
{
	public static void main(String args[])
	{
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/javabatch1","root","4420");
			stmt=conn.createStatement();
			rs=stmt.executeQuery("Select * from Employee");
			while(rs.next())
			{
				int s1=rs.getInt("empId");
				String s2=rs.getString("empName");
				String s3=rs.getString("designation");
				int s4=rs.getInt("sal");
				System.out.println(s1+" "+s2+" "+s3+" "+s4);
			}
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		finally
		{
			try
			{
				conn.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		
	}

}
