// Learning multi threading.java (day 1) - practice file from MultiThreading.java, pushed 2026-10-31
package day1;

public class Demo extends Thread {
	
	public static void main(String [] args) {
		Demo d1 = new Demo();//thread
		
		Demo d2 = new Demo();// thread
		
		
		d1.start();
	// starting the thread 
		d2.start();
	}
	public void run() {
		for(int i =1; i <=5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000); // 1000 ms = 1 sec
				
			} catch (InterruptedException e ) {
				e.printStackTrace();
			}
		}
	}

}



