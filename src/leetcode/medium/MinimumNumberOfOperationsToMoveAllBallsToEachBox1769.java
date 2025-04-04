package leetcode.medium;

import java.util.Arrays;

public class MinimumNumberOfOperationsToMoveAllBallsToEachBox1769 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(minOperations2("110")));
        System.out.println(Arrays.toString(minOperations2("001011")));
    }
    static int[] minOperations2(String boxes) {
        int n = boxes.length();
        int[] rs = new int[n];
        int i = 0;
        int right = 0;
        int left = 0;
        int value = 0;
        for (i = 0; i < n; i++) {
            if (boxes.charAt(i) == '1') {
                value += i;
                right ++;
            }
        }
        rs[0] = value;
        if (boxes.charAt(0) == '1') {
            left++;
            right--;
        }
        for (i = 1; i < n; i++) {
            System.out.println(value+" "+left+" "+right);
            value -=right;
            value += left;
            if (boxes.charAt(i) == '1') {
                right--;
                left++;
            }
            rs[i] = value;
        }
        return rs;
    }

    static int[] minOperations(String boxes) {
        int[] rs = new int[boxes.length()];
        for (int i = 0; i < boxes.length(); i++) {
            int value = 0;
            for (int j = 0; j < boxes.length(); j++) {
                if (i != j && boxes.charAt(j) == '1') {
                    value += Math.abs(i - j);
                }
            }
            rs[i] = value;
        }

        return rs;
    }
}
