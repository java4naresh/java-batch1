package com.Liveexmple.Java;

public class WaitNotifymultithreading  {

	public static void main(String[] args) {
		MyThread s1=new MyThread();
		s1.setName("s1");
		MyThread  s2 = new MyThread ();
		s2.setName("s2");
		s1.start();
		s2.start();

	}}

	class MyThread extends Thread {
		private static customer c3 = new customer();// here static is very important

		public void run() {
			try {

				if (Thread.currentThread().getName().equals("s1")) {
					c3.withdraw1(5000);
				} else {
					c3.deposite(5000);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

 class customer {

		int balance = 0;

		public synchronized void withdraw1(int amount) throws InterruptedException {
			System.out.println("Withdraw Started");
			if (this.balance < amount) {
				wait();
			}
			this.balance = this.balance - amount;
			System.out.println("Withdraw Completed");

		}

		public synchronized void deposite(int amount) throws InterruptedException {
			System.out.println("Deposit Started");
			Thread.currentThread().sleep(5000);
			this.balance = this.balance + amount;
			notify();
			System.out.println("Deposit Completed");
		}
	}

