package Polymorphism;

public class MethodOverridingSurgeon extends MethodOverridingDoctor{
	public void treatPatient() {		//using same method of the parent class. if parent used protected, then child can use public access modifier
		System.out.println("Surgery fixed on next week");
		
	}
	

	public static void main(String[] args) {
		MethodOverridingDoctor doc = new MethodOverridingDoctor();
		doc.treatPatient();
		MethodOverridingSurgeon surg = new MethodOverridingSurgeon();
		surg.treatPatient();

	}

}
