// Learning multi threading.java (day 1) - practice file from MultiThreading.java, pushed 2026-10-25
package day1;

public class Intro {
public static void main(String [] args) {
	Intro i1 = new Intro();
	i1.run();
	Intro i2 = new Intro();
	i2.run();
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

