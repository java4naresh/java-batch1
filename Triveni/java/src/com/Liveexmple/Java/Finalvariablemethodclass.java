package com.Liveexmple.Java;

public class Finalvariablemethodclass {
	public static void main(String[] args) {
		final int a = 10;// here variable declared as final
		System.out.println(a);
		a = 20;// final variables not reinitialized
		B b1 = new B();
		b1.show();
	}
}

final class A {// here class a declared as final
	final public void show() {// here show() declared as final
		System.out.println("In A Show ");
	}
}

class B extends A {// final classes not extended
	public void show() {// final methods not overrided
		System.out.println("In B Show");
	}
}
