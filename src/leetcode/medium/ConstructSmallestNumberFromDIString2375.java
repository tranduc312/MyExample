package leetcode.medium;

import java.math.BigDecimal;
import java.util.Stack;

public class ConstructSmallestNumberFromDIString2375 {

    public static void main(String[] args) {
//        System.out.println(smallestNumber("IIIDIDDD"));
//        System.out.println(smallestNumber("DDD"));
    }

    /**
     * Input: pattern = "IIIDIDDD"
     * Output: "123549876"
     * @param pattern
     * @return
     */
    static String smallestNumber(String pattern) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int len = pattern.length();
        int cur = 1;
        for (int i = 0; i <= len; ++i) {
            stack.push(cur++);
            if (i == len || pattern.charAt(i) == 'I') {
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
            }
        }
        return sb.toString();
    }
}
