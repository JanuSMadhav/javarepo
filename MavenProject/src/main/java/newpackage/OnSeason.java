//Program to calculate discount during OnSeason and OffSeason
package newpackage;

public class OnSeason {
	public void discount() {
		int amount = 25000;
		int offer = (40*amount)/100;
		System.out.println("Total Shopping Bill: Rs:"+amount);
		System.out.println("OnSeason discount: Rs:"+offer);
		int total = amount-offer;
		System.out.println("Total Shopping Bill amount after discount in OnSeason: Rs:"+total);		
	}
}
