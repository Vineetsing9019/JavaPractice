// Learning oop (StringDemo) - practice file from oop, pushed 2026-10-23
package StringDemo;

public class MutableString {
public static void main(String []args) {
	StringBuffer sb1 = new StringBuffer("welcome");
	StringBuffer sb2 = new StringBuffer("hello");
	
	//mutable strings
	
	sb1.append(" all"); //welcome all
	System.out.println(sb1);
	
	//immutable string
	String s = new String("welcome");
	s.concat(" all");
	System.out.println(s); //welcome
	
	//methods
	//indexOf, charAt, substring
	System.out.println(sb1.substring(3));//come all 
	System.out.println(sb1.substring(2,5));//lco
	
	//compareTo, equals
	
	sb2.reverse(); // olleh
	// sb1 = "welcome all"
	
	sb1.delete(3, 7);
	System.out.println(sb1);
	sb1.insert(3, 7);
	System.out.println(sb1);

	
	
}
}

