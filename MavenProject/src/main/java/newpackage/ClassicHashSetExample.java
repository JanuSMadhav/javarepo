package newpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ClassicHashSetExample {
	
	public static void main(String[] args) {
	Set<String> flowers = new HashSet<>();
	flowers.add("Sunflower");
	flowers.add("Rose");
	flowers.add("Jasmine");
	System.out.println(flowers);
	System.out.println(flowers.contains("Marigold"));
	System.out.println(flowers.size());
	flowers.remove("Rose");
	
	Iterator<String> it = flowers.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	

}
}
