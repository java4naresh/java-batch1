package com.Liveexmple.Java;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Exceptionthrows4 {
	private static void readFourthFile1() throws IOException {
		FileReader fileReader;

		fileReader = new FileReader(new File(""));
		System.out.println(fileReader.read());
	}
	public static void main(String[] args)  {
		
		int num = 2;
		if(num == 1) {
			System.out.print("Number Matching That is 1");
		} else if(num == 2) {
			System.out.print("Number Matching That is 2");
		} else if(num == 3) {
			System.out.print("Number Matching That is  3");
		} else {
			System.out.print("Number Does Not Matching That Are 1,2,3"); 
		}
		try {
			readFourthFile();
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
	private static void readFourthFile() {
		// TODO Auto-generated method stub
		
	}
}
