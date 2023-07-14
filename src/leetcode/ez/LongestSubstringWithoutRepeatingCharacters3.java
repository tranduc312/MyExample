package leetcode.ez;

public class LongestSubstringWithoutRepeatingCharacters3 {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("bbbbb"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));
        System.out.println(lengthOfLongestSubstring(" "));
        System.out.println(lengthOfLongestSubstring("dvdf"));
    }

    static int lengthOfLongestSubstring(String s) {
        int rs = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            String temp = String.valueOf(s.charAt(i));
            int index = sb.indexOf(temp);
            if (index == -1) {
                sb.append(s.charAt(i));
            } else {
                rs = Math.max(rs, sb.length());
                sb = new StringBuilder(sb.substring(index + 1) + temp);
            }
        }
        return Math.max(rs, sb.length());
    }
}
