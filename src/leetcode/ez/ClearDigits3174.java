package leetcode.ez;

import java.util.Stack;

public class ClearDigits3174 {

    public static void main(String[] args) {
//        System.out.println(clearDigits2("abc"));
        System.out.println(clearDigits2("cb34"));
    }

    static String clearDigits3(String s) {
        int len = s.length();
        StringBuilder str = new StringBuilder();
        int i = -1;
        for (int j = 0; j < len; j++) {
            char c = s.charAt(j);
            if (c >= 'a' && c <= 'z') {
                i++;
                str.append(c);
            } else {
                if (i >= 0) {
                    str.deleteCharAt(i);
                    i--;
                }
            }
        }
        return str.toString();
    }

    static String clearDigits2(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        int i = -1;
        for (int j = 0; j < n; ++j) {
            char c = s.charAt(j);
            if (c >= 'a' && c <= 'z') {
                ++i;
                sb.append(c);
            } else {
                if (i >= 0) {
                    sb.deleteCharAt(i);
                    --i;
                }
            }
        }
        return sb.toString();
    }

    static String clearDigits(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}
