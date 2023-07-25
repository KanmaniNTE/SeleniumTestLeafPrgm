package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		List<Integer> lt = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			lt.add(arr[i]); 
			// adding all the numbers in the Collections list
		}
		for (int j = 1; j <= lt.size(); j++) {

			if (lt.contains(j)== false) {
				//check the availability of the number in the list
				System.out.println("The missing number in the Array is: "+ j);
			}
		}

	}

}
