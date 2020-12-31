package com.naresh.javabatch1;

public class ThreadYieldExample extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 200; i++) {
			System.out.println(i+"-"+Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {
		ThreadYieldExample t = new ThreadYieldExample();
		t.setName("t");
		t.start();
		Thread.currentThread().yield();
		for (int i = 0; i < 200; i++) {
			System.out.println(i+"-"+Thread.currentThread().getName());
		}
	}

}
