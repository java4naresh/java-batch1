package com.divya.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig 
{
	@Bean
	public Connection getConnection() 
	{
		 try 
		 {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/javabatch1","root","4420");
		 }
		 catch (SQLException e) 
		 {
			e.printStackTrace();
		 } 
		 catch (ClassNotFoundException e)
		 {
			e.printStackTrace();
		 }
		 return null;
	}
}
