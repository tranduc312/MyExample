package leetcode.ez;

public class MaximumNestingDepthoftheParentheses1614 {
    public static void main(String[] args) {
        System.out.println(maxDepth("(1+(2*3)+((8)/4))+1"));
        System.out.println(maxDepth("(1)+((2))+(((3)))"));
    }

    static int maxDepth(String s) {
        int rs = 0;
        int cur = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                rs = Math.max(rs, ++cur);
            } else if (s.charAt(i) == ')') {
                cur--;
            }
        }
        return rs;
    }
}
