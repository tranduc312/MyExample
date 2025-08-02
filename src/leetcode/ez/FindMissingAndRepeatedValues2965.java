package leetcode.ez;

import java.util.Arrays;

public class FindMissingAndRepeatedValues2965 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findMissingAndRepeatedValues(new int[][]{{1, 3}, {2, 2}})));
        System.out.println(Arrays.toString(findMissingAndRepeatedValues(new int[][]{{9, 1, 7}, {8, 9, 2}, {3, 4, 6}})));
    }

    static int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int[] ans = new int[2];
        int[] tracking = new int[n * n + 1];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                int value = grid[i][j];
                ++tracking[value];
            }
        }
        for (int i = 1; i < tracking.length; i++) {
            if (tracking[i] == 2) {
                ans[0] = i;
            } else if (tracking[i] == 0) {
                ans[1] = i;
            }
        }
        return ans;
    }

}
