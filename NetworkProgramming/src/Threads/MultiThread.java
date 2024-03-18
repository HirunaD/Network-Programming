package Threads;

public class MultiThread extends Thread {
	
	private int thread_number;
	
	public MultiThread(int t) {
		this.thread_number = t;
	}
	
	@Override
	public void run() {
		for(int i = 0; i <= 5; i++) {
			System.out.println(i + " from thread: " + thread_number);
			
			if(thread_number == 2) {
				throw new RuntimeException();
			}
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
		}
	}

}
