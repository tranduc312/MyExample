package leetcode.ez;

import java.util.Arrays;

public class ConcatenationofArray1929 {

    public static void main(String[] args) {
//        Input: nums = [1,2,1]
//        Output: [1,2,1,1,2,1]
        Arrays.stream(getConcatenation(new int[]{1, 2, 1})).forEach(s -> System.out.print(s + " "));
        System.out.println();
    }

    static int[] getConcatenation(int[] nums) {
        int[] rs = new int[nums.length * 2];
        int mid = nums.length;
        for (int i = 0; i < nums.length; i++, mid++) {
            rs[i] = nums[i];
            rs[mid] = nums[i];
        }
        return rs;
    }
}
