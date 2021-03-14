package com.triveni.research.test;

public class Addition {
	public int add(int n1,int n2) {
		return n1+n2;
	}
	public int sub(int n1,int n2) {	
		return n1-n2;
	}
	public int arithemetic(int n1,int n2) {
		int add=n1+n2;
		int mul=n1*n2;
		int sub=n1-n2;
		int div=n1/n2;
		if(div==0)
			return add+mul+sub;
		else 
			return add+mul+sub+div;
	}
}
