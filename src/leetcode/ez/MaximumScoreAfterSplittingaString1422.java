package leetcode.ez;

public class MaximumScoreAfterSplittingaString1422 {

    public static void main(String[] args) {
        int n = 011101;
        System.out.println(maxScoreBetter("011101"));
        System.out.println(maxScoreBetter("1111"));
    }
    static int maxScoreBetter(String s) {
        int zeros = 0;
        int ones = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') zeros++;
            else ones++;
            if (i != s.length() - 1)
                max = Math.max(zeros - ones, max);
        }
        return max + ones;
    }

    static int maxScore(String s) {
        int rs = 0;
        int sum = 0;
        for (int i = 1; i < s.length(); i++) {
            StringBuilder left = new StringBuilder();
            StringBuilder right = new StringBuilder();
            left.append(s, 0, i);
            right.append(s, i, s.length());
            sum = count0(left) + count1(right);
            if (sum > rs) rs = sum;
        }
        return rs;
    }

    static int count0(StringBuilder s) {
        int rs = 0;
        for (char c : s.toString().toCharArray()) {
            if (c == '0') rs++;
        }
        return rs;
    }

    static int count1(StringBuilder s) {
        int rs = 0;
        for (char c : s.toString().toCharArray()) {
            if (c == '1') rs++;
        }
        return rs;
    }
}
