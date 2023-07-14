package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class Combinations77 {

    public static void main(String[] args) {
        System.out.println(combine(4,2));
        System.out.println(combine(1,1));
    }

    static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> rs = new ArrayList<>();
        backtrack(rs, new ArrayList<>(), 1, n, k);
        return rs;
    }

    private static void backtrack(List<List<Integer>> rs, List<Integer> list, int start, int n, int k) {
        if (k == 0) {
            rs.add(new ArrayList<>(list));
            return;
        }
        for (int i = start; i <= n; i++) {
            list.add(i);
            backtrack(rs, list, i + 1, n, k - 1);
            list.remove(list.size() - 1);
        }
    }
}
