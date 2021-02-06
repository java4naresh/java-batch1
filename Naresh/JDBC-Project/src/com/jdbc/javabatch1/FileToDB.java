package com.jdbc.javabatch1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.Statement;

public class FileToDB {

	public static void main(String[] args) {
		Statement stmt = null;
      try {
		BufferedReader br = new BufferedReader(new FileReader("D:\\Files\\students.txt"));
		String line = br.readLine();
		CrudOperations co = new CrudOperations();
		stmt = co.getStatement();
		while(line != null) {
			System.out.println(line);
			String[] values = line.split(",");
			System.out.println(values[0]);
			System.out.println(values[1]);
			System.out.println(values[2]);
			System.out.println(values[3]);
			System.out.println(values[4]);
			System.out.println(values[5]);
			System.out.println(values[6]);
			String query = "insert into student values(" + "'" + values[0] + "'" + "," + "'" + values[1]
			+ "'" + "," + "'" + values[2] + "'" + "," + "'" + values[3] + "'" + "," + "'"
			+ values[4] + "'" + "," + "'" + values[5] + "'" + "," + "'" + values[6] + "'" + ")";
			int count = stmt.executeUpdate(query);
			if(count != 0) System.out.println("record inserted successfully");
			line = br.readLine();
		}
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
