/*Create an abstract class Shape with an abstract method calculateArea() 
 * and a non-abstract method display(). 
 * Then create two subclasses Circle and Rectangle that implement calculateArea() 
 * and test them in a main() method.
*/
package newpackage;

public abstract class AbstractShape {
	abstract void calculateArea();
	 public void display() {
		System.out.println("Details of Shape");
	}

}
