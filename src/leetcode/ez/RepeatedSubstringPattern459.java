package leetcode.ez;

public class RepeatedSubstringPattern459 {

    private final static String A_A = "aa";

    public static void main(String[] args) {

        System.out.println(repeatedSubstringPattern("abab"));
        System.out.println(repeatedSubstringPattern("aba"));
        System.out.println(repeatedSubstringPattern("abcabcabcabc"));
    }

    static boolean repeatedSubstringPattern(String s) {
        int idx = (s + s).indexOf(s, 1);
        System.err.println("idx " + idx);
        return  idx < s.length();
    }
}
