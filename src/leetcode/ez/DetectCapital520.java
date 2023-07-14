package leetcode.ez;

public class DetectCapital520 {

    public static void main(String[] args) {
        System.out.println(detectCapitalUse("USA"));
        System.out.println(detectCapitalUse("leetcode"));
        System.out.println(detectCapitalUse("Google"));
        System.out.println(detectCapitalUse("FlaG"));
    }

    static boolean detectCapitalUse(String word) {
        if (word.length() < 2) return true;

        if (Character.isUpperCase(word.charAt(0)) && Character.isUpperCase(word.charAt(1))) { // case !allUppercase
            for (int i = 2; i < word.length(); ++i) {
                if (Character.isLowerCase(word.charAt(i))) return false;
            }
        } else {
            for (int i = 1; i < word.length(); ++i) { // case !firstUppercase & !allLowercase
                if (Character.isUpperCase(word.charAt(i))) return false;
            }
        }

        return true;
    }

}
