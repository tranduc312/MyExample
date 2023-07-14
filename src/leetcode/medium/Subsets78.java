package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class Subsets78 {

    public static void main(String[] args) {
        System.out.println(subsets(new int[]{1,2,3}));
        System.out.println(subsets(new int[]{0}));
    }

    static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> rs = new ArrayList<>();
        rs.add(new ArrayList<>());;
        for (int num : nums) {
            List<List<Integer>> newSubsets = new ArrayList<>();
            for (List<Integer> cur : rs) {
                newSubsets.add(new ArrayList<>(cur){{add(num);}});
            }
            for (List<Integer> newSubset : newSubsets) {
                rs.add(newSubset);
            }
        }
        return rs;
    }
}
