package week3.day2;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		Arrays.sort(arr);
		Set<Integer> number = new LinkedHashSet<Integer>();
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i] == arr[i+1]) {
				number.add(arr[i]); // add the duplicate numbers to the Set
			}
		}
	System.out.println(number);

	}

}
