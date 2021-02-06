package com.jdbc.divya;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class FileToObject
{
    public static void main(String[] args)
	{
    	try
		{
			BufferedReader br=new BufferedReader(new FileReader("G:\\Student\\Employee.txt"));
			String data=br.readLine();
			List<Employee> emp = new ArrayList<>();
			while(data!= null) 
			{
				//System.out.println(emp);
				String[] values = data.split("-");
				Employee e=new Employee();
				e.setEmpId(Integer.parseInt(values[0]));
				e.setEmpName(values[1]);
				e.setDesignation(values[2]);
				e.setSal(Integer.parseInt(values[0]));
				data=br.readLine();
				emp.add(e);
			}
			System.out.println(emp);
			//ForEach method to print new line using lambda expression(java8 feature)
			emp.forEach(e->System.out.println(e));
			//To print new line using Iterator for forward and ListIterator for frwd and bckwrd
			ListIterator<Employee> i1=emp.listIterator();
			while(i1.hasNext())		
			{
				System.out.println(i1.next());
			}
			while(i1.hasPrevious())
			{
				System.out.println(i1.previous());
			}
			
		}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}

	}

}
