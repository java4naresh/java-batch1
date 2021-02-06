package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PsUpdate {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javabatch1", "root", "12345");
			PreparedStatement ps1=con.prepareStatement("Update employe set empName=? where empId=?");
			
			ps1.setString(1,"Koti");
			ps1.setInt(2,15);

			ps1.executeUpdate(); 
			System.out.println("Data Updated Successfully");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



	}

}
