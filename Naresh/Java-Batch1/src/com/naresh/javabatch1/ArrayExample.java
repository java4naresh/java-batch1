package com.naresh.javabatch1;

import java.util.Arrays;


public class ArrayExample {
	
	public static void main(String[] args) {
		
		ArrayExample arr = new ArrayExample();
		System.out.println(arr);
		
		String []a = {"A","B","C","D","E"};
		System.out.println(Arrays.toString(a));
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		// [1,10,3,4,5]
		//a[1]=10;
		//a[4] = 20;
		System.out.println(Arrays.toString(a));
		
		
		for(int i=0; i<a.length;i++) {
			System.out.println(a[i]);
		}
		
	}

}
