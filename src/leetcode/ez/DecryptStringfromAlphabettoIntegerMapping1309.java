package leetcode.ez;

import java.util.HashMap;
import java.util.Map;

public class DecryptStringfromAlphabettoIntegerMapping1309 {

    public static void main(String[] args) {
        /*Input: s = "10#11#12"
        Output: "jkab"*/
        System.out.println(freqAlphabets("10#11#12"));
        /*Input: s = "1326#"
        Output: "acz"*/
        System.out.println(freqAlphabets("1326#"));
    }

    static String freqAlphabets(String s) {
        String rs = "";
        Map<String, Character> map = new HashMap<>();
        int k = 1;
        for (char c = 'a'; c <= 'z'; c++) {
            if (c < 'j') {
                map.put(String.valueOf(k++), c);
            } else {
                map.put(String.valueOf(k++) + "#", c);
            }
        }
        String[] array = s.split("");
        int i = array.length - 1;
        while (i >= 0) {
            if ("#".equals(array[i])) {
                String temp = (array[i - 2] + array[i - 1] + array[i]);
                rs = String.valueOf(map.get(temp)).concat(rs);
                i -= 3;
            } else {
                String temp = array[i];
                rs = String.valueOf(map.get(temp)).concat(rs);
                i--;
            }
        }
        return rs;
    }
}
