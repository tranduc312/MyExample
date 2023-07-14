package leetcode.ez;

import java.util.ArrayList;
import java.util.List;

public class Sum315 {

    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1,0,1,2,-1,-4}));
//        System.out.println(threeSum(new int[]{0,1,1}));
//        System.out.println(threeSum(new int[]{0,0,0}));
    }

    static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List list = new ArrayList<>();
                        int max = Math.max(nums[i], Math.max(nums[j], nums[k]));
                        int min = Math.min(nums[i], Math.min(nums[j], nums[k]));
                        int mid = 0 - max - min;
                        list.add(max);
                        list.add(mid);
                        list.add(min);
                        if (lists.contains(list)) {
                            continue;
                        }
                        lists.add(list);
                    }
                }
            }
        }
        return lists;
    }
}
