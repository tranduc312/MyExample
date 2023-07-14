package leetcode.medium;

import java.util.*;

public class CombinationSumII40 {

    public static void main(String[] args) {
        System.out.println(combinationSum2(new int[]{10,1,2,7,6,1,5}, 8));
        System.out.println(combinationSum2(new int[]{2,5,2,1,2}, 5));
    }

    static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> rs = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(candidates);
        backtrack(set, new ArrayList<>(), candidates, target, 0);
        set.stream().forEach(s -> rs.add(s));
        return rs;
    }

    private static void backtrack(Set<List<Integer>> rs, ArrayList<Integer> list, int[] candidates, int target, int start) {
        if (target < 0) return;
        else if (target == 0) {
            rs.add(new ArrayList<>(list));
        } else {
            for (int i = start; i < candidates.length; i++) {
                list.add(candidates[i]);
                backtrack(rs, list,candidates, target - candidates[i], i + 1);
                list.remove(list.size() - 1);
            }
        }
    }
}
