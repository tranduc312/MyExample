package leetcode.ez;

public class PercentageofLetterinString2278 {

    public static void main(String[] args) {
    }

    static int percentageLetter(String s, char letter) {
        int count = 0;
        String[] array = s.split("");
        for (String ch : array) {
            if (ch.equals(letter)) {
                count++;
            }
        }
        return count != 0 ? s.length() / count : 0;
    }
}
