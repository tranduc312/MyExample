package leetcode.ez;

public class CheckifNumbersAreAscendinginaSentence2042 {

    public static void main(String[] args) {
        /*Input: s = "1 box has 3 blue 4 red 6 green and 12 yellow marbles"
        Output: true*/
        String s = "1 box has 3 blue 4 red 6 green and 12 yellow marbles";
//        System.out.println(s.split(" "));
        System.out.println(areNumbersAscending("1 box has 3 blue 4 red 6 green and 12 yellow marbles"));
        System.out.println(areNumbersAscending("hello world 5 x 5"));
        System.out.println(areNumbersAscending("sunset is at 7 51 pm overnight lows will be in the low 50 and 60 s"));
    }

    static boolean areNumbersAscending(String s) {
        String[] array = s.split(" ");
        int pre = 0;
        for (String s1 : array) {
            int value = digit(s1);
            if (value != -1 && value <= pre) {
                return false;
            } else if (value != -1 ) {
                pre = value;
            }
        }
        return pre != 0;
    }

    static int digit(String s) {
        try {
            return Integer.parseInt(s);
        } catch (Exception e) {
            return -1;
        }
    }
}
