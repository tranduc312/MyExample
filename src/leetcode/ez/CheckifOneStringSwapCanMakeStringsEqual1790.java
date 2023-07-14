package leetcode.ez;

import java.util.Arrays;

public class CheckifOneStringSwapCanMakeStringsEqual1790 {

    public static void main(String[] args) {
        System.out.println(areAlmostEqual("bank", "kanb"));
        System.out.println(areAlmostEqual("attack", "defend"));
        System.out.println(areAlmostEqual("kelb", "kelb"));

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
