package newpackage;

public class HDFC implements RBI{
	public void recurringDeposit(int amount, int duration) {
		
		double totalAmount = amount*(duration+amount)*(duration*(duration+1)/2)*(interestRate/(12*100));
		System.out.println("Amount deposited: "+amount);
		System.out.println("Rate: "+interestRate);
		System.out.println("Duration of deposit: "+duration);
		System.out.println("Final Amount: "+totalAmount);
	}
	public static void main(String[] args) {
		HDFC hdfc = new HDFC();
		hdfc.recurringDeposit(2000, 10);		
		}
			
}
	

