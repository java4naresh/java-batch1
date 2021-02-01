package com.Ownpgm.Java;

public class ConstructorThisExmpl {
	int num1;
	double num2;
	public ConstructorThisExmpl() {
		num1=5;
		num2=5;
	}
	public ConstructorThisExmpl(int num1,double num2) {
		this.num1=num1;
		this.num2=num2;
		
	}

	public static void main(String[] args) {
		ConstructorThisExmpl obj=new ConstructorThisExmpl(6,7.9);
		System.out.println(obj.num1);
		System.out.println(obj.num2);

	}

}
