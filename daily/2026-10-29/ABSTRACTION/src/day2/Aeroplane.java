// Learning abstraction and interfaces (day 2) - practice file from ABSTRACTION, pushed 2026-10-29
package day2;

public abstract class Aeroplane implements Moveable , Flyable, Printable {

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printOnCloth() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}
	
	

}

interface Flyable {
	void fly();
}

interface Moveable {
	void move();
}
