package com.naresh.javabatch1;

public class ThreadSleepExample extends Thread {
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
			if(i == 50) {
				try {
					Thread.currentThread().sleep(60000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		ThreadSleepExample thread = new ThreadSleepExample();
		thread.start();
	}

}
