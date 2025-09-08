package newpackage;

public class Child extends Parent {
	String s1 = "Child Name";
			public Child() {
				super();
				System.out.println("Child is called");
		
	}
	void showMessage() {
		super.showMessage();
		System.out.println("Message from Child");
		
	}
	void displayNames() {
		String name = "Senorita";
		super.displayNames();
		System.out.println(name);
	}


	public static void main(String args[]) {
		Child ch = new Child();
			ch.showMessage();
			ch.displayNames();
		}
		
	}
