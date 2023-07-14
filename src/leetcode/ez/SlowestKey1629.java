package leetcode.ez;

public class SlowestKey1629 {

    public static void main(String[] args) {
        /*Input: releaseTimes = [12,23,36,46,62], keysPressed = "spuda"
        Output: "a"
        Explanation: The keypresses were as follows:
        Keypress for 's' had a duration of 12.
        Keypress for 'p' had a duration of 23 - 12 = 11.
        Keypress for 'u' had a duration of 36 - 23 = 13.
        Keypress for 'd' had a duration of 46 - 36 = 10.
        Keypress for 'a' had a duration of 62 - 46 = 16.
        The longest of these was the keypress for 'a' with duration 16.*/
        System.out.println(slowestKey(new int[]{12,23,36,46,62}, "spuda"));
        System.out.println(slowestKey(new int[]{9,29,49,50}, "cbcd"));
    }

    static char slowestKey(int[] releaseTimes, String keysPressed) {
        char rs = '\0';
        return rs;
    }
}
