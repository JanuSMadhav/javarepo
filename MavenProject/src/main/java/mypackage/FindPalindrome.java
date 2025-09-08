package mypackage;
public class FindPalindrome{
	public static void main(String args[]){
		String s1 = "Java";
		String s2 = "Malayalam";
			checkPalindrome(s1);
			checkPalindrome(s2);
	 }
	 
	 public static void checkPalindrome(String word){
		word =word.toLowerCase();
		int leftposition = 0;
		int rightposition = word.length()-1;
		boolean isPalindrome = true;
			while (leftposition<rightposition){
				if (word.charAt(leftposition)!= word.charAt(rightposition)){
					isPalindrome = false;
					break;
				}	
						leftposition++;
						rightposition--;
			}
					if (isPalindrome){
						System.out.println(word + " " + "is a Palindrome");
					}
					else{
						System.out.println(word + " " + "is not a Palindrome");
					}
	 }
}
