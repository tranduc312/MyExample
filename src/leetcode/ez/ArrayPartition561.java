package leetcode.ez;

import java.util.Arrays;

public class ArrayPartition561 {

    public static void main(String[] args) {
        System.out.println(arrayPairSum(new int[]{1,4,3,2}));
        System.out.println(arrayPairSum(new int[]{6,2,6,5,1,2}));
    }

    static int arrayPairSum(int[] nums) {
        //sort
        Arrays.sort(nums);
        int rs = 0;
        for (int i = 0; i < nums.length; ++i) {
            rs += Math.min(nums[i], nums[++i]);
        }
        return rs;
    }
}
