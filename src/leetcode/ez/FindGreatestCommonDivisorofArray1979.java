package leetcode.ez;

import java.util.Arrays;

public class FindGreatestCommonDivisorofArray1979 {

    public static void main(String[] args) {
        /*Input: nums = [2,5,6,9,10]
        Output: 2
        Explanation:
        The smallest number in nums is 2.
        The largest number in nums is 10.
        The greatest common divisor of 2 and 10 is 2.*/
        System.out.println(findGCDBetter(new int[]{2,5,6,9,10}));
        System.out.println(findGCDBetter(new int[]{7,5,6,8,3}));
        System.out.println(findGCDBetter(new int[]{3,3}));
    }

    static int findGCDBetter(int[] nums) {
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        for (int i : nums) {
            if (i < smallest) smallest = i;
            if (i > largest) largest = i;
        }
        for (int i = smallest; i >= 1; i--) {
            if (largest % i == 0 && smallest % i == 0)
                return i;
        }
        return -1;
    }

    static int findGCD(int[] nums) {
        Arrays.sort(nums);
        int smallest = nums[0];
        int largest = nums[nums.length - 1];
        for (int i = smallest; i >= 1; i--) {
            if (largest % i == 0 && smallest % i == 0)
                return i;
        }
        return -1;
    }
}
