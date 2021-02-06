package com.jdbc.divya;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class FileToSql
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		try
		{
			BufferedReader br=new BufferedReader(new FileReader("G:\\Student\\Employee.txt"));
			String data=br.readLine();
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/javabatch1","root","4420");
			Statement stmt=conn.createStatement();
			while(data != null) 
			{
				System.out.println(data);
				String[] values = data.split("-");
				System.out.println(values[0]);
				System.out.println(values[1]);
				System.out.println(values[2]);
				System.out.println(values[3]);
				String query = "insert into employee values(" + "'" + values[0] + "'" + "," + "'" + values[1]
				+ "'" + "," + "'" + values[2] + "'" + "," + "'" + values[3] + "'" + ")";
				int count = stmt.executeUpdate(query);
				if(count != 0) 
					System.out.println("Record Inserted");
				data = br.readLine();
				
			}
		} 
		catch (IOException e)
		{
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
		
		
	}
}
