package com.Liveexmple.Java;

public class MultiThreadingTask1 extends Thread {
	public void run() {
		Iterator();
		Iterator1();
	}

	public void Iterator() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);// it may through Exception thats why using try & catch block
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	void Iterator1() {
		for (int i = 11; i <= 20; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);// it may through Exception thats why using try & catch block
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		MultiThreadingTask1 obj1 = new MultiThreadingTask1();
		// obj1.Iterator1();
		obj1.start();

	}
}
