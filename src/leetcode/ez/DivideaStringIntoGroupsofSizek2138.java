package leetcode.ez;

import java.util.Arrays;

public class DivideaStringIntoGroupsofSizek2138 {

    public static void main(String[] args) {
        /*Input: s = "abcdefghij", k = 3, fill = "x"
        Output: ["abc","def","ghi","jxx"]*/
        System.out.println(Arrays.toString(divideString("abcdefghi", 3, 'x')));
        System.out.println(Arrays.toString(divideString("abcdefghij", 3, 'x')));
    }

    static String[] divideString(String s, int k, char fill) {
        int missing = s.length() % k == 0 ? 0 : k - s.length() % k;
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < missing; i++) {
            sb.append(fill);
        }
        String[] rs = new String[sb.length()/k];
        int index = 0;
        for (int i = 0; i < sb.length(); i += k) {
            rs[index++] = sb.substring(i, i + k);
        }
        return rs;
    }
}
