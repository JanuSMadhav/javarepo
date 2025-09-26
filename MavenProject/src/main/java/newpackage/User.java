package newpackage;

public class User {
	public int getPin(int pin) {
		return pin;
		
	}
	
	public static void main(String[] args) {
		Bank bank = new Bank();
		User user = new User();
		int pinEntered = user.getPin(1212);
		bank.setPinNumber(pinEntered);
		if (bank.validatePin()) {
			System.out.println("PIN is correct, please proceed");
		}
		
		else {
			System.out.println("Invalid PIN, Try again!!!");
		}
	}

}
