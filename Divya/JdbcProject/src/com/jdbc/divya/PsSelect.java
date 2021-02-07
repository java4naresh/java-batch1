package com.jdbc.divya;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PsSelect
{
	public static void main(String[] args)
	{
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/javabatch1","root","4420");
			PreparedStatement ps=conn.prepareStatement("select Name from register where phNo=? and mailId=?");
			ps.setString(1,"8790197899");
			ps.setString(2,"divya1996@gmail.com");
			ResultSet rs=ps.executeQuery();
			System.out.println("Select Process");
			if(rs.next())
			{
				String name=rs.getString("Name");
				System.out.println("Welcome ----"+name);
			}
			
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

}
