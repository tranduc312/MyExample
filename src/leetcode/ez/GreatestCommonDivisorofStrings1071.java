package leetcode.ez;

public class GreatestCommonDivisorofStrings1071 {

    public static void main(String[] args) {
        /*Input: str1 = "ABCABC", str2 = "ABC"
        Output: "ABC"*/
        System.out.println(gcdOfStrings("ABCABC", "ABC"));
    }

    static String gcdOfStrings(String str1, String str2) {
        if (str1.length() < str2.length()) {
            return gcdOfStrings(str2, str1);
        } else if (!str1.startsWith(str2)) {
            return "";
        } else if (str2.length() == 0) {
            return str1;
        } else {
            return gcdOfStrings(str1.substring(str2.length()), str2);
        }
    }
}
