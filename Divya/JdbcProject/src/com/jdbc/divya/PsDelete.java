package com.jdbc.divya;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PsDelete
{
    public static void main(String[] args) 
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/javabatch1","root","4420");
			PreparedStatement ps=conn.prepareStatement("delete from register where name=? and phNo=?");
			ps.setString(1,"Triveni");
			ps.setString(2,"9652678434");
			ps.executeUpdate();
			System.out.println("Delete Process");
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		} 
		catch (ClassNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
