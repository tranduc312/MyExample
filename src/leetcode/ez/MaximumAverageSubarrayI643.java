package leetcode.ez;

import java.util.stream.IntStream;


public class MaximumAverageSubarrayI643
{

	public static void main(String[] args)
	{
//		System.out.println(findMaxAverage(new int[]{1,12,-5,-6,50,3}, 4));
//		1,13,8,2,52,55
//		System.out.println(findMaxAverage(new int[]{5}, 1));
//		System.out.println(findMaxAverage(new int[]{4,0,4,3,3}, 5));
		System.out.println(findMaxAverage(new int[]{7,4,5,8,8,3,9,8,7,6}, 7));
//		7, 11, 16, 24, 32, 35, 44, 52, 59, 65
	}


	static double findMaxAverage1(int[] nums, int k) {
		int[] sum = new int[nums.length];
		sum[0] = nums[0];
		for (int i = 1; i < nums.length; i++)
			sum[i] = sum[i - 1] + nums[i];
		double res = sum[k - 1] * 1.0 / k;
		for (int i = k; i < nums.length; i++) {
			res = Math.max(res, (sum[i] - sum[i - k]) * 1.0 / k);
		}
		return res;
	}

	static double findMaxAverage(int[] nums, int k) {
		if (nums.length == 0) return 0;

		if (nums.length <= k) {
			return IntStream.of(nums).sum() * 1.0 / k;
		}
		int[] sum = new int[nums.length];

		sum[0] = nums[0];
		for (int i = 1; i < nums.length; ++i) {
			sum[i] = sum[i - 1] + nums[i];
		}
		double rs = sum[k - 1] * 1.0 / 4;
		for (int i = k; i < nums.length; ++i) {
			rs = Math.max(rs, (sum[i] - sum[i-k]) * 1.0 / k);
		}
		return rs;
	}

}
