package leetcode.ez;

public class CheckWhetherTwoStringsareAlmostEquivalent2068 {

    public static void main(String[] args) {
        System.out.println(checkAlmostEquivalent("aaaa","bccb"));
//        System.out.println(checkAlmostEquivalent("abcdeef","abaaacc"));
//        System.out.println(checkAlmostEquivalent("cccddabba","babababab"));
//        System.out.println(checkAlmostEquivalent("zzzyyy","iiiiii"));
    }

    static boolean checkAlmostEquivalent(String word1, String word2) {
        int[] array = new int[26];
        for (char c : word1.toCharArray()) {
            array[c - 'a']++;
        }
        for (char c : word2.toCharArray()) {
            array[c - 'a']--;
        }
        for (int c : array) {
            if (c > 3 || c < -3)
                return false;
        }
        return true;
    }
}
