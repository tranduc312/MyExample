package leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsII47 {

    public static void main(String[] args) {
        System.out.println(permuteUnique(new int[]{1,1,2}));
        System.out.println(permuteUnique(new int[]{1,2,3}));
    }

    static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> rs = new ArrayList<>();
        Arrays.sort(nums);
        dfs(rs, new ArrayList<>(), new boolean[nums.length], nums);
        return rs;
    }

    private static void dfs(List<List<Integer>> rs, ArrayList<Integer> list, boolean[] used, int[] nums) {
        if (list.size() == used.length) {
                rs.add(new ArrayList<>(list));
                return;
        }

        for (int i = 0; i < used.length; i++) {
            if (used[i]) continue;
            if (i > 0 && !used[i -1] && nums[i] == nums[i - 1]) continue;
            list.add(nums[i]);
            used[i] = true;
            dfs(rs, list, used, nums);
            list.remove(list.size() - 1);
            used[i] = false;
        }
    }
}
