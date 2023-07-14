package leetcode.ez;

public class SumofAllOddLengthSubarrays1588 {

    public static void main(String[] args) {
    }

    static int sumOddLengthSubarrays(int[] arr) {
        int rs = 0;
        int len = arr.length;
        // count oddnum
        int oddNumber = 0;
        for (int i = 1; i <= len; i++) {
            if (i % 2 != 0) oddNumber++;
        }
        for (int i = 1; i <= oddNumber * 2; i+=2) {
            rs += sumSubArray(arr, i);
        }
        return rs;
    }

    static int sumSubArray(int[] arr, int index) {
        int rs = 0;
        for (int i = 0; i < arr.length; i++) {
            rs += arr[i];
        }

        return rs;
    }
}
