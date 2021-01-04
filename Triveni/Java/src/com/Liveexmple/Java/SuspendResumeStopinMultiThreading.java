package com.Liveexmple.Java;

public class SuspendResumeStopinMultiThreading extends Thread {
	public void run() {
		Thread.currentThread().suspend();
		for (int i = 0; i < 200; i++) {
			if (i == 200)
				Thread.currentThread().stop();
			System.out.println(i);
		}
	}

	public static void main(String[] args) {

		SuspendResumeStopinMultiThreading t1 = new SuspendResumeStopinMultiThreading();
		t1.start();
		try {
			Thread.currentThread().sleep(500);
			t1.resume();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
