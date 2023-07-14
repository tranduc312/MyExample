package leetcode.ez;

import java.util.stream.IntStream;

public class PartitionArrayIntoThreePartsWithEqualSum1013 {

    public static void main(String[] args) {
        /*Input: arr = [0,2,1,-6,6,-7,9,1,2,0,1]
        Output: true
        Explanation: 0 + 2 + 1 = -6 + 6 - 7 + 9 + 1 = 2 + 0 + 1*/
//        System.out.println(canThreePartsEqualSum(new int[]{0,2,1,-6,6,-7,9,1,2,0,1}));
//        System.out.println(canThreePartsEqualSum(new int[]{0,2,1,-6,6,7,9,-1,2,0,1}));
//        System.out.println(canThreePartsEqualSum(new int[]{3,3,6,5,-2,2,5,1,-9,4}));
//        System.out.println(canThreePartsEqualSum(new int[]{1,-1,1,-1}));
//        System.out.println(canThreePartsEqualSum(new int[]{0,0,0,0}));
        System.out.println(canThreePartsEqualSum(new int[]{10,-10,10,-10,10,-10,10,-10}));
    }

    static boolean canThreePartsEqualSum(int[] arr) {
        boolean temp = IntStream.of(arr).allMatch(a -> a == 0);
        if (temp)
            return true;
        int total = IntStream.of(arr).sum();
        boolean rs = false;
        int avg = total / 3;
        int first = 0;
        int second = 0;
        int third = 0;
        for (int i : arr) {
            if (first == avg && second != avg) {
                second += i;
            } else if (second == avg && third != avg) {
                third += i;
            } else {
                first += i;
            }
        }
        if (first != 0 && first == second && first == third)
            rs = true;
        return rs;
    }
}
