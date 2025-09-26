//Program for Encapsulation
package mypackage;

public class EncapsulationGetterSetter {
	private int accNumber;
	private int accBalance;
	public void setAccountBalance(int accBalance, int accNumber) {
		this.accNumber = accNumber;
		this.accBalance = accBalance;
		}
	public int getAccountBalance() {
		return accBalance;
	}
	public int getAccountNumber() {
		return accNumber;
	}

}
