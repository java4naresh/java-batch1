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

public class CrudOperations {
	
	public void show() {
		Statement stmt = null;
		ResultSet rs = null;
		try {
          stmt = getStatement();
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
		}
	}
	
	public Statement getStatement() throws SQLException, ClassNotFoundException {
		Connection con = null;
		Statement stmt = null;
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javabatch1", "root", "root");
		stmt = con.createStatement();
		return stmt;
	}
	
	public void save(Student s) {
		
		try {
			String query = "insert into student values(" + "'" + s.getStdId() + "'" + "," + "'" + s.getStdFirstName()
					+ "'" + "," + "'" + s.getStdLastName() + "'" + "," + "'" + s.getStdEmail() + "'" + "," + "'"
					+ s.getBranch() + "'" + "," + "'" + s.getAddId() + "'" + "," + "'" + s.getCity() + "'" + ")";
			Class.forName("com.mysql.jdbc.Driver");
			Statement stmt = getStatement();
			int flag = stmt.executeUpdate(query);
			if (flag != 0)
				System.out.println("data inserted successfully");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
		
	}
	
	public void updateFirstName(String name, int id) {
		try {
			String query = "update student set stdFirstName="+"'"+name+"'"+ " where stdId="+id;
			System.out.println(query);
			Class.forName("com.mysql.jdbc.Driver");
			Statement stmt = getStatement();
			int flag = stmt.executeUpdate(query);
			if (flag != 0)
				System.out.println("data inserted successfully");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
		
	}
	
	public void delete(int id) {
		try {
		String query = "delete from student where stdId="+id;
		System.out.println(query);
		Class.forName("com.mysql.jdbc.Driver");
		Statement stmt = getStatement();
		int flag = stmt.executeUpdate(query);
		if (flag != 0)
			System.out.println("id "+id+" deleted successfully");
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		
	}
	}

}
