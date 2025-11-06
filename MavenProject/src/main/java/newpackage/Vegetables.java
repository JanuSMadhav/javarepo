//Java program to iterate through all the elements in an array list.
package newpackage;

import java.util.ArrayList;
import java.util.Iterator;

public class Vegetables {

	public static void main(String[] args) {
		 ArrayList<String> veg = new ArrayList<String>();
		 veg.add("Carrot");
		 veg.add("Potato");
		 veg.add("Cauliflower");
		 veg.add("Cabbage");
		 veg.add("Onion");
		 veg.add("Tomato");
		 System.out.println(veg);
		 Iterator<String> it = veg.iterator();
		 while(it.hasNext()) {
		 String vegetables = it.next();
		 System.out.println(vegetables);
		 }
	}
}
