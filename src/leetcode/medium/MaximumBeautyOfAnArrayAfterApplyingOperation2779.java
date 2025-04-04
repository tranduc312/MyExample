package leetcode.medium;

public class MaximumBeautyOfAnArrayAfterApplyingOperation2779 {

    public static void main(String[] args) {
//        System.out.println(maximumBeauty2(new int[]{4, 6, 1, 2}, 2));
        System.out.println(maximumBeauty(new int[]{1, 1, 1, 1}, 10));
    }

    /**
     * Example 1:
     *
     * Input: nums = [4,6,1,2], k = 2
     * Output: 3
     * Explanation: In this example, we apply the following operations:
     * - Choose index 1, replace it with 4 (from range [4,8]), nums = [4,4,1,2].
     * - Choose index 3, replace it with 4 (from range [0,4]), nums = [4,4,1,4].
     * After the applied operations, the beauty of the array nums is 3 (subsequence consisting of indices 0, 1, and 3).
     * It can be proven that 3 is the maximum possible length we can achieve.
     * Example 2:
     *
     * Input: nums = [1,1,1,1], k = 10
     * Output: 4
     * Explanation: In this example we don't have to apply any operations.
     * The beauty of the array nums is 4 (whole array).
     *
     * @param nums
     * @param k
     * @return
     */
    static int maximumBeauty(int[] nums, int k) {
        // edge case
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) break;
            if (i == nums.length - 2) return nums.length;
        }


        return 0;
    }

    static int maximumBeauty2(int[] nums, int k) {
        if (nums.length == 1) return 1;

        int maxBeauty = 0;
        int maxValue = 0;

        for (int num : nums) {
            maxValue = Math.max(maxValue, num);
        }

        int[] count = new int[maxValue + 1];

        for (int num : nums) {
            count[Math.max(num - k, 0)]++;
            count[Math.min(num + k + 1, maxValue)]--;
        }

        int currentSum = 0;
        for (int i : count) {
            currentSum += i;
            maxBeauty = Math.max(maxBeauty, currentSum);
        }

        return maxBeauty;
    }
}
