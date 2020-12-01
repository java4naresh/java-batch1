package com.naresh.javabatch1;

public class Arraytask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a [] = {1,2,3,4,5,6,7};
		
		for(int i=a.length-3;0<=i; i--) {
			if(a[i] == 0);
			System.out.print(a[i]+" ");
		}
		//a[2] = 10;
		System.out.println();
		boolean flag = false;
		for(int i=0;i<a.length; i++) {
			flag = false;
			for(int j=2;j<a[i];j++) {
				if(a[i]%j == 0)
					flag = true;
				
			}
			if(!flag)
				System.out.print(a[i]+" ");
		}
	}

}
