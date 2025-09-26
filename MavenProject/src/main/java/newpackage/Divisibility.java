//Program to check if the addition result is divisible by 10
//Class 2: Check if the addition result is divisible by 10 
//(use super keyword)
package newpackage;

public class Divisibility extends Addition {
	public void add() {	
		int sum =super.add(11,13);
		if (sum%10==0)
		{
			System.out.println(+sum+" "+"is divisible by 10");
		}
		else {
			System.out.println(+sum+" "+"is not divisible by 10");
		}
	}
	
	public static void main(String[] args) {
		Divisibility div = new Divisibility();
		div.add();
		 

	}

}
