//Program to calculate discount during OnSeason and OffSeason
package newpackage;

public class OffSeason {
		public void discount() {
			int amount = 25000;
			int offer = (15*amount)/100;
			System.out.println("Total Shopping Bill: Rs:"+amount);
			System.out.println("OffSeason discount: Rs:"+offer);
			int total = amount-offer;
			System.out.println("Total Shopping Bill amount after discount in OffSeason: Rs:"+total);
			}
		
		public static void main(String[] args) {
			OnSeason on = new OnSeason();
			on.discount();
			OffSeason off = new OffSeason();
			off.discount();
		}


}
