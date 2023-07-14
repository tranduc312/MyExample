package leetcode.ez;

import java.util.Arrays;

public class LongestSubsequenceWithLimitedSum2389 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(answerQueries(new int[]{624082}, new int[]{972985,564269,607119,693641,787608,46517,500857,140097})));
    }

    static int[] answerQueries(int[] nums, int[] queries) {
        int[] rs = new int[queries.length];
        Arrays.sort(nums);
        int sumTemp = 0;
        for (int i = 0; i < rs.length; i++) {
            int value = 0;
            for (int num : nums) {
                sumTemp += num;
                if (sumTemp > queries[i]) {
                    sumTemp = 0;
                    break;
                }
                value++;
            }
            rs[i] = value;
        }
        return rs;
    }
}
