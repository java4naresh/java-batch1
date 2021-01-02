package com.naresh.javabatch1;

public class SynchronizedExampple extends Thread {
	

	public static void main(String[] args) {
		MyThread2 t1 = new MyThread2();
		t1.setName("t1");
		MyThread2 t2 = new MyThread2();
		t2.setName("t2");
		t1.start();
		t2.start();
	} 
	
	

}

class MyThread2 extends Thread {
	private static Customer2 c2 = new Customer2();
	
	public void run() {
		try {
			if(Thread.currentThread().getName().equals("t1")) {

				c2.withdraw(5000);

			} else {
				c2.deposite(5000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}

class Customer2 {
	
	int balance = 0;
	
	public synchronized void withdraw(int amount) throws InterruptedException {
		System.out.println("withdraw started");
		if(this.balance < amount) {
			wait();
		}
		this.balance = this.balance - amount;
		System.out.println("withdraw completed");
		//deposite(5000);
	}
	
	public synchronized void deposite(int amount) throws InterruptedException {
		System.out.println("deposite started");
		Thread.currentThread().sleep(2000);
		this.balance = this.balance + amount;
		notify();
		System.out.println("deposite completed");
		//withdraw(5000);
	}
}
