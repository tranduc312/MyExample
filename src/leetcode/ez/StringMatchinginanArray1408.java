package leetcode.ez;

import java.util.ArrayList;
import java.util.List;

public class StringMatchinginanArray1408 {

    public static void main(String[] args) {
        System.out.println(stringMatching(new String[]{"mass","as","hero","superhero"}));
        System.out.println(stringMatching(new String[]{"leetcode","et","code"}));
        System.out.println(stringMatching(new String[]{"blue","green","bu"}));
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
