package mypackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HashSetExample {

	public static void main(String[] args) {
		Set<String> fruits = new TreeSet<>();
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Mango");
		fruits.add("Apple");
		System.out.println(fruits);
		Iterator<String> it = fruits.iterator();
		while(it.hasNext()) {
		System.out.println(it.next());
		}
	}

}
