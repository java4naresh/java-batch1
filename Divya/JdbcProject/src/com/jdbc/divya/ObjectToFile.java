package com.jdbc.divya;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ObjectToFile 
{
	public static void main(String[] args) throws Exception
	{
		//Object values are stored in File
		File f1=new File("G:/Student/EmployeeDetails.txt");
		f1.createNewFile();
		Employee e1=new Employee(69,"Goutami","Tester",25000);
		Employee e2=new Employee(65,"Swathi","Trainer",50000);
		FileOutputStream fos=new FileOutputStream(f1);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(e1);
		oos.writeObject(e2);
		FileInputStream fis=new FileInputStream("G:/Student/EmployeeDetails.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Employee emp1=(Employee) ois.readObject();
		Employee emp2=(Employee) ois.readObject();
		System.out.println(emp1);
		System.out.println(emp2);
		oos.flush();
		oos.close();
		fos.close();
		fis.close();
		ois.close();
		
		
	}
        
}
    
	


