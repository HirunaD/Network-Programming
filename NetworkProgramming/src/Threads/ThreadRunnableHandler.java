package Threads;

public class ThreadRunnableHandler {
	
	public static void main(String[] args) {
		
//		MultiThreadRunnable t1 = new MultiThreadRunnable(1);
//		MultiThreadRunnable t2 = new MultiThreadRunnable(2);
//		MultiThreadRunnable t3 = new MultiThreadRunnable(3);
//		
//		Thread th1 = new Thread(t1);
//		Thread th2 = new Thread(t2);
//		Thread th3 = new Thread(t3);
//		
//		th1.start();
//		th2.start();
//		th3.start();
		
		for(int i = 1; i <= 3; i++) {
			MultiThreadRunnable t = new MultiThreadRunnable(i);
			Thread th = new Thread(t);
			th.start();
			
			try {
				th.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}

}
