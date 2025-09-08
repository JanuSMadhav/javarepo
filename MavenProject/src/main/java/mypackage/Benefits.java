package mypackage;

public class Benefits extends BasicPay {
	float hra, pf;
	public void  houserentallowance() {
		hra = 0.05f * ba;
		System.out.println("House Rent Allowance: " +hra);
		
	}
	public void providentfund() {
		pf = 0.2f * ba;
		System.out.println("Provident Fund: "+pf );
		}
}
