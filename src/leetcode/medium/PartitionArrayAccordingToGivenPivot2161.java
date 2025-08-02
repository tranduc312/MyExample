package leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PartitionArrayAccordingToGivenPivot2161 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(pivotArray2(new int[]{9,12,5,10,14,3,10}, 10)));
        System.out.println(Arrays.toString(pivotArray2(new int[]{-3,4,3,2}, 2)));
    }
    static int[] pivotArray2(int[] nums, int pivot) {
        int n = nums.length;
        int[] rs = new int[n];
        int[] less = new int[n];
        int[] high = new int[n];

        int countEqualPivot = 0;
        int countLess = 0;
        int countHigh = 0;

        for (int i = 0; i < n; ++i) {
            if (nums[i] < pivot) {
                less[countLess++] = nums[i];
            } else if (nums[i] == pivot) {
                ++countEqualPivot;
            } else {
                high[countHigh++] = nums[i];
            }
        }

        int idx = 0;
        for (int i = 0; i < countLess; ++i) {
            rs[idx++] = less[i];
        }
        for (int i = 0; i < countEqualPivot; ++i) {
            rs[idx++] = pivot;
        }
        for (int i = 0; i < countHigh; ++i) {
            rs[idx++] = high[i];
        }

        return rs;
    }

    static int[] pivotArray(int[] nums, int pivot) {
        List<Integer> greaterPivot = new ArrayList<>();
        int countEqual = 0;
        int n = nums.length;
        int[] rs = new int[n];
        int i = 0;
        for (int num : nums) {
            if (num > pivot) {
                greaterPivot.add(num);
            } else if (num == pivot) {
                ++countEqual;
            } else {
                rs[i++] = num;
            }
        }
        while (countEqual-- > 0) {
            rs[i++] = pivot;
        }
        for (int integer : greaterPivot) {
            rs[i++] = integer;
        }

        return rs;
    }
}
