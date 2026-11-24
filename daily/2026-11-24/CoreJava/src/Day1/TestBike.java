// Learning core java (day 1) - practice file from CoreJava, pushed 2026-11-24
package Day1;

public class TestBike {
public static void main(String[]args) {
	
	Bike b = new Bike();
	b.setModel("Ninja");
	b.setColor("Green");
	b.setCc(1000);
	b.setPrice(450000);

	System.out.println(" My fav Bike is " + b.getModel());
	System.out.println(" Its " + b.getColor() + " in color");
	System.out.println(" AND ITS " + b.getCc() + "CC");
	System.out.println(" Worth " + b.getPrice());
}
}

