package maps_Demo;

import java.util.Map;
import java.util.TreeMap;

import jdk.internal.org.jline.terminal.TerminalBuilder.SystemOutput;

public class MaoDemo {
	public static void main(String[] args) {
		
		//map<String, Long> contacts = new HashMap<>();// 1 null key allowed
		//map<String, Long> contacts = new LinkedHashMap<>();// 1 null key allowed
		TreeMap<String, Long> contacts = new TreeMap<>();//  null key not allowed
		
		contacts.put("Amit", 9800000012L);
		contacts.put("tushar", 9800000012L);
		contacts.put("nikhil", 9800000013L);
		contacts.put("Tejas", 9800000014L);
		contacts.put("Ronit", 9800000015L);
		System.out.println(contacts);
		contacts.put("Ronit", 9800000015L);
	}

}

