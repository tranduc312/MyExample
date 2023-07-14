package leetcode.ez;

public class ConsecutiveCharacters1446 {

    public static void main(String[] args) {
        System.out.println(maxPower("leetcode"));
        System.out.println(maxPower("abbcccddddeeeeedcba"));
    }

    static int maxPower(String s) {
        int rs = 0;
        int max = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                max++;
                if (max > rs) {
                    rs = max;
                }
            } else {
                max = 1;
            }
        }
        return rs;
    }
}
