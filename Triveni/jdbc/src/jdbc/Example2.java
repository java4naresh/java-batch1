package jdbc;

import java.io.File;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Example2 {

	public void show() {
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = getStatement();
			/*
			 * File file = new File("D:\\Filepath1"); System.out.println(file.mkdir()); File
			 * file2 = new File("D:\\Filepath1\\DBMS.txt");
			 * System.out.println(file2.createNewFile());
			 */

			/*
			 * PrintWriter pw = new PrintWriter(file2); while (rs.next()) {
			 * pw.write(rs.getString("empId")); pw.write("  ");// we using space after empid
			 * pw.print(rs.getString("empName")); pw.write("  "); pw.print( (int)
			 * rs.getDouble("empSalary")); pw.write("   ");
			 * pw.print(rs.getString("empDesignation")); pw.println();// we using new line
			 * print every record // System.out.println("rs.getInt(empId)" +" '"+
			 * s.split("-")); // "rs.getString(4)" );
			 */

			List<Employe> stds = new ArrayList<>();
			while (rs.next()) {
				Employe e = new Employe();
				e.setEmpId(rs.getInt("empId"));
				e.setEmpName(rs.getString("empName"));

				e.setEmpSalary(rs.getDouble("empSalary"));
				e.setEmpDesignation(rs.getString("empDesignation"));

			}
			// pw.flush();
			// pw.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
		}

	}

	public Statement getStatement() throws ClassNotFoundException, SQLException {
		Connection con = null;
		Statement stmt = null;

		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javabatch1", "root", "12345");
		stmt = con.createStatement();
		return stmt;
	}

	public void save(Employe e) {
		try {
			String query = "insert into employe values(" + "'" + e.getEmpId() + "'" + "," + "'" + e.getEmpName() + "'"
					+ "," + "'" + e.getEmpSalary() + "'" + "," + "'" + e.getEmpDesignation() + "'" + ")";
			Class.forName("com.mysql.jdbc.Driver");
			Statement stmt = getStatement();
			int flag = stmt.executeUpdate(query);
			if (flag != 0)
				System.out.println("Data Inserted Successfully");
		} catch (Exception e1) {
			e1.printStackTrace();
		} finally {
		}
	}

	public void updateEmpName(String name, int id) {
		try {
			String query = "Update employe set empName=" + "'" + name + "'" + " where empId=" + id;
			System.out.println(query);
			Class.forName("com.mysql.jdbc.Driver");
			Statement stmt = getStatement();
			int flag = stmt.executeUpdate(query);
			if (flag != 0)
				System.out.println("Data Inserted Successfully");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
		}
	}

	public void delete(int id) {
		try {
			String query = "delete from employe where empId=" + id;
			System.out.println(query);
			Class.forName("com.mysql.jdbc.Driver");
			Statement stmt = getStatement();
			int flag = stmt.executeUpdate(query);
			if (flag != 0)
				System.out.println("id " + id + " deleted Successfully");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
		}
	}

}