/*Write a program, where RBI will be an interface, have a method recurringDeposit which can accept the
  amount and duration. This must be implemented in class HDFC.
	* when a customer deposits amount in HDFC, they must be able to know how much amount they will get 
	  after depositing for n period of time.
	* Interest rate is defined in RBI Interface. */
package newpackage;

public interface RBI {
	public void recurringDeposit(int amount, int duration);
	double interestRate = 7.10;

}
