package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class Permutations46 {

    public static void main(String[] args) {
        System.out.println(permute(new int[]{1,2,3}));
//        System.out.println(permute(new int[]{0,1}));
//        System.out.println(permute(new int[]{1}));
    }

    static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> rs = new ArrayList<>();
        dfs(new ArrayList<>(), new boolean[nums.length], rs, nums);
        return rs;
    }

    private static void dfs(ArrayList<Integer> list, boolean[] used, List<List<Integer>> rs, int[] nums) {
        if (list.size() == used.length) {
            rs.add(new ArrayList<>(list));
            return;
        }

        for (int i = 0; i < used.length; i++) {
            if (used[i]) continue;
            list.add(nums[i]);
            used[i] = true;
            dfs(list, used, rs, nums);
            list.remove(list.size() - 1);
            used[i] = false;
        }
    }
}
