package leetcode.ez;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers728 {
    public static void main(String[] args) {
//        System.out.println(checkNumber(20));
//        System.out.println(selfDividingNumbers(1,22));
//        System.out.println(selfDividingNumbers(47,85));
        System.out.println(selfDividingNumbers(66,708));
    }

    static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> rs = new ArrayList<>();
        for (int i = left; i <= right; ++i) {
            if (checkNumber(i)) {
                rs.add(i);
            }
        }
        return rs;
    }

    private static boolean checkNumber(int i) {
        int[] array = Integer.toString(i).chars().map(c -> c-'0').toArray();
        for (int j : array) {
            if (i % 10 == 0 || j == 0) return false;
            if (i % j != 0) return false;
        }
        return true;
    }
}
