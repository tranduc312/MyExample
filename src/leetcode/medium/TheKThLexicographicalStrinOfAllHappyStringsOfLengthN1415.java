package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class TheKThLexicographicalStrinOfAllHappyStringsOfLengthN1415 {

    public static void main(String[] args) {
        System.out.println(getHappyString(1, 3));
        System.out.println(getHappyString(1, 4));
        System.out.println(getHappyString(3, 9));
    }

    static String getHappyString(int n, int k) {
        List<String> happyStrings = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        genHappyStrings(n, "", sb);
        if (k > sb.length()) {
            return "";
        }
        return String.valueOf(sb.charAt(sb.length() - 1));
    }

    static void genHappyStrings(int n, String cur, StringBuilder sb) {
        if (cur.length() == n) {
            sb.append(cur);
            return;
        }

        for (char c : new char[]{'a', 'b', 'c'}) {
            if (cur.isEmpty() || cur.charAt(cur.length() - 1) != c) {
                genHappyStrings(n, cur + c, sb);
            }
        }
    }
}

