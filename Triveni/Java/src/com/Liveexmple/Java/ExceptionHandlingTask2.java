package com.Liveexmple.Java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandlingTask2 {
	private static void readFirstFile1() {
		try {
			String file = "First";
			if (file.equals("First"))
				System.out.println("First file is Printed");

			FileReader fileFirstReader = new FileReader(new File(""));
			System.out.println(fileFirstReader.read());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void readSecondFile1() {
		try {
			String file = "Second";
			if (file.equals("Second"))
				System.out.println("Second file is Printed");
			FileReader fileSecondReader = new FileReader(new File(""));
			System.out.println(fileSecondReader.read());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void readThirdFile1() {
		try {
			String file = "Third";
			if (file.equals("Third"))
				System.out.println("Third file is Printed");
			FileReader fileSecondReader = new FileReader(new File(""));
			System.out.println(fileSecondReader.read());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void readFourthFile1() {
		try {
			String file = "Fourth";
			if (file.equals("Fourth"))
				System.out.println("Fourth file is Printed");
			FileReader fileSecondReader = new FileReader(new File(""));
			System.out.println(fileSecondReader.read());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void readFifthFile1() {
		try {
			String file = "Fifth";
			if (file.equals("Fifth"))
				System.out.println("Fifth file is Printed");
			FileReader fileSecondReader = new FileReader(new File(""));
			System.out.println(fileSecondReader.read());
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
			readSecondFile1();
			readThirdFile1();
			readFourthFile1();
			readFifthFile1();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
