package leetcode.ez;

import java.util.Arrays;

public class MinimumDifferenceBetweenHighestandLowestofKScores1984 {

    public static void main(String[] args) {
        /*Input: nums = [9,4,1,7], k = 2
        Output: 2*/
        System.out.println(minimumDifference(new int[]{90}, 1));
        System.out.println(minimumDifference(new int[]{9,4,1,7}, 2));
    }

    static int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (i >= k - 1)
                minDiff = Math.min(minDiff, nums[i] - nums[i - (k - 1)]);
        }
        return minDiff;
    }
}
