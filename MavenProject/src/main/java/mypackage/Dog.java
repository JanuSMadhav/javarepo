package mypackage;

 class Dog implements Pet{
	public void test() {
		System.out.println("Interface method");
	}
	public static void main(String args[]) {
	Dog d = new Dog();
	d.test();
	}
}
