package leetcode.ez;

import java.util.Arrays;

public class MinimumSumofFourDigitNumberAfterSplittingDigits2160 {

    public static void main(String[] args) {
        System.out.println(minimumSum(2932));
        System.out.println(minimumSum(4009));
    }

    static int minimumSum(int num) {
        int[] array = new int[4];
        int index = 0;
        while (num != 0) {
            array[index++] = num % 10;
            num /= 10;
        }
        Arrays.sort(array);
        int first = array[0] * 10 + array[2];
        int second = array[1] * 10 + array[3];
        return first + second;
    }

}
