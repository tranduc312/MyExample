package leetcode.ez;

import java.util.HashMap;
import java.util.Map;

public class RedistributeCharacterstoMakeAllStringsEqual1897 {

    public static void main(String[] args) {
        /*Input: words = ["abc","aabc","bc"]
        Output: true*/
        System.out.println(makeEqual(new String[]{"abc","aabc","bc"}));
        System.out.println(makeEqual(new String[]{"ab","a"}));
        System.out.println(makeEqual(new String[]{"a","b"}));
        System.out.println(makeEqual(new String[]{"b"}));
    }

    static boolean makeEqual(String[] words) {
        Map<Character, Integer> map = new HashMap<>();
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }
        for (Character ch : map.keySet()) {
            int value = map.get(ch);
            if (value % words.length != 0) {
                return false;
            }
        }
        return true;
    }
}
