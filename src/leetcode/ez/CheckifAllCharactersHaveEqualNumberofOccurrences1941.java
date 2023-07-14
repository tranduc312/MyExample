package leetcode.ez;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CheckifAllCharactersHaveEqualNumberofOccurrences1941 {

    public static void main(String[] args) {
        System.out.println(areOccurrencesEqualBetter("abacbc"));
        System.out.println(areOccurrencesEqualBetter("aaabb"));
        System.out.println(areOccurrencesEqual("abcdefghijklmnopqrstuvwxyzz"));
    }

    static boolean areOccurrencesEqualBetter(String s) {
        int[] array = new int[26];
        for (char c : s.toCharArray()) {
            array[c - 'a']++;
        }
        int value = array[s.charAt(0) - 'a'];
        for (int i : array) {
            if (i != 0 && i != value) {
                return false;
            }
        }
        return true;
    }

    static boolean areOccurrencesEqual(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        Set<Integer> set = new HashSet<>(map.values());
        return set.size() == 1;
    }
}
