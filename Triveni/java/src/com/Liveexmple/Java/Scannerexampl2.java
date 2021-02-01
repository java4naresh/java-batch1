package com.Liveexmple.Java;

import java.util.Scanner;

public class Scannerexampl2 {
	public static void main(String[] args) {
		// Swapping Numbers
		int x,y,temp;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the No");
		 x = s.nextInt();
		 y = s.nextInt();
		 System.out.println("Before Swapping " + x + y);
		 	temp=x;
		 	x=y;
		 	y=temp;
		 	System.out.println("After Swapping " + x + y);
}
}
