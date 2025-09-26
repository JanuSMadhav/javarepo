package mypackage;

public class Bike {
	public final void run() {
		System.out.println("Runnning");
	}
	public class Main extends Bike{
		//public void run() { // error message: cannot override final method
			//System.out.println("Running Successfully");
		//}
	}
	
}
