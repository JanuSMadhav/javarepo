package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class LinkedList {

	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Nano");
		cars.add("Ford");
		//System.out.println(cars);
		cars.add(0,"Maruti");
		//System.out.println(cars.get(3));
		cars.set(1, "Opel");
		cars.remove(2);
		cars.size();
		//for (int i=0;i<cars.size();i++) {
			//System.out.println(cars.get(i));
		//}
		Iterator<String> it = cars.iterator();
		while(it.hasNext()) {
			String item = it.next();
			System.out.println(item);
		
		}
	}

}
