package leetcode.ez;

import java.util.Arrays;

public class HeightChecker1051 {
    public static void main(String[] args) {
        /*Input: heights = [1,1,4,2,1,3]
        Output: 3
        Explanation:
        heights:  [1,1,4,2,1,3]
        expected: [1,1,1,2,3,4]*/
        System.out.println(heightChecker(new int[]{1,1,4,2,1,3}));
        System.out.println(heightChecker(new int[]{5,1,2,3,4}));
        System.out.println(heightChecker(new int[]{1,2,3,4,5}));
    }

    static int heightChecker(int[] heights) {
        int rs = 0;
        int len = heights.length;
        int[] array = heights.clone();
        Arrays.sort(array);
        for (int i = 0; i < len; i++) {
            if (!(array[i] == heights[i])) {
                rs++;
            }
        }

        return rs;
    }
}
