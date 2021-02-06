package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PsSelect {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javabatch1", "root", "12345");
			PreparedStatement ps1 = con.prepareStatement("Select empSalary from employe where empId=?");
			ps1.setInt(1, 113);
			ResultSet rs=ps1.executeQuery();
			if(rs.next()) {
			String s=rs.getString("empSalary");
			System.out.println(s);
			}
			System.out.println("Data Selected Successfully");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
