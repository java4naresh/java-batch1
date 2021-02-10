package com.jdbc.File;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementEx {

	public static void main(String[] args) {
           try {
			Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javabatch","root","sai25");
				PreparedStatement ps=con.prepareStatement("insert into employee values()?,?,?,?,?,?");
		             ps.setInt(1, 5);
		             ps.setString(2, "Sidda");
		             ps.setString(3, "M");
		             ps.setString(4,"Actor");
		             ps.setFloat(5, 70000);
		             ps.setString(6, "Chennai");
		             System.out.println("Data is inserted");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e){
			e.printStackTrace();
		}
	}

}
