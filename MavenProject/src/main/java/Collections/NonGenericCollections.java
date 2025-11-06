package Collections;

import java.util.ArrayList;

public class NonGenericCollections {

	public static void main(String[] args) {

		ArrayList li = new ArrayList();
		li.add("Hello");
		li.add(100);
		li.add(97.2f);
		String space1 = (String)li.get(0);
		int space2 = (int)li.get(1);
		float space3 = (float)li.get(2);
		System.out.println(space1);
		System.out.println(space2);
		System.out.println(space3);

	}

}
