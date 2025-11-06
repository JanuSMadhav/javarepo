package Exception;

public class ExceptionDemo {
	public static void main(String args[]) {
		System.out.println("Exception checking");
		try {
		int ar[] = new int[5];
		ar[6]=50/0;
		System.out.println("Hello");
		}
		catch(ArithmeticException ae) {
			ae.printStackTrace();
		System.out.println(ae.getMessage());
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("exception");
		}
		
		System.out.println("Rest of the code");
	}

}
