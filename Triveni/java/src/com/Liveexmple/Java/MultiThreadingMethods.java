package com.Liveexmple.Java;

public class MultiThreadingMethods extends Thread {
	public void run() {
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.MIN_PRIORITY);
		System.out.println(Thread.NORM_PRIORITY);
		System.out.println(Thread.currentThread().getId());
		System.out.println(Thread.currentThread().getState());
		System.out.println(Thread.currentThread().getName());
		System.out.println("Hi");
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println();
	}

	public static void main(String[] args) throws InterruptedException {
		MultiThreadingMethods t1 = new MultiThreadingMethods();
		MultiThreadingMethods t2 = new MultiThreadingMethods();
		// MultiThreadingTask4 t3=new MultiThreadingTask4();
		// MultiThreadingTask4 t4=new MultiThreadingTask4();
		t1.start();
		t1.join();
		t2.start();
		// t2.join();
		// t3.start();
		// t4.start();

	}

}
