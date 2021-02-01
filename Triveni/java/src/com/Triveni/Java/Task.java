package com.Triveni.Java;

public class Task {
	public static void main(String[] args) {

		String[] accType = {"SAV","CUR","Joint","PER"};
		String accNum="456-sav-157";
		String s1 = accNum.substring(4,accNum.length()-4);
		String[] fields=accNum.split("-");
		//System.out.println(fields[0]);
		System.out.println(fields[1]);
		if("SAV".equalsIgnoreCase(fields[1]))
		{
			System.out.println("Accunt Type    " +"Savings");
		}
		else if("CUR".equalsIgnoreCase(fields[1]))
		{
			System.out.println("Accunt Type    " +"Current");
		}
		else if("PER".equalsIgnoreCase(fields[1])) 
		{
			System.out.print("Account Type  "+"Personal");
		}
		else if("Joint".equalsIgnoreCase(fields[1])) 
		{
			System.out.print("Account Type  "+"Joint");
		}
		String t5 = "456-SAV-157";
		System.out.println("Account No " + t5.substring(8, 11));
		// System.out.println(t1.substring(8,11));

	}

}