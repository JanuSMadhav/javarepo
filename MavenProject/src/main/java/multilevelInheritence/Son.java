package multilevelInheritence;

public class Son extends Father {
	public void age() {
		System.out.println("Age is 20");
	}
public static void main(String[] args) {
	Son obj = new Son();
	obj.details();
	obj.data();
	obj.age();
}
}
