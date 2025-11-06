package Exception;

public class ExceptionThrow {
	public static void validate(int age) {
		if (age<18) {
			throw new ArithmeticException("Person is not eligible for voting");
		}
		else {
			System.out.println("Person is eligible for voting");
		}
	}
	
	public static void main(String[] args) {
		validate(9); //no object needs to be created to call validate() as validate is static method

	}

}
