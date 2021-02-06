package com.jdbc.javabatch1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementExample {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javabatch1", "root", "root");
			PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?,?,?,?,?)");
			ps.setInt(1, 1);
			ps.setString(2, "Naresh");
			ps.setString(3, "Kambala");
			ps.setString(4, "java4naresh@gmail.com");
			ps.setString(5, "E.C.E");
			ps.setInt(6, 101);
			ps.setString(7, "Hyderabad");
			ps.executeUpdate();
			System.out.println("data inserted  successfully");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
