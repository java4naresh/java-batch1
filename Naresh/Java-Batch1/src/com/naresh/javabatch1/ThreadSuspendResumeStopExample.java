package com.naresh.javabatch1;

public class ThreadSuspendResumeStopExample extends Thread {
	
	
		public void run() {
			//Thread.currentThread().suspend();
			try {
				Thread.currentThread().sleep(5000);
				for (int i = 0; i < 2000; i++) {
					/*if(i == 500)
					Thread.currentThread().stop();*/
					System.out.println(i);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	

	public static void main(String[] args) {
		try {
		ThreadSuspendResumeStopExample t1 = new ThreadSuspendResumeStopExample();
		//t1.setDaemon(true);
		//System.out.println(t1.isDaemon());
		t1.start();
		t1.interrupt();
		} catch(Exception e) {
			e.printStackTrace();
		}
		/*try {
			Thread.currentThread().sleep(15000);
			t1.resume();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
	}

}
