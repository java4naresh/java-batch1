package jdbc;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class Example1 {

	public static void main(String[] args) throws IOException {
		Connection con = null;
		java.sql.Statement stmt = null;
		ResultSet rs = null;
		try {
			con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/javabatch1", "root", "12345");
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from employe");

			File file = new File("D:\\Filepath1");
			System.out.println(file.mkdir());
			File file2 = new File("D:\\Filepath1\\DBMS.txt");
			System.out.println(file2.createNewFile());

			FileWriter fw = new FileWriter(file2);

			while (rs.next()) {
				fw.write(rs.getInt("empId"));
				fw.write(rs.getString("empName"));
				fw.write((int) rs.getDouble("empSalary"));
				fw.write(rs.getString("empDesignation"));
				// System.out.println("rs.getInt(1)" +"rs.getString(2)" + "rs.getDouble(3)" +
				// "rs.getString(4)" );
				fw.flush();
			}
		} catch (Exception e) {
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
