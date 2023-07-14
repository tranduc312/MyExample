package leetcode.ez;

import java.util.Arrays;

public class DeleteGreatestValueinEachRow2500 {

    public static void main(String[] args) {
        System.out.println(deleteGreatestValue(new int[][]{{1,2,4},{3,3,1}}));
        System.out.println(deleteGreatestValue(new int[][]{{10}}));
        /*
        124
        133
        n = 2
        m = 3
         */
    }
    static int deleteGreatestValue(int[][] grid) {
        int rs = 0;
        // sort
        int n = grid.length;
        int m = grid[0].length;
        for (int i = 0; i < n; i++) {
            Arrays.sort(grid[i]);
        }
        for (int i = m - 1; i >= 0; i--) {
            int max = Integer.MIN_VALUE;
            for (int j = n - 1; j >= 0; j--) {
                max = Math.max(max, grid[j][i]);
            }
            rs += max;
        }
        return rs;
    }
}
