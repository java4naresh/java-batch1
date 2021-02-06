package com.jdbc.divya;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PsInsert
{
	public static void main(String[] args) throws ClassNotFoundException
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/javabatch1", "root","4420");
			PreparedStatement ps=conn.prepareStatement("insert into register values(?,?,?,?)");
			ps.setString(1,"Divya");
			ps.setString(2, "8790197899");
			ps.setString(3,"divyareddy@gmail.com");
			ps.setString(4,"divyam");
			ps.executeUpdate();
			System.out.println("Insertion Process");
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
