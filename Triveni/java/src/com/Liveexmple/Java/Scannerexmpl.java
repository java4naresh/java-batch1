package com.Liveexmple.Java;

import java.util.Scanner;
import java.util.stream.Collectors;

public class Scannerexmpl {
	// Prime No Example
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the No");
		int n = s.nextInt();
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.println(n + "  is Prime no");
				System.out.println(i + "  is Prime no");

			} else {
				System.out.println(i + "  is Not a Prime no");
			}

		}
	}
}