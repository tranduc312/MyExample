package leetcode.ez;

public class CheckifBinaryStringHasatMostOneSegmentofOnes1784 {

    public static void main(String[] args) {
        System.out.println(checkOnesSegment("1001"));
        System.out.println(checkOnesSegment("110"));
    }

    static boolean checkOnesSegment(String s) {
        if (s.charAt(1) == '1') return true;
        for (int i = 1; i < s.length() - 1; i++) {
            if (s.charAt(i) == '1' && s.charAt(i) == s.charAt(i + 1))
                return true;
        }
        return false;
    }
}
