package leetcode.ez;

public class FindFirstPalindromicStringintheArray2108 {

    public static void main(String[] args) {
        System.out.println(firstPalindrome(new String[]{"abc","car","ada","racecar","cool"}));
        System.out.println(firstPalindrome(new String[]{"notapalindrome","racecar"}));
        System.out.println(firstPalindrome(new String[]{"def","ghi"}));
    }

    static String firstPalindrome(String[] words) {
        for (String word : words) {
            String reverse = new StringBuilder(word).reverse().toString();
            if (word.equals(reverse))
                return word;
        }
        return "";
    }
}
