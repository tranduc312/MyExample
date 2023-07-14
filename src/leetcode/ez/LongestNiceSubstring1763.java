package leetcode.ez;

public class LongestNiceSubstring1763 {

    public static void main(String[] args) {
        /*Input: s = "YazaAay"
        Output: "aAa"*/
    }

    static String longestNiceSubstring(String s) {
        int first = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            String t = String.valueOf(s.charAt(i));
            String t1 = String.valueOf(s.charAt(i + 1));
            if (t.equalsIgnoreCase(t1) && s.charAt(i) - s.charAt(i + 1) == 32) {
            }
        }
        return null;
    }
}
