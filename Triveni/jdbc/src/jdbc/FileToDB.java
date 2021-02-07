package jdbc;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

public class FileToDB {

	public static void main(String[] args)  {
		Statement stmt=null;
		try {
			BufferedReader br=new BufferedReader(new FileReader("D:\\Filepath1\\DBMS2.txt"));
			String record=br.readLine();
			Example2 e2=new Example2();
			stmt=e2.getStatement();
			while(record !=null) {
				System.out.println(record);
				String[] values=record.split("-");
				System.out.println(values[0]);
				System.out.println(values[1]);
				System.out.println(values[2]);
				System.out.println(values[3]);
				String query = "insert into employe values(" + "'" +values[0] + "'" + "," + "'" + values[1] + "'"
						+ "," + "'" + values[2] + "'" + "," + "'" + values[3] + "'" + ")";
				int count=stmt.executeUpdate(query);
				if(count !=0)System.out.println("Records Inserted Successfully");
				record=br.readLine();
				
				
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block;
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
