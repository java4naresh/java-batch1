package com.Ownpgm.Java;

public class SuperDemo {
	int i;
	class A {
		public void show() {
			System.out.println("A Show");
		}

		int i = 4;
	}

	public class B extends A {
		int i = 4;

		public void show() {
			super.show();
			System.out.println(super.i);
			System.out.println(i);
		}

	}
	public static void main(String[] args) {
		B obj = new B();
		obj.show();

	}

}
