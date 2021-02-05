package jdbc;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Example3 {
	try {
	ResultSet rs = null;
	
	File file=new File("D:\\Filepath1");
	System.out.println(file.mkdir());
	File file2=new File("D:\\Filepath1\\DBMS2.txt");
	System.out.println(file2.createNewFile());
	
	PrintWriter fw=new PrintWriter(file2);
	
	public void save(Employe e) {
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javabatch1", "root", "12345");
		
			String query = "insert into employe values(" + "'" + e.getEmpId() + "'" + "," + "'" + e.getEmpName() + "'"
					+ "," + "'" + e.getEmpSalary() + "'" + "," + "'" + e.getEmpDesignation() + "'" + ")";
			FileOutputStream fos=new FileOutputStream("D:\\Serializtion\\Child.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			System.out.println("Serialization Completed");
			
			//FileInputStream fis=new FileInputStream("D:\\Serializtion\\Child.txt");
			//ObjectInputStream ois=new ObjectInputStream(fis);
		
			//System.out.println("DeSerialization Completed");
			oos.close();
			fos.close();
			 //ois.close();
			 //fis.close();
			int flag = ( ((Statement) oos).executeUpdate(query)));
			if (flag != 0)
				System.out.println("Data Inserted Successfully");
		} catch (Exception e1) {
			e1.printStackTrace();
		} finally {
		}
	}

	}


}
