package com.naresh.javabatch1;

public class StringExample2 {

	public static void main(String[] args) {
		String name = "Naresh";
		String name2 = "Naresh";
		String name3 = new String("Naresh").intern();
		String name4 = name3.intern();
		System.out.println(name == name2);
		System.out.println(name == name3);
		System.out.println(name == name4);
		char[] chars = {'n','a', 'r','e','s','h'};
		String name5 = new String(chars);
		System.out.println(name5);
		String name6 = new String(chars, 2, 4);
		System.out.println(name6);
		int[] arr = {65, 67, 89, 74, 85, 80, 97};
		String name7 = new String(arr, 0, 7);
		System.out.println(name7);
		String name8 = "Naresh Kambala";
		System.out.println(name8.contains("Kambala"));
		String name9 = "Triveni P P";
		System.out.println(name9);
		//name9 = name9.replaceFirst("P", "T");
		name9 = name9.replaceAll("P", "T");
		String name10 = name9.replace('P', 'T');
		String num = "hgg9545";
		String num2 = num.replaceAll("\\d", "");
		String num3 = num.replaceAll("[a-zA-Z]", "");
		System.out.println(num);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(name9);
		System.out.println(name10);
		System.out.println(name9.startsWith("Divya"));
		System.out.println(name9.endsWith("T"));
		// String accountNumber = "451-PER-157";
		// SAV-154-154
		// account type = savings
		// account number = 157
		String[] accountTypes = {"SAV", "CUR", "PER", "JOI"};
		String accNum="451-SAV-157";
		//String s=accNum.replaceAll("\\d","");
		String s=accNum.substring(4, accNum.length()-4);
		String[] fields = accNum.split("-");
		System.out.println(fields[0]);
		System.out.println(fields[1]);
		System.out.println(fields[2]);
        System.out.println("Account Type:"+s);
        String s1=accNum.substring(8, 11);
        System.out.println("Account Number:"+s1);
        String firstName = "Naresh";
		String lastName = "Kambala";
		String fullName = firstName+" "+lastName;
		String fullName2 = firstName.concat(" ").concat(lastName);
		System.out.println(fullName+"\n"+fullName2);
		
	}

}
