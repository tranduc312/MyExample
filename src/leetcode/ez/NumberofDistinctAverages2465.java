package leetcode.ez;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class NumberofDistinctAverages2465 {

    public static void main(String[] args) {
//        System.out.println(distinctAverages(new int[]{4,1,4,0,3,5}));
//        System.out.println(distinctAverages(new int[]{1,100}));
        System.out.println(distinctAverages(new int[]{9, 5, 7, 8, 7, 9, 8, 2, 0, 7}));
    }

    static int distinctAverages(int[] nums) {
        Set<Double> set = new HashSet<>();
        Arrays.sort(nums);
        int last = nums.length - 1;
        for (int i = 0; i < nums.length / 2; i++) {
            set.add( ((double) (nums[i] + nums[last--]) / 2));
        }
        return set.size();
    }
}
