package com.jdbc.javabatch1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Example1 {

	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
          Class.forName("com.mysql.jdbc.Driver");
          con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javabatch1","root","root");
          stmt = con.createStatement();
          //rs = stmt.executeQuery("select * from employee");
          rs = stmt.executeQuery("select * from student");
          //rs = stmt.executeQuery("show columns from employee");
          List<Student> stds = new ArrayList<>();
          Map<Integer, Student> map = new HashMap<>();
          while(rs.next()) {
        	  Student s = new Student();
        	  s.setStdId(rs.getInt("stdId"));
        	  s.setStdFirstName(rs.getString(2));
        	  s.setStdLastName(rs.getString(3));
        	  s.setStdEmail(rs.getString(4));
        	  s.setBranch(rs.getString(5));
        	  s.setAddId(rs.getInt(6));
        	  s.setCity(rs.getString(7));
        	  stds.add(s);
        	  map.put(rs.getInt("stdId"), s);
        	  //System.out.println(rs.getString(1));
        	  System.out.println(rs.getInt("stdId") +" ," +rs.getString(2)+ " , "+rs.getString(3)+ " , "+ rs.getString(4)+ " , "+rs.getString(5)+ " , "+rs.getString(6)+ " , "+rs.getString(7));
          }
          System.out.println(stds);
          System.out.println(map);
		}  catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
