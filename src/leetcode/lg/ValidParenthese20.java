package leetcode.lg;

import java.util.Stack;

public class ValidParenthese20 {

    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        stack.push('a');
        stack.push('b');
        stack.push('c');
        stack.peek();
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println();
//        System.out.println(isValid("()[]{}"));
//        System.out.println(isValid("([)]"));
    }

    static boolean isValid(String s) {
        Stack<Character> stackParen = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stackParen.push(c);
            } else {
                if (stackParen.isEmpty()) {
                    return false;
                }
                char first = stackParen.peek();
                if (first == '(' && c != ')' || first == '[' && c != ']' || first == '{' && c != '}') {
                    return false;
                } else {
                    stackParen.pop();
                }
            }
        }
        return stackParen.isEmpty();
    }
}
