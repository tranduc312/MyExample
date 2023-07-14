package leetcode.ez;

public class CounttheNumberofConsistentStrings1684 {

    public static void main(String[] args) {
        /*Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
        Output: 2*/
        System.out.println(countConsistentStrings("ab", new String[]{"ad", "bd", "aaab", "baa", "badab"}));
        System.out.println(countConsistentStrings("abc", new String[]{"a","b","c","ab","ac","bc","abc"}));
        System.out.println(countConsistentStrings("cad", new String[]{"cc","acd","b","ba","bac","bad","ac","d"}));
    }

    static int countConsistentStrings(String allowed, String[] words) {
        int rs = 0;
        for (String s : words) {
            boolean isValid = true;
            for (int i = 0; i < s.length(); i++) {
                if (!allowed.contains(String.valueOf(s.charAt(i)))) {
                    isValid = false;
                }
            }
            if (isValid)
                rs++;
        }

        return rs;
    }
}
