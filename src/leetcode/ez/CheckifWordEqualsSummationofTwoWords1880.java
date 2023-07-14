package leetcode.ez;

public class CheckifWordEqualsSummationofTwoWords1880 {

    public static void main(String[] args) {
        /*Input: firstWord = "acb", secondWord = "cba", targetWord = "cdb"
        Output: true
        Explanation:
        The numerical value of firstWord is "acb" -> "021" -> 21.
        The numerical value of secondWord is "cba" -> "210" -> 210.
        The numerical value of targetWord is "cdb" -> "231" -> 231.
        We return true because 21 + 210 == 231.*/
        
        System.out.println(isSumEqual("acb", "cba", "cdb"));
        System.out.println(isSumEqual("aaa", "a", "aab"));
        System.out.println(isSumEqual("aaa", "a", "aaaa"));
    }

    static boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        StringBuilder first = new StringBuilder();
        StringBuilder second = new StringBuilder();
        StringBuilder target = new StringBuilder();
        int len = Math.max(firstWord.length() > secondWord.length() ? firstWord.length() : secondWord.length(), targetWord.length());
        for (int i = 0; i < len; i++) {
            if (i < firstWord.length()) {
                first.append(firstWord.charAt(i) - 'a');
            }
            if (i < secondWord.length()) {
                second.append(secondWord.charAt(i) - 'a');
            }
            if (i < targetWord.length()) {
                target.append(targetWord.charAt(i) - 'a');
            }
        }
        return (Integer.parseInt(first.toString()) + Integer.parseInt(second.toString())) == Integer.parseInt(target.toString());
    }
}
