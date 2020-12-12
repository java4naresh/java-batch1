package com.naresh.javabatch1;

public class CastingExample {
	
	public static void main(String[] args) {
		Father f = new Child2();
		Father f2 = new Child2();
		Child2 c2 = null;
		Child1 c1 = null;
		if(f instanceof Child1) {
			c1 = (Child1)f;
		} else {
			c2 = (Child2)f;
		}
	}

}
