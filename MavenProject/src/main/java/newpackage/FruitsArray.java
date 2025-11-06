//Java program to retrieve an element (at a specified index) from a given array list.
package newpackage;

import java.util.ArrayList;

public class FruitsArray {

	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Orange");
		fruits.add("Pomegranate");
		fruits.add("Watermelon");
		System.out.println(fruits);
		System.out.println(fruits.get(4));

	}

}
