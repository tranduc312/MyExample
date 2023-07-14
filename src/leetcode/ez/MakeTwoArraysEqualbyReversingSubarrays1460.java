package leetcode.ez;

import java.util.Arrays;

public class MakeTwoArraysEqualbyReversingSubarrays1460 {

    public static void main(String[] args) {
        /*Input: target = [1,2,3,4], arr = [2,4,1,3]
        Output: true*/
        System.out.println(canBeEqual(new int[]{1, 2, 3, 4}, new int[]{2, 4, 1, 3}));
        System.out.println(canBeEqual(new int[]{7}, new int[]{7}));
        System.out.println(canBeEqual(new int[]{3, 7, 9}, new int[]{3, 7, 11}));
    }

    static boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        return Arrays.equals(target, arr);
    }
}
