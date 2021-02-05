package jdbc;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Example1 {

	public static void main(String[] args) throws IOException {
		Connection con = null;
		java.sql.Statement stmt = null;
		ResultSet rs = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javabatch1", "root", "12345");
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from employe");

			File file = new File("D:\\Filepath1");
			System.out.println(file.mkdir());
			File file2 = new File("D:\\Filepath1\\DBMS.txt");
			System.out.println(file2.createNewFile());

			PrintWriter pw = new PrintWriter(file2);
			while (rs.next()) {
				pw.write(rs.getString("empId"));
				pw.write("  ");// we using space after empid
				pw.print(rs.getString("empName"));
				pw.write("  ");
				pw.print( (int) rs.getDouble("empSalary"));
				pw.write("   ");
				pw.print(rs.getString("empDesignation"));
				pw.println();// we using new line print every record
			// System.out.println("rs.getInt(empId)" +" '"+ s.split("-"));
				// "rs.getString(4)" );

			}
			pw.flush();
			pw.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
				//pw.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}


}
