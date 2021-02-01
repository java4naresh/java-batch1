package com.Liveexmple.Java;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Scannerexmpl3 {

	public static void main(String[] args) {
	//Min AND MAX values
		Scanner s = new Scanner(System.in);
		Integer[] numbers=new Integer[3];
		for(int i=0;i<numbers.length;i++)
		{
		System.out.println("Enter the No");
		numbers[i] = s.nextInt();
		}
		int min=(int) Collections.min(Arrays.asList(numbers));
		int max = (int) Collections.max(Arrays.asList(numbers));
		System.out.println("Max Number is  " + max);
		System.out.println("Min Number is  " +  min);
	
	}

}
