package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedstmntExmpl {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javabatch1", "root", "12345");
			PreparedStatement ps=con.prepareStatement("insert into employe values(?,?,?,?)");
			ps.setInt(1,15);
			ps.setString(2,"Sita");
			ps.setDouble(3,20000);
			ps.setString(4,"Cooking");
			ps.executeUpdate();
			System.out.println("Data Inserted Successfully");


		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



	}

}
