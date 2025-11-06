//Program for custom exception
package Exception;

public class ValidateAge {
	public static void validate(int age) throws InvalidAgeException {
		if (age<18) {
			throw new InvalidAgeException("Candidate is not eligible for voting");
		}
		else {
			System.out.println("Candidate is eligible for voting");
		}
	}
	public static void main(String args[]) {
		try {
			validate(4);
			}
		catch (InvalidAgeException ie) {
			ie.printStackTrace();
		}
		finally {
			System.out.println("Executing rest of the code");
		}
		System.out.println("executing code");
	}

}
