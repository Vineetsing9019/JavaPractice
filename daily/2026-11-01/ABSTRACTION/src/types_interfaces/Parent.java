// Learning abstraction and interfaces (types interfaces) - practice file from ABSTRACTION, pushed 2026-11-01
package types_interfaces;

public interface Parent {
public void test();
}

// extended interface of Parent
interface Child extends Parent{
	public void demo();
	public void print();
}
 class Demo implements Child{

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void demo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
	 
 }
