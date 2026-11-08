// Learning abstraction and interfaces (day 2) - practice file from ABSTRACTION, pushed 2026-10-15
package day2;

public interface Printable {
	
	/* till jdk 1.7 - full abstraction
	 * allows only abstract methods (by default all methods are public abstract)
	 * instance variables, constructor are not allowed in interface
	 * it allows public static final variables
	 */
	
	//by default all the variables are public, static, final
	// they must be asiigned the value at the time of declaration
	String pageSize="A4";
	// by default all methods are public abstract
	void print(); // public abstract
	void printOnCloth();

}

class PrintableChild implements Printable {

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printOnCloth() {
		// TODO Auto-generated method stub
		
	}
	
}
 
