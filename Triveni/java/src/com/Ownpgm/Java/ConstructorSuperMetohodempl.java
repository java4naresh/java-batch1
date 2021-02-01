package com.Ownpgm.Java;

public class ConstructorSuperMetohodempl {
	public ConstructorSuperMetohodempl() {
		System.out.println("Super Class Constructor");

	}

	public ConstructorSuperMetohodempl(int i) {

		System.out.println("Super Class param Constructor");

	}

	public static  class ConstructorSuperMethodempl1 extends ConstructorSuperMetohodempl {
		public ConstructorSuperMethodempl1() {
			System.out.println("Sub Class Constructor");

		}

		public ConstructorSuperMethodempl1(int i) {
			super(i);
			System.out.println("Sub Class param Constructor");

		}

		public static void main(String[] args) {
			ConstructorSuperMethodempl1 obj = new ConstructorSuperMethodempl1(5);

		}

	
	}
}
