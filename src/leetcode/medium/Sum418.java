package leetcode.medium;

import java.util.*;

public class Sum418 {

    public static void main(String[] args) {
//        System.out.println(fourSum(new int[]{1,0,-1,0,-2,2}, 0));
//        System.out.println(fourSum(new int[]{2,2,2,2,2}, 8));
        System.out.println(fourSum(new int[]{1000000000,1000000000,1000000000,1000000000}, -294967296));
    }

    static List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> sets = new HashSet<>();
        List<List<Integer>> rs = new ArrayList<>();
        int len = nums.length;
        if (len <= 4 && target <= 0) {
            for (int i : nums) target += i;
            if (target != 0) return rs;
        }
        Arrays.sort(nums);
        for (int i = 0; i < len - 3; i++) {
            for (int j = i + 1; j < len - 2; j++) {
                for (int k = j + 1, l = len - 1; k < l;) {
                    long sum = nums[i] + nums[j] + nums[k] + nums[l];
                    if (sum == target) sets.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                    if (sum > target) l--;
                    else k++;
                }
            }
        }
        for (List<Integer> list : sets) {
            rs.add(list);
        }
        return rs;
    }
}
