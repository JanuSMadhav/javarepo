package newpackage;

class Dog extends Animal {
	String colour = "Black";
	
void print () {
	System.out.println(colour);
	System.out.println(super.colour);
	}

public static void main(String args[]) {
	Dog d = new Dog();
			d.print();
}
}

