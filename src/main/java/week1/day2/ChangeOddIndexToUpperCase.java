package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 Pseudo Code
		 * Declare String Input as Follow
		 * String test = "changeme";
		 * a) Convert the String to character array
		 * b) Traverse through each character (using loop)
		 * c)find the odd index within the loop (use mod operator)
		 * d)within the loop, change the character to uppercase, if the index is odd else don't change
		 */
 String text = "Testleaf";
 char[] text1 = text.toCharArray();
 int l = text1.length;
 for (int i = 0; i < l; i++) {
	 if(i%2 !=0) {
		 char ch = Character.toUpperCase(text1[i]);
		 System.out.println(ch);
	 }
	
}	}

}
