package week1.day2;

import java.util.Arrays;

public class FindMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {22,3981,-19,82,0,45,37};
		Arrays.sort(nums);
System.out.println("The Maximum Value in the Array is " + nums[nums.length-1]);
System.out.println("The Minimum Value in the Array is " + nums[0]);
	}

}
