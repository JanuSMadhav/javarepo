//this keyword for referring to local and instance variables
package newpackage;


public class ThisInstanceVariable {
	String name="Nikitha";
	int age=25;
	
	
	public ThisInstanceVariable(String name, int age) {
		System.out.println("Student 1 Name: "+name);
		System.out.println("Student 1 Age: "+age);
		System.out.println("Student 2 Name: "+this.name);
		System.out.println("Student 2 Age: "+this.age);
		}
	
	public static void main(String[] args) {
		ThisInstanceVariable sd = new ThisInstanceVariable("Teresa", 25);
		}
}
