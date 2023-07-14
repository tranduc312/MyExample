package leetcode.ez;

public class SplitaStringinBalancedStrings1221 {

    public static void main(String[] args) {
        System.out.println(balancedStringSplit("RLRRLLRLRL"));
//        System.out.println(balancedStringSplit("RLRRRLLRLL"));
//        System.out.println(balancedStringSplit("LLLLRRRR"));
    }

    static int balancedStringSplit(String s) {
        int result = 0;
        int sum = 0;

        for (char letter : s.toCharArray()) {
            sum += (letter == 'R' ? 1 : -1);
            if (sum == 0) {
                result++;
            }
        }

        return result;
    }
}
