package com.Liveexmple.Java;

public class InterruptmethodinMultiThreading extends Thread {
	public void run() {

		try {
			Thread.currentThread().sleep(500);

		} catch (InterruptedException e) {
			System.err.println(" InterruptedException");
		}

		for (int i = 0; i <= 200; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		InterruptmethodinMultiThreading i1 = new InterruptmethodinMultiThreading();
		i1.start();
		// i1.interrupt();
		System.out.println(i1.isInterrupted());
		System.out.println(i1.interrupted());

	}

}
