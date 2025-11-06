package AccessModifiers;

public class AccessModifierPrivate {
	private int data = 90;
	public char[] msg;
	private void msg() {
		System.out.println("Hello");
	}
	
	
		public static void main(String args[]) {
			AccessModifierPrivate access1 = new AccessModifierPrivate();
			access1.msg();
			System.out.println(access1.data);
		
	}
}
