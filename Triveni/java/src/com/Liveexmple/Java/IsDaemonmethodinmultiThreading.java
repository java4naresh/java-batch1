package com.Liveexmple.Java;

public class IsDaemonmethodinmultiThreading extends Thread {

	public void run() {
		for (int i = 0; i <= 200; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		IsDaemonmethodinmultiThreading d1 = new IsDaemonmethodinmultiThreading();
		// d1.setDaemon(true);//Run in Background we using daemon()//
		d1.start();
		System.out.println(d1.isDaemon());

	}
}
