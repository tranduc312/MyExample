package leetcode.ez;

public class CountPrefixAndSuffixPairsI3042 {

    public static void main(String[] args) {

        /**
         * Input: words = ["a","aba","ababa","aa"]
         * Output: 4
         */
        System.out.println(countPrefixSuffixPairs(new String[]{"a","aba","ababa","aa"}));
        System.out.println(countPrefixSuffixPairs(new String[]{"pa","papa","ma","mama"}));
        System.out.println(countPrefixSuffixPairs(new String[]{"abab","ab"}));
    }

    static int countPrefixSuffixPairs(String[] words) {
        int rs = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (isPrefixAndSuffix(words[i], words[j])) {
                   rs++;
                }
            }
        }
        return rs;
    }

    static boolean isPrefixAndSuffix(String str1, String str2) {
        return str2.startsWith(str1) && str2.endsWith(str1);
    }
}
