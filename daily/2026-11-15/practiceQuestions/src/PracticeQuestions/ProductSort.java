// Learning practice questions - practice file from practiceQuestions, pushed 2026-11-15
package PracticeQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ProductSort {

	public static void main(String[] args) {

		ArrayList<Product> list = new ArrayList<Product>();
		list.add(new Product(1, "Laptop", 55000));
		list.add(new Product(2, "Mouse", 500));
		list.add(new Product(3, "Mobile", 20000));
		list.add(new Product(4, "Keyboard", 1200));
		list.add(new Product(5, "Headphones", 2500));

		System.out.println("Before sorting:");
		for (Product p : list) {
			System.out.println(p);
		}

		// sort by price (low to high)
		Collections.sort(list, new Comparator<Product>() {
			public int compare(Product p1, Product p2) {
				if (p1.price > p2.price) {
					return 1;
				} else if (p1.price < p2.price) {
					return -1;
				} else {
					return 0;
				}
			}
		});

		System.out.println();
		System.out.println("After sorting by price:");
		for (Product p : list) {
			System.out.println(p);
		}
	}
}

