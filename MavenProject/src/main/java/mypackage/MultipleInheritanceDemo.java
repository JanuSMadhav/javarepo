package mypackage;

public class MultipleInheritanceDemo {
	public void ShowDetails(String name, int age) {
		System.out.println(name);
		System.out.println(age);
	}

	public static void main(String[] args) {
		MultipleInheritanceDemo mid = new MultipleInheritanceDemo();
	mid.ShowDetails("Anu", 35);
	}

}
