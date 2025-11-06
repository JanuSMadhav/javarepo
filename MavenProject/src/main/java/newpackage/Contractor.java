package newpackage;

public class Contractor extends EmployeeClass{
	void calculateSalary() {
			int workinghours = 5;
			int paymentperhour = 5000;
			int salary = workinghours*paymentperhour;
			System.out.println("Salary of Contractor Employee : "+salary);
		}

	public static void main(String[] args) {
		Contractor cr = new Contractor();
		cr.calculateSalary();

	}

}
