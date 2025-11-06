//program to search an element in an array list.
package newpackage;

import java.util.ArrayList;

public class SearchElement {

	public static void main(String[] args) {
		ArrayList<String> veg = new ArrayList<String>();
		 veg.add("Carrot");
		 veg.add("Potato");
		 veg.add("Cauliflower");
		 veg.add("Cabbage");
		 veg.add("Onion");
		 veg.add("Tomato");
		 String find = "Onion";
		 for (int i =0; i<veg.size();i++)
		 {
			 if (veg.get(i)==find) {
			 System.out.println(veg.get(i)+" is at index "+i);
		 }
			 }
	}

}
