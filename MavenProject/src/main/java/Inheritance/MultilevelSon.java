package Inheritance;

public class MultilevelSon extends MultilevelFather {
	public void age() {
		System.out.println("Age is 20");
	}
public static void main(String[] args) {
	MultilevelSon obj = new MultilevelSon();
	obj.details();
	obj.data();
	obj.age();
}
}
