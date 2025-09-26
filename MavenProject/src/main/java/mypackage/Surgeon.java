package mypackage;

public class Surgeon extends Doctor{
	public void treatPatient() {		//using same method of the parent class
		System.out.println("Surgery fixed on next week");
		
	}
	

	public static void main(String[] args) {
		Doctor doc = new Doctor();
		doc.treatPatient();
		Surgeon surg = new Surgeon();
		surg.treatPatient();

	}

}
