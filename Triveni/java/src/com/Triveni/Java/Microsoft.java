package com.Triveni.Java;

public class Microsoft 
{
	String name;
	String mailId;
	String designation;
	double salary ;		 
public Microsoft(String name,double salary, String mailId, String designation)
	{
 		this.name=name;
		this.mailId=mailId;
		this.designation=designation;
		this.salary=salary;
		
		
	}
public void Consultancy()
{
 System.out.println(this.name);
 System.out.println(this.mailId);
 System.out.println(this.designation);
 System.out.println(this.salary);
 
}

}
