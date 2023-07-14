package leetcode.ez;

import java.util.Arrays;

public class MeanofArrayAfterRemovingSomeElements1619 {

    public static void main(String[] args) {
        System.out.println(trimMean(new int[]{1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3}));
        System.out.println(trimMean(new int[]{6, 2, 7, 5, 1, 2, 0, 3, 10, 2, 5, 0, 5, 5, 0, 8, 7, 6, 8, 0}));
        System.out.println(trimMean(new int[]{6, 0, 7, 0, 7, 5, 7, 8, 3, 4, 0, 7, 8, 1, 6, 8, 1, 1, 2, 4, 8, 1, 9, 5, 4, 3, 8, 5, 10, 8, 6, 6, 1, 0, 6, 10, 8, 2, 3, 4}));
    }

    static double trimMean(int[] arr) {
        Arrays.sort(arr);
        int fivePer = arr.length / 20;
        double sum = 0;
        for (int i = fivePer; i < arr.length - fivePer; i++) {
            sum += arr[i];
        }
        double rs = 0.0;
        rs =  sum / (arr.length - (fivePer * 2));
        return rs;
    }
}
