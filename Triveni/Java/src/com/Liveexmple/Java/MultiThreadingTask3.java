package com.Liveexmple.Java;

class Firstthread extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("First Thread value is " + i);
			try {
				Thread.sleep(500);// it may through Exception thats why using try & catch block
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}
}

class Secondthread extends Thread {
	public void run() {
		for (int i = 11; i <= 20; i++) {
			System.out.println("Second Thread value is " + i);
			try {
				Thread.sleep(500);// it may through Exception thats why using try & catch block
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class MultiThreadingTask3 {

	public static void main(String[] args) {
		Firstthread obj1 = new Firstthread();
		Secondthread obj2 = new Secondthread();
		obj1.start();
		try {
			Thread.sleep(10);// not using sleep method threads not print randomly
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		obj2.start();

	}
}
