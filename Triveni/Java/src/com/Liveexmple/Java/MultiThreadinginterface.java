package com.Liveexmple.Java;

public class MultiThreadinginterface  implements Runnable{
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
		Runnable obj1 = new MultiThreadingTask1();
		 Thread t1=new Thread(obj1);
		// obj1.Iterator1();
		t1.start();

	}

}
