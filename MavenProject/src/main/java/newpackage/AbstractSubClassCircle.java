package newpackage;

public class AbstractSubClassCircle extends AbstractShape {
	void calculateArea() {
		int radius = 5;
		double area = 3.14*radius*radius;
		System.out.println(+area);
	}
	 public void display() {
		System.out.println("Area of the circle is: ");
	}

	public static void main(String[] args) {
		AbstractSubClassCircle cr = new AbstractSubClassCircle();
		cr.display();
		cr.calculateArea();
		
		
	}

}
