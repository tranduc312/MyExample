package leetcode.ez;

public class MaximumProductDifferenceBetweenTwoPairs1913 {

    public static void main(String[] args) {
//        Input: nums = [5,6,2,7,4]
//        Output: 34
        System.out.println(maxProductDifference(new int[]{5,6,2,7,4}));
        System.out.println(maxProductDifference(new int[]{4,2,5,9,7,4,8}));
    }

    static int maxProductDifference(int[] nums) {
        int maxFirst = Integer.MIN_VALUE + 1;
        int maxSecond = Integer.MIN_VALUE;
        int minFirst = Integer.MAX_VALUE;
        int minSecond = Integer.MAX_VALUE - 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > maxFirst) {
                maxSecond = maxFirst;
                maxFirst = nums[i];
            } else if (nums[i] > maxSecond) {
                maxSecond = nums[i];
            }

            if (nums[i] < minFirst) {
                minSecond = minFirst;
                minFirst = nums[i];
            } else if (nums[i] < minSecond) {
                minSecond = nums[i];
            }
        }

        return maxFirst * maxSecond - minFirst * minSecond;
    }
}
