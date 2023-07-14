package leetcode.ez;

public class ReversePrefixofWord2000 {

    public static void main(String[] args) {
        /*Input: word = "abcdefd", ch = "d"
        Output: "dcbaefd*/
        System.out.println(reversePrefix("abcdefd", 'd'));
        System.out.println(reversePrefix("xyxzxe", 'z'));
        System.out.println(reversePrefix("abcd", 'z'));
    }

    static String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch) + 1;

        StringBuilder rs = new StringBuilder(word.substring(0, index));
        rs.reverse().append(word.substring(index));
        return rs.toString();
    }
}
