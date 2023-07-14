package leetcode.ez;

import java.util.stream.IntStream;

public class FindPivotIndex724 {

    public static void main(String[] args) {
//        1,7,3,6,5,6
        System.out.println(pivotIndex(new int[]{1,7,3,6,5,6}));
        System.out.println(pivotIndex(new int[]{1,2,3}));
    }

    static int pivotIndex(int[] nums) {
        int totalLeft = 0;
        int totalRight = IntStream.of(nums).sum();

        for (int i = 0; i < nums.length; ++i) {
            int current = nums[i];
            totalRight -= current;
            if (totalRight == totalLeft ) {
                return i;
            }
            totalLeft += current;
        }
        return -1;
    }
}
