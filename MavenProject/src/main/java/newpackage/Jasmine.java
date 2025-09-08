package newpackage;

public class Jasmine extends Flower {
	void display() {
		System.out.println("Jasmine is beautiful and white in colour");
	}
	
	void fragrance() {
		super.display();
		System.out.println("Jasmine smells fantastic");
	}


public static void main(String args[]) {
	Jasmine j = new Jasmine();
	j.display();
	j.fragrance();
}}