package leetcode.ez;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringMatchinginanArray1408 {

    public static void main(String[] args) {
        System.out.println(stringMatching2(new String[]{"mass","as","hero","superhero"}));
        System.out.println(stringMatching2(new String[]{"leetcode","et","code"}));
        System.out.println(stringMatching2(new String[]{"blue","green","bu"}));

        System.out.println(stringMatching2(new String[]{"leetcoder","leetcode","od","hamlet","am"}));
    }


    static List<String> stringMatching2(String[] words) {
        Set<String> rs = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (!words[j].equals(words[i]) && words[j].indexOf(words[i]) != -1) {
                    rs.add(words[i]);
                }
            }
        }
        return new ArrayList<>(rs);
    }


    static List<String> stringMatching(String[] words) {
        List<String> rs = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            String t = findIndex(words, words[i]);
            if (t != null) rs.add(t);
        }

        return rs;
    }

    static String findIndex(String[] arr, String s) {
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].equals(s) && arr[i].indexOf(s) != -1) return s;
        }
        return null;
    }
}
