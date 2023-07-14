package leetcode.ez;

import java.util.*;

public class PositionsLargeGroups830 {
    public static void main(String[] args) {
//        System.out.println(largeGroupPositions("abbxxxxzzy"));
//        System.out.println(largeGroupPositions("abc"));
        System.out.println(largeGroupPositions("abcdddeeeeaabbbcd"));
    }

    static List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> rs = new ArrayList<>();
        for (int i = 0, j = 0; i < s.length(); i = j) {
            while (j < s.length() && s.charAt(i) == s.charAt(j))
                ++j;
            if (j - i >= 3)
                rs.add(Arrays.asList(i, j - 1));

        }
        return rs;
    }
}
