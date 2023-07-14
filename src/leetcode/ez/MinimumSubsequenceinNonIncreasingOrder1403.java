package leetcode.ez;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumSubsequenceinNonIncreasingOrder1403 {

    public static void main(String[] args) {
        /*Input: nums = [4,3,10,9,8]
                        3 4 8 9 10
        Output: [10,9]*/
        System.out.println(minSubsequence(new int[]{4, 3, 10, 9, 8}));
        System.out.println(minSubsequence(new int[]{4, 4, 7, 6, 7}));
    }

    static List<Integer> minSubsequence(int[] nums) {
        List<Integer> rs = new ArrayList<>();
        Arrays.sort(nums);
        int sum = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            sum += nums[i];
            rs.add(nums[i]);
            int sumTemp = sumTemp(nums, i);
            if (sum > sumTemp) return rs;
        }

        return rs;
    }

    static int sumTemp(int[] arr, int index) {
        int rs = 0;
        for (int i = 0; i < index; i++) {
            rs += arr[i];
        }
        return rs;
    }
}
