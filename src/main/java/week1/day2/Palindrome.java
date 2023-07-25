package week1.day2;

import java.util.Iterator;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Build a logic to find the given string is palindrome or not

		/*
		 * Pseudo Code
		 * a) Declare A String value as"madam"
		 * b) Declare another String rev value as ""
		 * c) Iterate over the String in reverse order
		 * d) Add the char into rev
		 * e) Compare the original String with the reversed String, if it is same then print palinDrome 		 
		 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		 */
		String str = "malayalam";
		String rev = "";
		int l= str.length();
		for (int i = l-1; i >=0; i--) {
			rev = rev + str.charAt(i);
		}
			if(str.equalsIgnoreCase(rev)== true) {
				System.out.println("Given String is Palindrome");
			}
			else {
				System.out.println("Given String is not Palindrome");
			}
		}
	}



