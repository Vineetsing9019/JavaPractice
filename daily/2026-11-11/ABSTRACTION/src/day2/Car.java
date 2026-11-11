// Learning abstraction and interfaces (day 2) - practice file from ABSTRACTION, pushed 2026-10-19
package day2;

public abstract class Car {
public void display() {
//	System.out.println("displaying car details");
//concrete method- method with body
}

// abstraction: showing the functionality, hiding the implementation
// methods are declared(no ijmplementation)
//every child class must override the parents abstraction method

  abstract public void start();
  abstract public void stop();

public static void main(String []args ) {
	//abstract class cannot be instantiated
	// we cant create the object of abstract class
	// Car c = new Car();
	BMW c = new BMW();
	c.display(); // parent
	c.start();//child
	c.stop();//child
}
}

   class BMW extends Car{

	@Override
	public void start("BMW is started") {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop("BMW is stopped") {
		// TODO Auto-generated method stub
		
	}
	 
 }
   
