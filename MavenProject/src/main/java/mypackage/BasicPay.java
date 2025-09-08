package mypackage;

public class BasicPay {
	float ba, ded, bon;
		public void  basicamount(float ba){
		this.ba =ba;
		System.out.println("Basic pay: "+ba);
	}
	public void deduction(float ded) {
		this.ded = ded;
		System.out.println("Deductions: "+ded);
	}
	public void bonus(float bon) {
		this.bon = bon;
		System.out.println("Bonus: "+bon);
	}
	}
	
	
	