package leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class TupleWithSameProduct1726 {

    public static void main(String[] args) {
        System.out.println(tupleSameProduct(new int[]{2,3,4,6}));
        System.out.println(tupleSameProduct(new int[]{1,2,4,5,10}));
    }

    static int tupleSameProduct(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                map.put(nums[i] * nums[j], map.getOrDefault(nums[i] * nums[j], 0) + 1);
            }
        }
        int ans = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int value = entry.getValue();
            if (value < 2) continue;
            ans += (value * (value - 1)) * 4;
        }
        return ans;
    }
}
