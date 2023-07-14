package leetcode.ez;

import java.util.ArrayList;
import java.util.List;

public class RemoveOneElementtoMaketheArrayStrictlyIncreasing1909 {

    public static void main(String[] args) {
        /*Input: nums = [1,2,10,5,7]
        Output: true*/
        System.out.println(canBeIncreasing(new int[]{1,2,10,5,7}));
        System.out.println(canBeIncreasing(new int[]{2,3,1,2}));
        System.out.println(canBeIncreasing(new int[]{1,1,1}));
    }

    static boolean canBeIncreasing(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            boolean flag = true;
            int[] array = remove(nums, i);
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] >= array[j + 1]) {
                    flag = false;
                }
            }
            if (flag) return true;
        }
        return false;
    }

    static int[] remove(int[] array, int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (i == n) continue;
            list.add(array[i]);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
