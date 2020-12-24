
package com.Liveexmple.Java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.imageio.IIOException;

public class Exception3 {
	private static void readThirdFile() {
		try {

			FileReader fileThirdReader = new FileReader(new File(""));
			System.out.println(fileThirdReader.read());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		String name = "Triveni";
		int num1 = 100;
		int num2 = 10;
		if (name != null)
			System.out.println(name.charAt(1));
		if (num1 != 0 && num2 != 0)
			System.out.println(num1 / num2);
		try {
			readThirdFile();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
