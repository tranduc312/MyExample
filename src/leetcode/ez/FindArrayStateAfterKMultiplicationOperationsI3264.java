package leetcode.ez;

import java.util.Arrays;

public class FindArrayStateAfterKMultiplicationOperationsI3264 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getFinalState(new int[]{2, 1, 3, 5, 6}, 5, 2)));
        System.out.println(Arrays.toString(getFinalState(new int[]{1,2}, 3, 4)));
    }

    static int[] getFinalState(int[] nums, int k, int mutiplier) {
        int currentMin = Integer.MAX_VALUE;
        int indexMin = 0;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < currentMin) {
                    currentMin = nums[j];
                    indexMin = j;
                }
            }
//            nums[indexMin] = nums[indexMin] * mutiplier;
            nums[indexMin] *= mutiplier;
            currentMin =  Integer.MAX_VALUE;
        }
        return nums;
    }
}
