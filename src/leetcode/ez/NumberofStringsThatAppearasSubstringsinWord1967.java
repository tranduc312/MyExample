package leetcode.ez;

public class NumberofStringsThatAppearasSubstringsinWord1967 {

    public static void main(String[] args) {
        /*Input: patterns = ["a","abc","bc","d"], word = "abc"
        Output: 3*/
        System.out.println(numOfStrings(new String[]{"a","abc","bc","d"}, "abc"));
        System.out.println(numOfStrings(new String[]{"a","b","c"}, "aaaaabbbbb"));
        System.out.println(numOfStrings(new String[]{"a","a","a"}, "ab"));
    }

    static int numOfStrings(String[] patterns, String word) {
        int rs = 0;
        for (String pattern : patterns) {
            if (word.contains(pattern)) rs++;
        }
        return rs;
    }
}
