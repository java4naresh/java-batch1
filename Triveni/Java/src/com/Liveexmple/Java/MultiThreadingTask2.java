package com.Liveexmple.Java;

public class MultiThreadingTask2 extends Thread {
	@Override
	public void run() {
		iterator2();
	}

	void iterator1() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}

	void iterator2() {
		for (int i = 11; i <= 20; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		MultiThreadingTask2 obj1 = new MultiThreadingTask2();
		obj1.iterator1();
		obj1.start();

	}

}
