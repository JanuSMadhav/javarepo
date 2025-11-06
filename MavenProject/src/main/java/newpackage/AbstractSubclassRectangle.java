package newpackage;

public class AbstractSubclassRectangle extends AbstractShape {
	void calculateArea() {
		int length = 10;
		int breadth = 20;
		int area = length*breadth;
		System.out.println(+area);
	}
	public void display() {
		System.out.println("Area of the Rectangle is: ");
	}

	public static void main(String[] args) {
		AbstractSubclassRectangle tr = new AbstractSubclassRectangle();
		tr.display();
		tr.calculateArea();
		
		
	}
}
