package com.jdbc.divya;

import java.sql.Statement;
import java.io.File;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Student
{


	public static void main(String[] args) 
	{
		Connection conn = null;
		Statement stmt = null;
	    ResultSet rs = null;
		try
		{
	          Class.forName("com.mysql.jdbc.Driver");
	          File f1=new File("G:/Student");
	          System.out.println(f1.mkdir());
	          File f2=new File("G:/Student/StudentDetails.txt");
	  		  f2.createNewFile();
	  		  PrintWriter fw = new PrintWriter(f2);
	  		  conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javabatch1","root","4420");
	          stmt = conn.createStatement();
	  		  rs=stmt.executeQuery("select * from student");
	  		  PrintWriter pw=new PrintWriter(f2);
	  		  while(rs.next())
	  		  {	  		  
	  		  pw.print(rs.getString("Id")); // We Can use both print and write methods...
	  		  pw.write("-");
	  		  pw.write(rs.getString("Name"));
	  		  pw.write("-");
	  		  pw.write(rs.getString("Email"));
	  		  pw.write("-");
	  		  pw.write(rs.getString("Branch"));
	  		  pw.write("-");
	  		  pw.write(rs.getString("PhNo"));
	  		  pw.println();
	  		  }
	  		  pw.flush();
	          conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javabatch1","root","4420");
	          stmt = conn.createStatement();
	          rs = stmt.executeQuery("select * from student");
	          while(rs.next())
	          {
	        	  int s1=rs.getInt("Id");
	        	  String s2=rs.getString("Name");
	         	  String s3=rs.getString("Email");
	        	  String s4=rs.getString("Branch");
	        	  int s5=rs.getInt("PhNo");
	        	  System.out.println(s1+" "+s2+" "+s3+" "+s4+" "+" "+s5);
	        	  
	          }
		}
		catch(Exception e)
		{
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
