package mypackage;

public class Triangle extends GraphicObject {
	void showShape() {
		System.out.println("Object type is triangle");
	}

	public static void main(String[] args) {
		Triangle tr = new Triangle();
		tr.showShape();

	}

}
