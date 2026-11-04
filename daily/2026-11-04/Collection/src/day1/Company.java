// Learning the Collections framework (day 1) - practice file from Collection, pushed 2026-11-04
package day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Company {
	public static void main(String[] args) {
		List<Employee> allEmp1=new ArrayList<>();
		allEmp1.add(new Employee());
		
		allEmp1.add(new Employee(102,30000,"rekha","rekha@123"));
		allEmp1.add(new Employee(101,50000,"amit","amit@123"));
		allEmp1.add(new Employee(105,40000,"rahul","rahul@123"));
		allEmp1.add(new Employee(104,60000,"tushar","tushar@123"));
		allEmp1.add(new Employee(103,45000,"preet","preet@123"));
		
//		System.out.println(allEmp1);//gives output in single row 
//		Iterator<Employee> itr=allEmp1.iterator();//displaying  object
//		while(itr.hasNext()) {
//			Employee e=itr.next();
//			System.out.println(e);
//		}
		
		Collections.sort(allEmp1);//e1.compareTO(e2);
		
		Iterator<Employee> itr =allEmp1.iterator();//displaying  object
		while(itr.hasNext()) {
			Employee e=itr.next();
			System.out.println(e);
		}
		
		
		
		
	}

}
