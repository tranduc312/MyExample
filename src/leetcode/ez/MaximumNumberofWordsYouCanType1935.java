package leetcode.ez;

import java.util.Arrays;
import java.util.List;

public class MaximumNumberofWordsYouCanType1935 {

    public static void main(String[] args) {
        /*Input: text = "hello world", brokenLetters = "ad"
        Output: 1*/
        System.out.println(canBeTypedWords("hello world", "ad"));
        System.out.println(canBeTypedWords("leet code", "lt"));
        System.out.println(canBeTypedWords("leet code", "e"));
    }

    static int canBeTypedWords(String text, String brokenLetters) {
        int rs = 0;
        String[] array = text.split(" ");
        List<String> brokens = Arrays.asList(brokenLetters.split(""));
        for (String s : array) {
            boolean flg = true;
            for (String b : brokens) {
                if (s.contains(b)) {
                    flg = false;
                    break;
                }
            }
            if (flg) rs++;
        }
        return rs;
    }
}
