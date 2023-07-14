package leetcode.ez;

public class CheckIfaWordOccursAsaPrefixofAnyWordinaSentence1455 {

    public static void main(String[] args) {
        /*Input: sentence = "i love eating burger", searchWord = "burg"
        Output: 4*/
        System.out.println(isPrefixOfWord("i love eating burger", "burg"));
        System.out.println(isPrefixOfWord("this problem is an easy problem", "pro"));
        System.out.println(isPrefixOfWord("i am tired", "you"));
    }

    static int isPrefixOfWord(String sentence, String searchWord) {
        String[] array = sentence.split(" ");
        for (int i = 0; i < array.length; i++) {
            if (array[i].startsWith(searchWord)) return i + 1;
        }
        return -1;
    }
}
