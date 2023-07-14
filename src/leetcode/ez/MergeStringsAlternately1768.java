package leetcode.ez;

import java.io.FileInputStream;

public class MergeStringsAlternately1768 {

    public static void main(String[] args) {
        /*Input: word1 = "abc", word2 = "pqr"
        Output: "apbqcr"
        Explanation: The merged string will be merged as so:
        word1:  a   b   c
        word2:    p   q   r
        merged: a p b q c r*/
        System.out.println(mergeAlternately("abc", "pqr"));
        System.out.println(mergeAlternately("ab", "pqrs"));
        System.out.println(mergeAlternately("abcd", "pq"));
        FileInputStream inputStream = null;
    }

    static String mergeAlternately(String word1, String word2) {
        StringBuilder rs = new StringBuilder();
        int len = word1.length() > word2.length() ? word1.length() : word2.length();
        for (int i = 0; i < len; i++) {
            if (i < word1.length())
                rs.append(word1.charAt(i));
            if (i < word2.length())
                rs.append(word2.charAt(i));
        }
        return rs.toString();
    }
}
