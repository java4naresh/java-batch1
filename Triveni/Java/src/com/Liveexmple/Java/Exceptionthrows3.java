package com.Liveexmple.Java;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Exceptionthrows3 {
	private static void readThirdFile1() throws IOException {
		FileReader fileReader;

		fileReader = new FileReader(new File(""));
		System.out.println(fileReader.read());
	}
	public static void main(String[] args)  {
		
		String name = "Triveni";
		int num1 = 100;
		int num2 = 10;
		if(name != null)
			System.out.println(name.charAt(1));	
		if(num1!=0 && num2 !=0)
			System.out.println(num1/num2);	
		try {
			readThirdFile();
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
	private static void readThirdFile() {
		// TODO Auto-generated method stub
		
	}
}
