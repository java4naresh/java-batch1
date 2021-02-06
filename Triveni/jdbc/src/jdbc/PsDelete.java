package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PsDelete {
	public static void main(String[] args) {
	
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javabatch1", "root", "12345");
				PreparedStatement ps1=con.prepareStatement("Delete from employe Where empId=?");
				ps1.setInt(1, 15);
				ps1.executeUpdate(); 
				System.out.println("Data Deleted Successfully");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}



}
}