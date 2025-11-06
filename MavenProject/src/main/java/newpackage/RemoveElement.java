//Java program to remove the third element from an array list.
package newpackage;

import java.util.ArrayList;

public class RemoveElement {

	public static void main(String[] args) {
		ArrayList<String> shapes = new ArrayList<String>();
		shapes.add("Circle");
		shapes.add("Triangle");
		shapes.add("Rectangle");
		shapes.add("Sqaure");
		shapes.add("Pentagon");
		shapes.add("Rhombus");
		shapes.add("Star");
		shapes.size();
		System.out.println(shapes);
		shapes.size();
		System.out.println("Size: "+shapes.size());
		shapes.remove(4);
		shapes.size();
		System.out.println(shapes);
		System.out.println("Size: "+shapes.size());
	}

}
