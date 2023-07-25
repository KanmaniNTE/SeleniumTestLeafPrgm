package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String companyName ="google";
		System.out.println(companyName);
		char[] ch=companyName.toCharArray();
		Set<Character> unique =new LinkedHashSet<Character>();
		for (int i = 0; i < ch.length; i++) {
			unique.add(ch[i]);
		}

		System.out.println(unique);
	}

}


