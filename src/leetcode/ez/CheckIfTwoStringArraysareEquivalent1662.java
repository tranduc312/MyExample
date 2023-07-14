package leetcode.ez;

public class CheckIfTwoStringArraysareEquivalent1662 {

    public static void main(String[] args) {
        /*Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
        Output: true*/
        StringBuilder w1 = new StringBuilder(new String[]{"a","b"}.toString());
        System.out.println(arrayStringsAreEqual(new String[]{"ab", "c"}, new String[]{"a", "bc"}));
        System.out.println(arrayStringsAreEqual(new String[]{"a", "cb"}, new String[]{"ab", "c"}));
        System.out.println(arrayStringsAreEqual(new String[]{"abc", "d", "defg"}, new String[]{"abcddefg"}));
    }

    static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder w1 = new StringBuilder();
        for (String s : word1) {
            w1.append(s);
        }
        StringBuilder w2 = new StringBuilder();
        for (String s : word2) {
            w2.append(s);
        }
        return w1.toString().equals(w2.toString());
    }
}
