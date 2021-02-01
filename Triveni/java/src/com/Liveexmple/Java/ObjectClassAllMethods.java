package com.Liveexmple.Java;

public class ObjectClassAllMethods extends Object {
	private static Object o2;

	public void run() {
		for (int i = 0; i < 10; i++) {
			if (i == 10) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		ObjectClassAllMethods o1 = new ObjectClassAllMethods();
		ObjectClassAllMethods o2 =  o1.clone();
		System.gc();
		 o2 = null;
		o1.start();

	}

	@Override
	public void finalize() {
		System.out.println("Finalized");
	}


}
