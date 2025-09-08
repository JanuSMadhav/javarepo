package mypackage;

public class SalarySlip extends Benefits {
	float sal;
	public void salaryinhand() {
		sal = ba+bon+hra-ded-pf;
		System.out.println("Total Salary:" +sal);
		}

	public static void main(String[] args) {
		SalarySlip emp = new SalarySlip();
		//System.out.println("Enter the basic pay");
		float ba = Float.parseFloat(args[0]);
		emp.basicamount(ba);
		//System.out.println("Enter the deductions:");
		float ded = Float.parseFloat(args[1]);
		emp.deduction(ded);
		//System.out.println("Enter the bonus amount:");
		float bon = Float.parseFloat(args[2]);
		emp.bonus(bon);
		emp.houserentallowance();
		emp.providentfund();
		emp.salaryinhand();
		System.out.println("\n---Salary Slip---");
		System.out.println("Basic Pay:     "+emp.ba);	
		System.out.println("Deductions:    "+emp.ded);
		System.out.println("Bonus:         "+emp.bon);
		System.out.println("PF:            "+emp.pf);
		System.out.println("HRA:           "+emp.hra);
		System.out.println("Total Salary:  "+emp.sal);
	}

}
