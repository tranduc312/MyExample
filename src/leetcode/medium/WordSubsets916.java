package leetcode.medium;

import java.util.*;

public class WordSubsets916 {

    public static void main(String[] args) {
//        System.out.println(wordSubsets(new String[]{"warrior","world"}
//                , new String[]{"w","r","r"}));
        System.out.println(wordSubsets2(new String[]{"amazon","apple","facebook","google","leetcode"}
                , new String[]{"e","o"}));
    }


    static List<String> wordSubsets2(String[] words1, String[] words2) {
        List<String> rs = new ArrayList<>();
        int[] bMax = new int[26];
        for (String s : words2) {
            int[] bCount = count(s);
            for (int i = 0; i < 26; i++) {
                bMax[i] = Math.max(bMax[i], bCount[i]);
            }
        }

        for (String s : words1) {
            boolean subset = true;
            int[] aCount = count(s);
            for (int i = 0; i < 26; i++) {
                if (aCount[i] < bMax[i]) {
                    subset = false;
                }
            }

            if (subset) {
                rs.add(s);
            }
        }
        return rs;
    }

    static List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> rs = new ArrayList<>();
        int[] bmax = new int[26];
        for (String s : words2) {
            int[] bCount = count(s);
            for (int i = 0; i < 26; i++) {
                bmax[i] = Math.max(bmax[i], bCount[i]);
            }
        }

        for (String s : words1) {
            boolean subset = true;
            int[] aCount = count(s);
            for (int i = 0; i < 26; i++) {
                if (aCount[i] < bmax[i]) {
                    subset = false;
                }
            }
            if (subset) {
                rs.add(s);
            }
        }
        return rs;
    }

    static int[] count(String s) {
        int[] rs = new int[26];
        for (char c : s.toCharArray()) {
            rs[c - 'a']++;
        }
        return rs;
    }
}
