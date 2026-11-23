package day1;

public class Demo1 {
	public static void main (String[] args) {
		
//		array declarations
		int[] data = {10,20,30,40,50}; 
//		recommended int[]
//		int  []data1= {10,20,30}	is acceptable
//		int data2[]= {10,20,30} is also acceptable
//		int x=100; is for single variable
//		
		
		
		
//		System.out.println(data[0]);
//		System.out.println(data[1]);
//		System.out.println(data[2]);
//		System.out.println(data[3]);
//		System.out.println(data[4]);
//		
//		WE CAN USE INSTEAD FOR  PRINTING FOR MANY TIMES 
//		
//		System.out.println("no of elements: +" data.length);
//		it is use to find length of variable
		
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
	}

}

