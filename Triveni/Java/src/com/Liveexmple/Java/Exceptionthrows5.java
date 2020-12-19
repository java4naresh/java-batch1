package com.Liveexmple.Java;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Exceptionthrows5 {
	private static void readFithFile() throws IOException {
		FileReader fileReader;

		fileReader = new FileReader(new File(""));
		System.out.println(fileReader.read());
	}
	public static void main(String[] args) {
		String fullName = "Triveni";
	fullName = fullName + " Ponnaganti";
	System.out.println(fullName);
	String location = "Hyd";
	StringBuffer sb = new StringBuffer("Java Developer");
	sb.append(" Fresher");
	if (location.equalsIgnoreCase("Hyd")) {
		sb.append("\nCity:HYD");
	} else if (location.equalsIgnoreCase("Chennai")) {
		sb.append("\nCity:Chennai");
	}
	System.out.println(sb);
	try {
		readFithFile();
		
	}catch(Exception e) {
		e.printStackTrace();
	}

	}
}
