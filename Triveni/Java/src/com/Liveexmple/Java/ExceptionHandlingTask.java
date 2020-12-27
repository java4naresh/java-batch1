package com.Liveexmple.Java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.imageio.IIOException;

public class ExceptionHandlingTask {

	private static void readFirstFile() throws IOException {
		FileReader fileReader;

		fileReader = new FileReader(new File(""));
		System.out.println(fileReader.read());
	}

	private static void readSecondFile() throws IOException {
		FileReader fileReader;

		fileReader = new FileReader(new File(""));
		System.out.println(fileReader.read());
	}

	private static void readThirdFile() throws IOException {
		FileReader fileReader;

		fileReader = new FileReader(new File("Third"));
		System.out.println(fileReader.read());
	}

	private static void readFourthFile() throws IOException {
		FileReader fileReader;

		fileReader = new FileReader(new File(""));
		System.out.println(fileReader.read());
	}

	private static void readFifthFile() throws IOException {
		FileReader fileReader;

		fileReader = new FileReader(new File(""));
		System.out.println(fileReader.read());

	}

	public static void main(String[] args) {
		String file1 = "First";
		String file2 = "Second";
		String file3 = "Third";
		String file4 = "Fourth";
		String file5 = "Fifth";

		String name = "Triveni";
		int num1 = 100;
		int num2 = 10;
		if (name != null)
			System.out.println(name.charAt(1));
		if (num1 != 0 && num2 != 0)
			System.out.println(num1 / num2);
		try {
			if (file1.equals("First"))
				System.out.println("First file is Printed");

			if (file2.equals("Second"))
				System.out.println("Second file is Printed");
			if (file3.equals("Third"))
				System.out.println("Third file is Printed");
			if (file4.equals("Fourth"))
				System.out.println("Fourth file is Printed");
			if (file5.equals("Fifth"))
				System.out.println("Fifth file is Printed");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
