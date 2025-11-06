package newpackage;

public class FullTimeEmployee {
	void calculateSalary() {
		int paymentperhour = 5000;
		int salary = 8*paymentperhour;
		System.out.println("Salary of Full Time Employee: "+salary);
		
	}

	public static void main(String[] args) {
		FullTimeEmployee ft = new FullTimeEmployee();
		ft.calculateSalary();
		
	}

}
