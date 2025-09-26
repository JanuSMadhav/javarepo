package newpackage;

public class StudentInfo {

	public static void main(String[] args) {
		Student sd = new Student("Aakarsh", 12);
		Address sdata = new Address("No:20, North Avenue, Trivandrum", sd);
		System.out.println("Student Name: "+sdata.studentdetails.StudentName);
		System.out.println("Roll Number: "+sdata.studentdetails.rollnumber);
		System.out.println("Address: "+sdata.address);
	}

}
