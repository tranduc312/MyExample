package leetcode.ez;

import java.util.Arrays;

public class DecodeXORedArray1720 {

    public static void main(String[] args) {
        Arrays.stream(decode(new int[]{1, 2, 3}, 1)).forEach(s -> System.out.print(s + " "));
        System.out.println();
        Arrays.stream(decode(new int[]{6, 2, 7, 3}, 4)).forEach(s -> System.out.print(s + " "));
    }

    static int[] decode(int[] encoded, int first) {
        int[] rs = new int[encoded.length + 1];
        rs[0] = first;
        for (int i = 0; i < encoded.length; i++) {
            rs[i + 1] = rs[i] ^ encoded[i];
        }

        return rs;
    }
}
