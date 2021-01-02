package com.naresh.javabatch1;

public class ThreadWaitExample {

	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.setName("t1");
		MyThread t2 = new MyThread();
		t2.setName("t2");
		t1.start();
		t2.start();
		//System.out.println(MyThread.getAmount());
	}

}

class MyThread extends Thread {
	
	static Customer c = new Customer();
	
	@Override
	public void run() {
		if(Thread.currentThread().getName().equals("t2")) {
			try {
				c.withdraw(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} else {
			c.deposite(50000);
		}
	}
	
	
}

class Customer {
	private int amount = 5000;
	public synchronized void deposite(int depositeAmount) {
		System.out.println("entered into deposite");
		amount = amount + depositeAmount;
		try {
			Thread.currentThread().sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		notify();
		System.out.println("Deposite completed");
	}
	
	public synchronized void withdraw(int withdrawAmount) throws InterruptedException {
		System.out.println("entered into withdraw");
		if(amount < withdrawAmount) {
			Thread.currentThread().wait();
		}
		amount = amount - withdrawAmount;
		System.out.println("Withdraw completed");
	}
}
