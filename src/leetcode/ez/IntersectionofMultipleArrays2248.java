package leetcode.ez;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntersectionofMultipleArrays2248 {

    public static void main(String[] args) {
        System.out.println(intersection(new int[][]{{3,1,2,4,5},{1,2,3,4},{3,4,5,6}}));
    }

    static List<Integer> intersection(int[][] nums) {
        // version 1
        // List<Integer> rs = new ArrayList<>();
        // Map<Integer, Integer> map = new HashMap<>();
        // for (int[] num : nums) {
        //     for (int i : num) {
        //         map.put(i, map.getOrDefault(i, 0) + 1);
        //     }
        // }
        // for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        //     if (entry.getValue() == nums.length)
        //         rs.add(entry.getKey());
        // }
        // Collections.sort(rs);
        // return rs;

        // version 2
        List<Integer> rs = new ArrayList<>();
        int[] array = new int[1001];
        for (int[] num : nums) {
            for (int i : num) {
                array[i]++;
            }
        }
        for (int i = 0; i < 1001; i++) {
            if (array[i] == nums.length)
                rs.add(array[i]);
        }
        Collections.sort(rs);
        return rs;
    }
}
