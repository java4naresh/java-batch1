package com.Liveexmple.Java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exception1 {

	private static void readFirstFile1() {
	try {

		FileReader fileFirstReader = new FileReader(new File(""));
		System.out.println(fileFirstReader.read());
	} catch (Exception e) {
		e.printStackTrace();
	}
}
	public static void main(String[] args) throws IOException {
		// Arthematic operations
		int num2 = 100;
		int num3 = 10;
		if (num2 != 0 & num3 != 0)
			System.out.println(num2 * num3);
		if (num2 != 0 & num3 != 0)
			System.out.println(num2 / num3);
		if (num2 != 0 & num3 != 0)
			System.out.println(num2 + num3);
		if (num2 != 0 & num3 != 0)
			System.out.println(num2 - num3);
		if (num2 != 0 & num3 != 0)
			System.out.println(num2 % num3);
		try {
			readFirstFile1();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}