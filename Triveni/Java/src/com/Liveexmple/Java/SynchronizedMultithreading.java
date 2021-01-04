package com.Liveexmple.Java;

public class SynchronizedMultithreading extends Thread {

	public static void main(String[] args) {
		SynchronizedMultithreading s1 = new SynchronizedMultithreading();
		s1.setName("s1");
		SynchronizedMultithreading s2 = new SynchronizedMultithreading();
		s2.setName("s2");
		s1.start();
		s2.start();
	}

	class MyThread extends Thread {
		private  customer c2 = new customer();

		public void run() {
			if(Thread.currentThread().getName().equals("s1"))
			{
				c2.withdraw(5000);
			}
			else
			{
				c2.deposite(5000);
			}
		}
	}

	class customer {

		private int amount = 0;

		public synchronized void withdraw1(int amount) {
			if (this.amount < amount) {
				deposite(5000);

			} else {
				// TODO Auto-generated method stub

			}
			{
				this.amount = this.amount - amount;

			}
			{
				this.amount = amount - amount;

			}
		}

		public synchronized void deposite(int amount) {
			this.amount = this.amount + amount;
			withdraw1(5000);
		}

		private void withdraw(int i) {
			// TODO Auto-generated method stub

		}
	}
}
