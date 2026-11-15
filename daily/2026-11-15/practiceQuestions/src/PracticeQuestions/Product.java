// Learning practice questions - practice file from practiceQuestions, pushed 2026-11-15
package PracticeQuestions;

public class Product {

	int id;
	String name;
	double price;

	Product(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public String toString() {
		return id + "  " + name + "  " + price;
	}
}

