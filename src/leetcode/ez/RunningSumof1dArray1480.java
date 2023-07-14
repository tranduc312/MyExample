package leetcode.ez;

import java.util.Arrays;

public class RunningSumof1dArray1480 {

    public static void main(String[] args) {
        /*Input: nums = [1,2,3,4]
        Output: [1,3,6,10]*/
        Arrays.stream(runningSumBetter(new int[]{1, 2, 3, 4})).forEach(s ->System.out.print(s + " "));
        System.out.println();
    }

    static int[] runningSumBetter(int[] nums) {
        int i = 1;
        while (i < nums.length) {
            nums[i] += nums[i - 1];
            i++;
        }
        return nums;
    }

    static int[] runningSum(int[] nums) {
        int[] rs = new int[nums.length];
        rs[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            rs[i] = sum(nums, i);
        }
        return rs;
    }

    static int sum(int[] array, int index) {
        int rs = 0;
        for (int i = index; i >= 0; i--) {
            rs += array[i];
        }
        return rs;
    }
}
