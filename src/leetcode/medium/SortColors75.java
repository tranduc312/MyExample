package leetcode.medium;

import java.util.Arrays;

public class SortColors75 {

    public static void main(String[] args) {
        sortColors(new int[]{2,0,2,1,1,0});
        sortColors(new int[]{2,0,1});
        Cloneable cloneable;
    }

    static void sortColors(int[] nums) {
        int n = nums.length;
        int countZero = 0;
        int countOne = 0;
        int countTwo = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) countZero++;
            if (nums[i] == 1) countOne++;
            if (nums[i] == 2) countTwo++;
        }
        for (int i = 0; i < n; i++) {
            if (i < countZero) nums[i] = 0;
            else if (i < countZero + countOne) nums[i] = 1;
            else nums[i] = 2;
        }
        System.out.println(Arrays.toString(nums));
    }
}

