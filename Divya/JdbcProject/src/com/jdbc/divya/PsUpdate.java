package com.jdbc.divya;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class PsUpdate {

	public static void main(String[] args) throws ClassNotFoundException
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/javabatch1","root","4420");
			PreparedStatement ps=conn.prepareStatement("update register set mailId=? where name=?");
			ps.setString(1,"divya1996@gmail.com");
			ps.setString(2, "divya");
			ps.executeUpdate();
			System.out.println("Update Process");
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
	}

}
