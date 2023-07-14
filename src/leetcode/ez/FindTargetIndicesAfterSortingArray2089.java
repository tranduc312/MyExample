package leetcode.ez;

import java.util.ArrayList;
import java.util.List;

public class FindTargetIndicesAfterSortingArray2089 {

    public static void main(String[] args) {
        System.out.println(targetIndices(new int[]{1,2,5,2,3},2));
        System.out.println(targetIndices(new int[]{1,2,5,2,3},3));
        System.out.println(targetIndices(new int[]{1,2,5,2,3},5));
    }

    static List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> rs = new ArrayList<>();
        int targetCount = 0;
        int lessTargetCount = 0;
        for (int num : nums) {
            if (num == target)
                targetCount++;
            if (num < target)
                lessTargetCount++;
        }
        for (int i = 0; i < targetCount; i++) {
            rs.add(lessTargetCount++);
        }
        return rs;
    }
}
