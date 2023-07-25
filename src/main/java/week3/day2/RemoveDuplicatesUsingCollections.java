package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesUsingCollections {

	public static void main(String[] args) {
		String text = "We learnig java basics and java with seleniu using java language";
		String[] str = text.split(" ");
		Set<String> uniquestring = new LinkedHashSet<String>();
		for (int i = 0; i < str.length; i++) {
			uniquestring.add(str[i]); 
			//only unique string be added
		}
		String str1 = String.join(" ", uniquestring);
		//joins the string with the given delimiter
		System.out.println(str1);

	}

}
