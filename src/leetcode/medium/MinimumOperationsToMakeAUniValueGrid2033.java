package leetcode.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinimumOperationsToMakeAUniValueGrid2033 {

    public static void main(String[] args) {
//        System.out.println(minOperations(new int[][]{{2,4},{6,8}}, 2));
//        System.out.println(minOperations(new int[][]{{1,5},{2,3}}, 1));
        System.out.println(minOperations(new int[][]{{1,2},{3,4}}, 2));
    }

    static int minOperations(int[][] grid, int x) {
        int ans = 0;
        List<Integer> nums = new ArrayList<>();
        for (int[] ints : grid) {
            for (int anInt : ints) {
                nums.add(anInt);
            }
        }
        Collections.sort(nums);
        int n = nums.size();
        int finalCommonNum = nums.get(n / 2);

        for (Integer num : nums) {
            if (num % x != finalCommonNum % x) {
                return -1;
            }
            ans += Math.abs(finalCommonNum - num) / x;
       }
        return ans;
    }
}
