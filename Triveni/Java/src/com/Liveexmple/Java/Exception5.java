package com.Liveexmple.Java;

import java.io.File;
import java.io.FileReader;

public class Exception5 {
	private static void readFithFile() {
		try {

			FileReader fileFithReader = new FileReader(new File(""));
			System.out.println(fileFithReader.read());
		} catch (Exception e) {
			e.printStackTrace();
		}
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

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}