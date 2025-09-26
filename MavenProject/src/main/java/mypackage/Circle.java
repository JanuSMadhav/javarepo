package mypackage;

public class Circle extends GraphicObject{ //child class must have the implementation of the abstract method
	void showShape() {
		System.out.println("Object type is circle");
	}
	public static void main(String args[]) {
		Circle cr = new Circle();
		cr.showShape();
	}
}
