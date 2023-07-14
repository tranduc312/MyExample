package leetcode.ez;

import java.util.Arrays;

public class ShuffletheArray1470 {

    public static void main(String[] args) {
        /*Input: nums = [2,5,1,3,4,7], n = 3
        Output: [2,3,5,4,1,7]*/
        Arrays.stream(shuffle(new int[]{2, 5, 1, 3, 4, 7}, 3)).forEach(s -> System.out.print(s + " "));
        System.out.println();
        Arrays.stream(shuffle(new int[]{1, 2, 3, 4, 4, 3, 2, 1}, 4)).forEach(s -> System.out.print(s + " "));
        System.out.println();
        Arrays.stream(shuffle(new int[]{1, 1, 2, 2}, 2)).forEach(s -> System.out.print(s + " "));
    }

    static int[] shuffle(int[] nums, int n) {
        int[] rs = new int[nums.length];
        int x = 0;
        int y = n;
        for (int i = 0; i < nums.length - 1; i+=2) {
            rs[i] = nums[x++];
            rs[i + 1] = nums[y++];
        }

        return rs;
    }
}
