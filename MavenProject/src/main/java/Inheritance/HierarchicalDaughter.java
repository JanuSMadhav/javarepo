package Inheritance;

public class HierarchicalDaughter extends HierarchicalFather {
	public void data() {
		System.out.println("Name of daugter is Sana John");
	}
	
	public static void main(String[] args) {
		HierarchicalDaughter d1 = new HierarchicalDaughter();
		d1.details();
		d1.data();
		HierarchicalSon s1 = new HierarchicalSon();
		s1.details();
		s1.info();
		
	}

}
