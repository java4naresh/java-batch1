package com.Liveexmple.Java;

import java.util.Scanner;

public class ScannerExample1 {

	public static void main(String[] args) {
		// Even And Odd numbers
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the No");
		int n = s.nextInt();
			if(n%2==0)
			{
				System.out.println(n + "  is Even no");
			}
			else
			{
				System.out.println(n + "  is Odd no");
			}
		}

	}


