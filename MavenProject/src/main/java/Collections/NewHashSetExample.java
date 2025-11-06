package Collections;

import java.util.HashSet;
import java.util.Set;


public class NewHashSetExample {

	public static void main(String[] args) {
		Set<String> fruits = new HashSet<>();
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Mango");
		fruits.add("Apple");
		System.out.println(fruits);
		Set<String> morefruits = new HashSet<>();
		morefruits.add("grapes");
		morefruits.add("pineapple");
		fruits.addAll(morefruits);
		System.out.println(fruits);
		System.out.println(morefruits);
		fruits.retainAll(morefruits);
		morefruits.isEmpty();
		fruits.clear();
		System.out.println(fruits);
		morefruits.isEmpty();
		System.out.println(fruits.isEmpty());
		
	}

}