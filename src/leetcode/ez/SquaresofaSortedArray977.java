package leetcode.ez;

import java.util.Arrays;

public class SquaresofaSortedArray977 {

    public static void main(String[] args) {
//        [-4,-1,0,3,10]
        sortedSquares(new int[]{-4,-1,0,3,10});
//        System.out.println(-4 * -4);
    }

    static int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
                nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}
