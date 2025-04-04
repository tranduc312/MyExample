package leetcode.ez;

import java.util.Arrays;

public class CheckifOneStringSwapCanMakeStringsEqual1790 {

    public static void main(String[] args) {
        System.out.println(areAlmostEqual2("bank", "kanb"));
//        System.out.println(areAlmostEqual2("attack", "defend"));
//        System.out.println(areAlmostEqual2("kelb", "kelb"));
//        System.out.println(areAlmostEqual2("aa", "ac"));
//        System.out.println(areAlmostEqual2("caa", "aaz"));
//        System.out.println(areAlmostEqual2("lxt", "ltx"));

    }

    static boolean areAlmostEqual2(String s1, String s2) {
        if (s1.equals(s2)) return true;
        int n = s1.length();
        int countDiff = 0;
        int i = 0;
        int j = 0;
        for (int k = 0; k < n; ++k) {
            if (s1.charAt(k) != s2.charAt(k)) {
                ++countDiff;
                if (countDiff > 2) {
                    return false;
                } else if (countDiff == 1) {
                    i = k;
                } else {
                    j = k;
                }
            }
        }

        return (s1.charAt(i) == s2.charAt(j) && s1.charAt(j) == s2.charAt(i));
    }

    static boolean areAlmostEqual(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        if (s1.equals(s2)) return true;
        int countDiff = 0;
        int[] array1 = new int[26];
        int[] array2 = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (++countDiff > 2) return false;
                array1[s1.charAt(i) - 'a']++;
                array2[s2.charAt(i) - 'a']++;
            }
        }
        return Arrays.equals(array1, array2);
    }
}
