package leetcode.ez;

import java.util.Arrays;

public class DistributeCandies575 {

    public static void main(String[] args) {
        System.out.println(distributeCandies(new int[]{1,1,2,2,3,3}));
        System.out.println(distributeCandies(new int[]{1,1,2,3}));
        System.out.println(distributeCandies(new int[]{6,6,6,6}));

//        Object
    }

    static int distributeCandies(int[] candyType) {
        if (candyType == null) return 0;
        long countDiff = Arrays.stream(candyType).distinct().count();
        int n2 = candyType.length/2;

        return n2 > countDiff ? (int)countDiff : n2;
    }
}
