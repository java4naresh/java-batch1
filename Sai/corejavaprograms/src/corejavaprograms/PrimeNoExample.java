package corejavaprograms;

import java.util.Scanner;

public class PrimeNoExample {

	public static void main(String[] args) {
		int x,y=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the number:");
		x=sc.nextInt();
		for (int i =1; i <=x; i++) {
			if(x%i==0){
				y++;
			}
		}
		if(y==2){
			System.out.println(x+" is parime");
		}else{
			System.out.println(x+" is not Prime");
		}
		}
}