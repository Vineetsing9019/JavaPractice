// Learning Java basics (day 6) - practice file from introjava, pushed 2026-10-30
package day6;

import java.util.Scanner;

public class rank {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a month: ");
        String monthName= sc.next();
        
//        if(rank == 1) {
//        	System.out.print("gold");
//        	
//        }
//        if(rank == 2)   {
//        	System.out.print("silver");
//        	
//        }
//        	
//        	if(rank ==3)   {
//            	System.out.print("bronze");
//        	}
//            	
//            	else  	{
//                	System.out.print("better luck next time");
//            	}
//                	
//                	sc.close();
//                	
//            		
//        		
//        	
//        	
//        	
//        }
//        
      
switch(monthName) {
case "feb":
	System.out.println(monthName + " has 29 days for leap year,or 28 days");
	break;
case "jan","march","may","july","aug","oct","dec":
	System.out.println(monthName + " has 31 days ");
	break;
	
case "apr","june","sept","nov":
	System.out.println(monthName + " has 30 days ");
	break;
	
	default:
		System.out.println("please enetr valid name");
	
}
       
    }
}
        
      
        
    


