package leetcode.ez;

import java.util.Arrays;

public class RectangleOverlap836 {
    public static void main(String[] args) {
//        rec1 = [0,0,2,2], rec2 = [1,1,3,3]
        System.out.println(isRectangleOverlap(new int[]{0,0,2,2}, new int[]{1,1,3,3}));
//        [0,0,1,1], rec2 = [1,0,2,1]
        System.out.println(isRectangleOverlap(new int[]{0,0,1,1}, new int[]{1,0,2,1}));
//        [0,0,1,1], rec2 = [2,2,3,3]
        System.out.println(isRectangleOverlap(new int[]{0,0,1,1}, new int[]{2,2,3,3}));
    }

    static boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        for (int i = 0; i < rec1.length; ++i) {
            rec1[i] = rec1[i] + 1;
        }

        return Arrays.equals(rec1, rec2);
    }
}
