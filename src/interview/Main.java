package interview;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /**
         * input:
         * 1234321
         */
        /*System.out.println(doiXung(1234321)); // true
        System.out.println(doiXung(1234)); // false
        System.out.println(doiXung(123321)); // true
        System.out.println(doiXung(111111)); // true
        System.out.println(doiXung(764321)); // false*/

        /**
         * array sort
         * target
         * sum 2 so gan = 0;
         * output: index 2 so sum gan = 0
         *
         *
         * [-4,-2,-1,2,4,5]
         * -> 1,3
         *
         *
         * [-4,-2,-1,3,5]
         * ->
         */
        /*System.out.println(Arrays.toString(findNumber(new int[]{-4,-2,-1,2,4,5})));
        System.out.println(Arrays.toString(findNumber(new int[]{-4,-2,-1,3,5})));
        System.out.println(Arrays.toString(findNumber(new int[]{-10,-6,3,5})));*/


        System.out.println(Arrays.toString(findNumber(new int[]{-4,-2,-1})));
    }

    static int[] findNumber(int[] array) {
        int left = 0;
        int right = array.length - 1;
        int value = Integer.MAX_VALUE;
        int index1 = 0;
        int index2 = 0;
        while (left < right) {
            if (array[left] + array[right] == 0) return new int[]{left, right};
            else if (value > Math.abs(array[left] + array[right])) {
                value = Math.abs(array[left] + array[right]);
                index1 = left;
                index2 = right;
                right--;
            } else {
                left++;
            }
        }
        return new int[]{index1, index2};
    }

    /*static boolean doiXung(int num) {
        String value = String.valueOf(num);
        int i = 0;
        int j = value.length() - 1;
        while (i < j) {
            if (value.charAt(i++) != value.charAt(j--)) {
                return false;
            }
        }
        return true;
    }*/

}
