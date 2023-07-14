package leetcode.ez;

public class SortingtheSentence1859 {

    public static void main(String[] args) {
        /*Input: s = "is2 sentence4 This1 a3"
        Output: "This is a sentence"*/
        System.out.println(sortSentence("is2 sentence4 This1 a3"));
        System.out.println(sortSentence("Myself2 Me1 I4 and3"));
    }

    static String sortSentence(String s) {
        String[] array = s.split(" ");
        String[] rs = new String[array.length];
        for (String s1 : array) {
            int last = s1.length() - 1;
            rs[s1.charAt(last) - '1'] = s1.substring(0, last);
        }
        return String.join(" ", rs);
    }
}
