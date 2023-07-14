package leetcode.ez;

import java.util.HashMap;
import java.util.Map;

public class CheckifNumberHasEqualDigitCountandDigitValue2283 {

    public static void main(String[] args) {
        System.out.println(digitCount("1210"));
    }

    static boolean digitCount(String num) {
        boolean rs = true;
        Map<Integer, Integer> map = new HashMap<>();
        for (char c : num.toCharArray()) {
            map.put(c - '0', map.getOrDefault(c - '0', 0) + 1);
        }
        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) - '0' != map.getOrDefault(i, 0)) {
                rs = false;
                break;
            }
        }
        return rs;
    }
}
