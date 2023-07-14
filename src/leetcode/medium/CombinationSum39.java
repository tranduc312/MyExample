package leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum39 {

    public static void main(String[] args) {
        /*Example 1:

        Input: candidates = [2,3,6,7], target = 7
        Output: [[2,2,3],[7]]*/
        System.out.println(combinationSum(new int[]{2,3,6,7}, 7));

        /*Example 2:
        Input: candidates = [2,3,5], target = 8
        Output: [[2,2,2,2],[2,3,3],[3,5]]*/
        System.out.println(combinationSum(new int[]{2,3,5}, 8));
    }

    static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> rs = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(rs, new ArrayList<>(), candidates, target, 0);
        return rs;
    }

    private static void backtrack(List<List<Integer>> rs, List<Integer> list, int[] candidates, int target, int start) {
        if (target < 0) {
            return;
        } else if (target == 0) {
            rs.add(new ArrayList<>(list));
        } else {
            for (int i = start; i < candidates.length; i++) {
                list.add(candidates[i]);
                backtrack(rs, list, candidates, target - candidates[i], i);
                list.remove(list.size() - 1);
            }
        }
    }
}
