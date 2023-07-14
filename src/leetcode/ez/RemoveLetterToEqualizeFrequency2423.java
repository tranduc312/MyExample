package leetcode.ez;

import java.util.HashSet;
import java.util.Set;

public class RemoveLetterToEqualizeFrequency2423 {

    public static void main(String[] args) {
//        System.out.println(equalFrequency("abcc"));
//        System.out.println(equalFrequency("aazz"));
        System.out.println(equalFrequency("bac"));
    }

    static boolean equalFrequency(String word) {
        for (int i = 0; i < word.length(); i++) {
            StringBuilder sb = new StringBuilder(word);
            sb.deleteCharAt(i);
            int[] array = new int[26];
            for (char c : sb.toString().toCharArray()) {
                array[c - 'a']++;
            }
            Set<Integer> set = new HashSet<>();
            for (int j : array) {
                if (j > 0) set.add(j);
            }
            if (set.size() == 1) return true;
        }
        return false;
    }
}
