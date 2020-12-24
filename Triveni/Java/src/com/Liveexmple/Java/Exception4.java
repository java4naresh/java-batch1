package com.Liveexmple.Java;

import java.io.File;
import java.io.FileReader;

public class Exception4 {
	private static void readFourthFile() {
		try {

			FileReader fileFourthReader = new FileReader(new File(""));
			System.out.println(fileFourthReader.read());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		int num = 2;
		if (num == 1) {
			System.out.print("Number Matching That is 1");
		} else if (num == 2) {
			System.out.print("Number Matching That is 2");
		} else if (num == 3) {
			System.out.print("Number Matching That is  3");
		} else {
			System.out.print("Number Does Not Matching That Are 1,2,3");
		}
		try {
			readFourthFile();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
