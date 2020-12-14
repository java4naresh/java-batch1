package com.naresh.javabatch1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandlingExample {
	
	private static void readFirstFile() throws IOException {
		FileReader fileReader;
		
			fileReader = new FileReader(new File(""));
			System.out.println(fileReader.read());
		
	}

	public static void main(String[] args)  {
		
		String name = null;
		int num1 = 100;
		int num2 = 10;
		//if(name != null)
		try {
			if(name != null)
				System.out.println(name.charAt(1));
		} catch(NullPointerException ne) {
			System.err.println("Name Should not be null");
		}
		//if(num1 != 0 && num2 != 0)
			System.out.println(num1/num2);
		
		String file = "first";
		try {
			if(file.equals("first"))
				readFirstFile();
			else readSecondFile();
		} catch(FileNotFoundException fne) {
			System.err.println("File Does not contain in provided path, please pass valid path");
		} catch(IOException ioe) {
			System.err.println("Incorrect Input");
		} finally {
			System.out.println("Finally");
		}
		
		
		

	}

	private static void readSecondFile() throws IOException {
		FileReader fileReader;
		
			fileReader = new FileReader(new File(""));
			System.out.println(fileReader.read());
		
	}

}
