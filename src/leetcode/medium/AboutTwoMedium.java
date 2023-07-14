package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class AboutTwoMedium {

    public static void main(String[] args) {
        System.out.println(cau1(new int[]{1, 1, 1}, 2));
        System.out.println(cau1(new int[]{1,2,3,0,3}, 3));
        System.out.println(cau1(new int[]{4,2,9,7,19}, 5));
    }

    /**
     * Given an array of integers and an integer k, you need to find the total number of continuous subarrays that sum equals to k.
     * [1,1,1] et k=2 -> output = 2
     * [1,2,3,0,3] et k=3 -> output = 5
     * 1,2; 3; 3,0; 0,3; 3
     * [4,2,9,7,19] et k=5 -> output = 0
     * @param array
     * @return
     */
    static int cau1(int[] array, int k) {
        int rs = 0;
        for (int i = 0; i < array.length; i++) {
            int current = array[i];
            if (current > k) continue;
            else {
                if (current == k) {
                    rs++;
                }
                for (int j = i + 1; j < array.length; j++) {
                    current += array[j];
                    if (current == k) {
                        rs++;
                    }
                    if (current > k) {
                        break;
                    }
                }
            }
        }
        return rs;
    }

    /**
     * You are given an array of integers as input (you can assume the array is well formed and won’t contain an element that is not an integer).
     * Write a method that takes this array and finds the subarray whose sum of elements is greater than the sum of elements for any other possible subarray.
     *
     * For example, let’s say our input is this array: [1, 3, -2, -4, 5, 6, 1, -3, -2, 1, 0]. A subarray must consist of contiguous elements.
     * This means [1, 3, -2] is a valid subarray but [1, -2, 5] is not because it skips over the 3 and -4.
     * For this sample input, your method would return [5, 6, 1] because the sum of the elements for this subarray, 12,
     * is larger than the sum of elements for any other subarray.
     */
    static int[] cau2(int[] array) {
        List<Integer> list = new ArrayList<>();
        int len = array.length;
        for (int i = 0; i < array.length - 1; i++) {
            int current = array[i];
            for (int j = i + 1; j < array.length; j++) {

            }
        }
        return new int[0];
    }

    /**
     * Show Countdown from 300 seconds in hh : mm : ss format
     * Eg: 300 seconds = 5 minutes - 00:05:00, 00:04:59, 00:04:58.... countdown to 00:00:00.
     * You should create a component which gets the seconds as props and show the countdown timer.
     * If the time reaches to 00:00:00, timer should stop.
     */
    static void cau3() {

    }
}
