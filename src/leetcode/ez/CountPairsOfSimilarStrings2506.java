package leetcode.ez;

import java.util.HashSet;
import java.util.Set;

public class CountPairsOfSimilarStrings2506 {

    public static void main(String[] args) {
        System.out.println(similarPairs(new String[]{"aba","aabb","abcd","bac","aabc"}));
        System.out.println(similarPairs(new String[]{"aabb","ab","ba"}));
        System.out.println(similarPairs(new String[]{"nba","cba","dba"}));
    }

    static int similarPairs(String[] words) {
        int rs = 0;
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (equals(words[i], words[j]))
                    rs++;
            }
        }
        return rs;
    }

    private static boolean equals(String s, String t) {
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();
        for (char c : s.toCharArray()) set1.add(c);
        for (char c : t.toCharArray()) set2.add(c);

        return set1.equals(set2);
    }
}
