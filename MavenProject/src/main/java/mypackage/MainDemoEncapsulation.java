package mypackage;

public class MainDemoEncapsulation {

	public static void main(String[] args) {
		EncapsulationGetterSetter en = new EncapsulationGetterSetter();
		//en.accBalance=9999;
		//System.out.println(en.accNumber);
		en.setAccountBalance(12390, 2345);
		System.out.println(en.getAccountBalance());
		System.out.println(en.getAccountNumber());
		
		}
}

