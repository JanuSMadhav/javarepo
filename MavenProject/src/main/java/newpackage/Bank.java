//Program to withdraw amount from an ATM
package newpackage;

public class Bank {
	private int pinNumber;
	public void setPinNumber(int pinNumber) {
		this.pinNumber=pinNumber;		
	}
		
		public int getPinNumber() {
			return pinNumber;
			}
		public boolean validatePin() {
			if (pinNumber == 1001 || pinNumber==1234 || pinNumber==1212){
				return true;
			}
				else {
					return false;
				}
			}
} 
