package leetcode.ez;

import java.util.Arrays;


public class MaximumProductThreeNumbers628
{
	public static void main(String[] args)
	{
		System.out.println(maximumProduct(new int[]{-100,-98,-1,2,3,4}));
	}

	static int maximumProduct(int[] nums)
	{
		Arrays.sort(nums);

		return Math.max(nums[0] * nums[1] * nums[nums.length - 1],
				nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3]);
	}
}
