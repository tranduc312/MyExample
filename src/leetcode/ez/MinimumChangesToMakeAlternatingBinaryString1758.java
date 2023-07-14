package leetcode.ez;

public class MinimumChangesToMakeAlternatingBinaryString1758 {

    public static void main(String[] args) {
        /*Input: s = "0100"
        Output: 1
        Explanation: If you change the last character to '1', s will be "0101", which is alternating.*/
//        System.out.println(minOperations("0100"));
//        System.out.println(minOperations("10"));
//        System.out.println(minOperations("1111"));
//        System.out.println(minOperations("110010"));
        System.out.println(minOperations("10010100"));
    }

    static int minOperations(String s) {
        int rs = 0;
        // check is alternating
        boolean isAlternating = true;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                isAlternating = false;
            }
        }
        if (isAlternating) return 0;

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                rs++;
                i++;
            }
        }
        return rs;
    }
}
