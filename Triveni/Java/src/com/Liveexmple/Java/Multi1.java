package com.Liveexmple.Java;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Multi1 {
	
	private static void readFirstFile1() throws IOException {
		FileReader fileReader;
		
			fileReader = new FileReader(new File(""));
			System.out.println(fileReader.read());
		
	}


	public static void main(String[] args) {
		String name = "Divya";
		int num2= 100;
		int num3=10;
		if(name != null)
			System.out.println(name.charAt(3));
		if(num2!=0& num3!=0)
			System.out.println(num2/num3);
		try {
			readFirstFile1();
			
		}catch(Exception e) {
			e.printStackTrace();
		}


}

	private static void readFirstFile() {
		// TODO Auto-generated method stub
		
	}
}