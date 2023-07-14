package leetcode.lg;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum1 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int numberToFind = target - nums[i];
            if (numMap.containsKey(numberToFind)) {
                return new int[]{numMap.get(numberToFind), i};
            } else {
                numMap.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}
