package leetcode.ez;

public class RotateString796 {

    public static void main(String[] args) {
        System.out.println(rotateString("abcde", "cdeab"));
    }

    static boolean rotateString(String s, String goal) {
        return s.length() == goal.length() && (s + s).contains(goal);
    }
}
