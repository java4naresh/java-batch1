package jdbc;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class FileToObject {

	public static void main(String[] args)  {

		try {
			BufferedReader br = new BufferedReader(new FileReader("D:\\Filepath1\\DBMS2.txt"));
			String record=br.readLine();
			List<Employe> emp=new ArrayList<>();
			while(record!=null) {
				String[] values=record.split("-");
				Employe e=new Employe();
				e.setEmpId(Integer.parseInt(values[0]));
				e.setEmpName(values[1]);
				e.setEmpSalary(Float.parseFloat(values[2]));
				e.setEmpDesignation(values[3]);
				record=br.readLine();
				emp.add(e);
			}
			System.out.println(emp);// This is print all records  same line
			for(Employe e1:emp)//This is print single record at single line
			{
				System.out.println(e1);
			}
			ListIterator<Employe> li=emp.listIterator();
			System.out.println("Forward Direction------------------------------------------------");
			while(li.hasNext()) {
				System.out.println(li.next());
			}
			System.out.println("Backward Direction ==============================================");
			while(li.hasPrevious()) {
				System.out.println(li.previous());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



	}

}
