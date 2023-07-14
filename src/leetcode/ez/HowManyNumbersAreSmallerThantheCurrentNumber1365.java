package leetcode.ez;

import java.util.Arrays;

public class HowManyNumbersAreSmallerThantheCurrentNumber1365 {

    public static void main(String[] args) {
        /*Input: nums = [8,1,2,2,3]
        Output: [4,0,1,1,3]*/
        System.out.println(smallerNumbersThanCurrent(new int[]{8, 1, 2, 2, 3}));
        /*Input: nums = [6,5,4,8]
        Output: [2,1,0,3]*/
        System.out.println(smallerNumbersThanCurrent(new int[]{6,5,4,8}));
        /*Input: nums = [7,7,7,7]
        Output: [0,0,0,0]*/
        System.out.println(smallerNumbersThanCurrent(new int[]{7,7,7,7}));
    }

    static int[] smallerNumbersThanCurrent(int[] nums) {
        int len = nums.length;
        int[] rs = new int[len];
        int[] arrayTemp = nums.clone();
        int[][] arrayMap = new int[len][2];
        Arrays.sort(arrayTemp);
        for (int i = 0; i < len; i++) {
            arrayMap[i][0] = nums[i];
            arrayMap[i][1] = findNumberMax(nums[i], arrayTemp);
        }
        for (int i = 0; i < len; i++) {
            rs[i] = arrayMap[i][1];
        }
        return rs;
    }

    static int findNumberMax(int n, int[] array) {
        int rs = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) return i;
        }
        return rs;
    }
}
