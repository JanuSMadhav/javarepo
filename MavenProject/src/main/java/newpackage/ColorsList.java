//Java program to create a new array list, add some colors(string) and print out the collection
package newpackage;

import java.util.ArrayList;

public class ColorsList {

	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<String>();
		colors.add("Blue");
		colors.add("Yellow");
		colors.add("Green");
		colors.add("Pink");
		colors.add("Orange");
		colors.add("Red");
		System.out.println("COLORS: "+colors);
	}

}
