// Learning JDBC (day 1) - practice file from Jdbc, pushed 2026-11-02
package day1;

import java.util.ArrayList;
import java.util.List;

public class DataProcessing {
public static void main(String[] args) {
	List<JeeStudent> allStudents = new ArrayList<JeeStudent>();
	allStudents.add(new JeeStudent(101,122,"shan","GJ",",Male"));
	allStudents.add(new JeeStudent(102,132,"pooja","GJ",",Female"));
	allStudents.add(new JeeStudent(103,142,"atul","GJ",",Male"));
	allStudents.add(new JeeStudent(104,112,"mayur","GJ",",Male"));
	allStudents.add(new JeeStudent(105,102,"ridhi","GJ",",Female"));
	allStudents.add(new JeeStudent(106,152,"rohit","MH",",Male"));
	allStudents.add(new JeeStudent(107,162,"makrant","MH",",Male"));
	allStudents.add(new JeeStudent(108,172,"pranit","MH",",Male"));
	allStudents.add(new JeeStudent(109,182,"sonam","MH",",Female"));
	allStudents.add(new JeeStudent(110,192,"adi","MH",",Female"));
	
//	List<JeeStudent> above150 = new ArrayList<JeeStudent>();
//	for(JeeStudent stu :allStudents) {
//		if(stu.marks>150) {
//			above150.add(stu);
//		}
//	}
//	above150.forEach((stu)-> System.out.println(stu));
	List<JeeStudent> filtered = allStudents.stream()
			.filter(stu -> stu.marks>150)
			.toList();
	
//	filtered.forEach((stu)-> System.out.println(stu));
	
//	STudnets from  MH 
	System.out.println("stu above 150 from MH");
			List<JeeStudent> mhAbove150 = allStudents.stream()
					.filter(stu -> stu.state.equals("MH"))
					.filter(stu -> stu.marks>150)
					.toList();
			
			
			Long count = allStudents.stream()
			.filter(stu -> stu.state.equals("MH"))
			.filter(stu -> stu.marks>150)
			.count();
			
			mhAbove150.forEach(stu-> System.out.println(stu));
}
}

class JeeStudent {
	int seatNo, marks;
	String name, state, gender;
	
	public JeeStudent(int seatNo, int marks, String name, String state, String gender) {
		super();
		this.seatNo = seatNo;
		this.marks = marks;
		this.name = name;
		this.state = state;
		this.gender = gender;
	}
public JeeStudent() {
		
	}
@Override
public String toString() {
	return "JeeStudent [seatNo=" + seatNo + ", marks=" + marks + ", name=" + name + ", state=" + state + ", gender="
			+ gender + "]";
}

	
}

