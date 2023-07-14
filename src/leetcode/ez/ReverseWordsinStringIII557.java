package leetcode.ez;

public class ReverseWordsinStringIII557 {

    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
        System.out.println(reverseWords("God Ding"));
    }

    static String reverseWords(String s) {
        if (s == null || s.length() == 0) return null;

        String[] array = s.split(" ");
        String result = "";
        for (String t : array) {
            result += new StringBuilder(t).reverse().toString() + " ";
        }

        return result.substring(0, result.length() - 1);
    }
}
