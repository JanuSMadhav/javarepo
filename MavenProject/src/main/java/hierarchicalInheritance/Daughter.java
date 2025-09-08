package hierarchicalInheritance;

public class Daughter extends Father {
	public void data() {
		System.out.println("Name of daugter is Sana John");
	}
	
	public static void main(String[] args) {
		Daughter d1 = new Daughter();
		d1.details();
		d1.data();
		Son s1 = new Son();
		s1.details();
		s1.info();
		
	}

}
