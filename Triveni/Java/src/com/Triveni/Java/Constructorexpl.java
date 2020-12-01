package com.Triveni.Java;

public class Constructorexpl 
{
	public static void main(String[] args)
	{
		
		Orcle c1=new Orcle("Triveni",35000,"tiru@gmail.com","java Developer");
		Microsoft c2=new Microsoft("Triveni",50000,"sfff@gmail.com","java Developer"); 
		System.out.println("     TCS Job History    ");
		c1.Consultancy();
		System.out.println("    Microsoft Job History   ");
		c2.Consultancy();
	}
}


