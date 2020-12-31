package com.naresh.javabatch1;

public class ThreadJoinExample extends Thread {
	
	/*public ThreadJoinExample() {
		
	}
	
	public ThreadJoinExample(String name) {
		super(name);
	}
	*/
	@Override
	public void run() {
		System.out.println(Thread.currentThread());
		System.out.println(Thread.currentThread().getId());
		System.out.println(Thread.currentThread().getState());
		System.out.println(Thread.currentThread().isAlive());
		/*for (int i = 0; i < 1000; i++) {
			System.out.println(Thread.currentThread().getName()+"-"+i);
		}*/
		System.out.println();
	}

	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread());
		ThreadJoinExample t1 = new ThreadJoinExample();
		ThreadJoinExample t2 = new ThreadJoinExample();
		ThreadJoinExample t3 = new ThreadJoinExample();
		System.out.println(t1.getState());
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MAX_PRIORITY);
		t1.setName("t1");
		t2.setName("t2");
		t3.setName("t3");
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		System.out.println(t3.getPriority());
		t1.start();
		//t1.join();
		t2.start();
		//t2.join();
		t3.start();
	}
}
