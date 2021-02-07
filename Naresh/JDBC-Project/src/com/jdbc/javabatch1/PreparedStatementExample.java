package com.jdbc.javabatch1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PreparedStatementExample {

	public static void main(String[] args) {
		PreparedStatementExample pse = new PreparedStatementExample();
		//pse.sort();
		//pse.groupByCity();
		pse.highetSalary(1);
	}
	
	public void highetSalary(int position) {
		try {
			Connection con = getConnection();
			PreparedStatement pstmt = con
					.prepareStatement("select  * from javabatch1.employee order by salary desc limit ?,1");
			pstmt.setInt(1, (position-1));
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+","+rs.getInt(2)+", "+ rs.getString(3)+","+rs.getString(4)+"," +rs.getInt(5));
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void groupByCity() {
		try {
			Connection con = getConnection();
			PreparedStatement pstmt = con.prepareStatement("select count(*), city from student group by city");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+","+rs.getString(2));
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void sort() {
		try {
			Connection con = getConnection();
			PreparedStatement ps = con.prepareStatement("select * from student");
			ResultSet rs = ps.executeQuery();
			List<Student> students = new ArrayList<>();
			while(rs.next()) {
				Student s = new Student(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(6),rs.getString(7));
				students.add(s);
				//System.out.println(rs.getInt(1)+", "+rs.getString(2)+", "+rs.getString(3)+", "+rs.getString(4)+", "+rs.getString(5)+", "+rs.getInt(6)+", "+rs.getString(3));
			}
			//System.out.println(students);
			Collections.sort(students, (s1, s2) -> s1.getStdFirstName().compareTo(s2.getStdFirstName()));
			students.forEach(s1 -> System.out.println(s1));
			//System.out.println(students);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javabatch1", "root", "root");
		return con;
	}
	
	public void insert() {
		try {
			Connection con = getConnection();
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
