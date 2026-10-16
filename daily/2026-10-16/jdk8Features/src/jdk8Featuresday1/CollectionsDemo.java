// Learning jdk8features (jdk8Featuresday1) - practice file from jdk8Features, pushed 2026-10-16
package jdk8Featuresday1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionsDemo {
	
	public static void main(String[]args) {
List<String> data = new ArrayList<String>();
data.add("one");
data.add("Two");
data.add("Three");
data.add("Four");

Iterator<String> itr = data.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
}
for(String s: data) {
	System.out.println(s);
}

data.forEach((obj)-> System.out.println(obj));

	}
}

