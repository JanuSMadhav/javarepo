package Inheritance;

public class Childclass extends SimpleInheritence{
	public void leaves() {
		System.out.println("Leaves are green");
	}

	public static void main(String[] args) {
		Childclass obj = new Childclass();
		obj.flowers();
		obj.leaves();

	}

}
