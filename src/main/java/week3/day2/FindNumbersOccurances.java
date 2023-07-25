package week3.day2;

import java.util.LinkedHashMap;

public class FindNumbersOccurances {

	public static void main(String[] args) {
		int[] numbers = {2,3,5,6,3,2,1,4,2,1,6,-1};
		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();

		for (int i = 0; i < numbers.length; i++) {
			if (map.containsKey(numbers[i])) {
				map.put(numbers[i], map.get(numbers[i])+1); // update entry to map

			}else {
				map.put(numbers[i],1); // new entry to map
			}
		}
		System.out.println(map);

	}

}
