package mypackage;

public class AccessModifier1 {
	private int data = 90;
	public char[] msg;
	private void msg() {
		System.out.println("Hello");
	}
	
	
		public static void main(String args[]) {
			AccessModifier1 access1 = new AccessModifier1();
			access1.msg();
			System.out.println(access1.data);
		
	}
}
