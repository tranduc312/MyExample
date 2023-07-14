package leetcode.ez;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindSubsequenceofLengthKWiththeLargestSum2099 {

    public static void main(String[] args) {
//        Arrays.stream(maxSubsequence(new int[]{2, 1, 3, 3}, 2)).forEach(s -> System.out.print(s + " "));
        System.out.println();
        Arrays.stream(maxSubsequence(new int[]{-1,-2,3,4}, 3)).forEach(s -> System.out.print(s + " "));
        System.out.println();
        Arrays.stream(maxSubsequence(new int[]{3,4,3,3}, 2)).forEach(s -> System.out.print(s + " "));
    }

    static int[] maxSubsequence(int[] nums, int k) {
        int len = nums.length;
        if (len == k) return nums;
        int[] rs = new int[k];
        List<Integer> list = new ArrayList<>();
        int[] clone = nums.clone();
        Arrays.sort(clone);
        for (int i = len - k; i < len; i++) {
            list.add(clone[i]);
        }
        int index = 0;
        for (int num : nums) {
            if (list.contains(num))
                rs[index++] = num;
        }
        return rs;
    }
}
