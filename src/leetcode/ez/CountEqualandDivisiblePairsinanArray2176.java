package leetcode.ez;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountEqualandDivisiblePairsinanArray2176 {

    public static void main(String[] args) {
        System.out.println(countPairs(new int[]{3, 1, 2, 2, 2, 1, 3}, 2));
//        System.out.println(countPairs(new int[]{1,2,3,4}, 1));
    }

    static int countPairs(int[] nums, int k) {
        Map<Integer, List<Integer>> indices = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            indices.computeIfAbsent(nums[i], l -> new ArrayList<>()).add(i);
        }
        int cnt = 0;
        for (List<Integer> ind : indices.values()) {
            for (int i = 0; i < ind.size(); ++i) {
                for (int j = 0; j < i; ++j) {
                    if (ind.get(i) * ind.get(j) % k == 0) {
                        ++cnt;
                    }
                }
            }
        }
        return cnt;
    }
}
