package com.jdbc.File;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
        try {
			Class.forName("com.mysql.jdbc.Driver");
		   con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javabatch", "root", "sai25");
		   st=con.createStatement();
		   rs=st.executeQuery("select * from employee");
		   while(rs.next()){
			   System.out.println(rs.getInt(1)+" "+rs.getString(2));
			 
		   }
		} catch (Exception e) {
			e.printStackTrace();
		}
	
        finally{
        	try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
	}

}
