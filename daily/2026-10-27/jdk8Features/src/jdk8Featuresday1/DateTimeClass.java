// Learning jdk8features (jdk8Featuresday1) - practice file from jdk8Features, pushed 2026-10-27
package jdk8Featuresday1;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;



public class DateTimeClass {
	public static  void main (String []args) {
//		java.util.Date;
//		java.sql.Date sqlDate;
//		
		//LocalDate
		LocalDate ld =  LocalDate.now();
		LocalDate BirthDate =  LocalDate.of(2002,7,07);
		LocalTime lt =  LocalTime.now();
		LocalDateTime ldt =  LocalDateTime.now();
		
		System.out.println(ld);
		System.out.println(lt);
		System.out.println(ldt);
		System.out.println(BirthDate);
		
		// findout the date differences 
		//add/subtract date-time
		
		Period age = Period.between(ld, BirthDate);
				System.out.println(age);
				
				LocalDate nextWeek = ld.plusDays(7);
				System.out.println(nextWeek);
	}
	
	
	

}

