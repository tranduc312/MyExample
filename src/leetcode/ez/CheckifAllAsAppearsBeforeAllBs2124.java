package leetcode.ez;

public class CheckifAllAsAppearsBeforeAllBs2124 {

    public static void main(String[] args) {
        /*Input: s = "aaabbb"
        Output: true*/
        System.out.println(checkString("aaabbb"));
        System.out.println(checkString("abab"));
        System.out.println(checkString("bbb"));
    }

    static boolean checkString(String s) {

        return !s.substring(s.indexOf("b")).contains("a");
    }
}
