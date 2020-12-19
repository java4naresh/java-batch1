package com.Liveexmple.Java;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Multi2 {

	private static void readFile() {
		/*
		 * FileReader fileReader;
		 * 
		 * fileReader = new FileReader(new File(""));
		 * System.out.println(fileReader.read());
		 * 
		 * }
		 */
		try {

			FileReader fileReader = new FileReader(new File(""));
			System.out.println(fileReader.read());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// Relational operations
		int num2 = 100;
		int num3 = 10;
		if (num2 != 0 & num3 != 0)
			System.out.println(num2 << num3);
		if (num2 != 0 & num3 != 0)
			System.out.println(num2 >> num3);
		if (num2 != 0 & num3 != 0)
			System.out.println(num2 == num3);
		if (num2 != 0 & num3 != 0)
			System.out.println(num2 <= num3);
		if (num2 != 0 & num3 != 0)
			System.out.println(num2 >= num3);
		try {
			readFile();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void readFile1() {
		// TODO Auto-generated method stub

	}

	private static void readSecondFile() {
		// TODO Auto-generated method stub

	}
}
