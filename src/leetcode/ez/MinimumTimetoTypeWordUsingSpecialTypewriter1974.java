package leetcode.ez;

import java.util.ArrayList;
import java.util.List;

public class MinimumTimetoTypeWordUsingSpecialTypewriter1974 {

    public static void main(String[] args) {
//        char b = 'b';
//        char z = 'z';
//        int value = b -  z;
//        System.out.println(27 + value);
//        char a = 'a';
//        char c = 'c';
//        int value1 = c - a;
//        if (value1 < 0) {
//            System.out.println(27 + value1);
//        } else {
//            System.out.println(value1);
//        }
//        System.out.println(minTimeToType("abc"));
//        System.out.println(minTimeToType("bza"));
//        System.out.println(minTimeToType("zjpc"));

//        String cartNumber = String.format("%09d", 100);
//        System.out.println(cartNumber);
        List<String> list = new ArrayList<>();
    }

    static int minTimeToType(String word) {
        int rs = word.length();
        char init = 'a';
        for (int i = 0; i < word.length(); i++) {
            int value = Math.abs(word.charAt(i) - init);
            rs += Math.min(26 - value, value);
            init = word.charAt(i);
        }
        return rs;
    }
}
