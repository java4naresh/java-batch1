package corejavaprograms;

public class SleepingThread extends Thread{

	@Override
	public void run() {
		 for(int i=0;i<7;i++){
			 try{Thread.sleep(5000);
			 }
			 catch(InterruptedException e ){
				 System.out.println(e);
			 }
			 System.out.println(i);
		 }
	}
      public static void main(String[] args) {
		  SleepingThread t=new SleepingThread();
		  SleepingThread t1=new SleepingThread();
		  t.start();
		  t1.start();
	}
}
