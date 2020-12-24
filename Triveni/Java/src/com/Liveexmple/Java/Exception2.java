package com.Liveexmple.Java;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Exception2 {

	private static void readSecondFile() {

		try {

			FileReader fileSecondReader = new FileReader(new File(""));
			System.out.println(fileSecondReader.read());
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
			readSecondFile();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
