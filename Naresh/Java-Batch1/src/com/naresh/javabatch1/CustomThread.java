package com.naresh.javabatch1;

public class CustomThread implements Runnable {
	
	@Override
	// running
	public void run() {
		//System.out.println(Thread.currentThread().getName());
		iterate2();
		try {
			Thread.currentThread().wait(); // blocking or non running state
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	} // termination
	
	void iterate1() {
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
		}
	}
	
	void iterate2() {
		for (int i = 500; i < 601; i++) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		CustomThread ct = new CustomThread(); // new state
		//ct.start();
		Thread myThread = new Thread(ct);
		myThread.start(); // runnable
		
		ct.iterate1();
		//ct.iterate2();
	}

}
