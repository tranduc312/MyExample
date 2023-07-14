package leetcode.ez;

public class CircularSentence2490 {

    public static void main(String[] args) {
        System.out.println(isCircularSentence("leetcode exercises sound delightful"));
        System.out.println(isCircularSentence("eetcode"));
        System.out.println(isCircularSentence("Leetcode is cool"));
    }

    static boolean isCircularSentence(String sentence) {
        String[] array = sentence.split(" ");
        if (array.length == 1)
            return sentence.charAt(0) == sentence.charAt(sentence.length() - 1);
        char first = array[0].charAt(0);
        char last = array[array.length - 1].charAt(array[array.length - 1].length() - 1);
        char pre = array[0].charAt(array[0].length() - 1);
        if (first != last) return false;
        for (int i = 1; i < array.length; i++) {
            if (pre != array[i].charAt(0))
                return false;
            pre = array[i].charAt(array[i].length() - 1);
        }
        return true;
    }
}
