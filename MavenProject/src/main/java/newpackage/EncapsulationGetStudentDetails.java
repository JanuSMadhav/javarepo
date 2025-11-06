package newpackage;

public class EncapsulationGetStudentDetails {

	public static void main(String[] args) {
		
		EncapsulationStudentData student = new EncapsulationStudentData();
		student.setName("Anika");
		student.setAge(15);
		student.setGrade(9);
		System.out.println("Name: "+student.getName());
		System.out.println("Age: "+student.getAge());
		System.out.println("Grade: "+student.getGrade());
	}

	

}
