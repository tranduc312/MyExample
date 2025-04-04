package leetcode.medium;

public class NumberOfSubArraysWithOddSum1524 {

    public static void main(String[] args) {
        System.out.println(numOfSubArrays(new int[]{1, 3, 5}));
//        System.out.println(numOfSubArrays(new int[]{2, 4, 6}));
//        System.out.println(numOfSubArrays(new int[]{1, 2, 3, 4, 5, 6, 7}));
    }

    static int numOfSubArrays(int[] arr) {
        double mod = 1e9 + 7;
        int sum = 0;
        int ans = 0;
        int odd = 0;
        int even = 1;
        for (int i : arr) {
            sum += i;
            if (sum % 2 == 0) {
                ans = (int) ((ans + odd) % mod);
                ++even;
            } else {
                ans = (int) ((ans + even) % mod);
                ++odd;
            }
        }
        return ans;
    }
}
