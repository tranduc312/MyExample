package leetcode.ez;

import java.util.Arrays;
import java.util.List;

public class DetermineifStringHalvesAreAlike1704 {

    private static final List<Character> VOWELS = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

    public static void main(String[] args) {
        System.out.println(halvesAreAlike("book"));
        System.out.println(halvesAreAlike("textbook"));
    }

    static boolean halvesAreAlike(String s) {
        int countFirst = 0;
        int countSecond = 0;
        int first = s.length() / 2 - 1;
        int second = s.length() / 2;
        while (first >= 0 && second < s.length()) {
            if (VOWELS.contains(s.charAt(first--))) countFirst++;
            if (VOWELS.contains(s.charAt(second++))) countSecond++;
        }
        return countFirst == countSecond;
    }
}
