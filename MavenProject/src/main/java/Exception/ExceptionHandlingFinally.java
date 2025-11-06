package Exception;

public class ExceptionHandlingFinally {

	public static void main(String[] args) {
		int data = 50/2;
		System.out.println(data);
		try {
			int x = 100/0;
		}
/*catch(Exception ex) {
	ex.printStackTrace();
}*/
		finally {
			System.out.println("Executing finally block");
		}
		System.out.println("Rest of the code");
	}

}
