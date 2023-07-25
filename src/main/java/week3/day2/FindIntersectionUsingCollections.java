package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindIntersectionUsingCollections {

	public static void main(String[] args) {
		int[] array1 = {5,3,17,8,6,7};
		int[] array2 = {1,5,8,3,9,7};

		List<Integer> arrayList = new ArrayList<Integer>();

		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if (array1[i] == array2[j]) {
					arrayList.add(array1[i]);
				}
			}
		}
		Collections.sort(arrayList);
		System.out.println("Intersection of two arrays are: " + arrayList);

	}

}
