package week1.day2;

import java.util.Arrays;

public class FindDups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {10,15,25,30,62,15,85,45,78,96,24,15,63,74};
		int dup=0;
		Arrays.sort(num);
		for (int i = 0; i < num.length-1; i++) {
			for (int j = i+1; j < num.length; j++) {
				if(num[i]==num[j]) {
					System.out.println("The Duplicate Value is: "+num[j]);
				}
			}


		}

	}
}
