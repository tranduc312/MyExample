package leetcode.medium;

import java.util.Arrays;

public class MapOfHighestPeak1765 {

    public static void main(String[] args) {
//        System.out.println(Arrays.deepToString(highestPeak(new int[][]{{0,1},{0,0}})));
//        System.out.println(Arrays.deepToString(highestPeak(new int[][]{{0,0,1},{1,0,0},{0,0,0}})));
//        System.out.println(Arrays.deepToString(highestPeak(new int[][]{{0,0},{1,1},{1,0}})));
        System.out.println(Arrays.deepToString(highestPeak(
                new int[][]{{1,1,0,1,1,1},{1,1,0,1,0,0},{0,1,0,0,1,0},{1,1,1,1,1,1},
                        {0,1,1,1,1,0},{1,1,1,0,0,0},{1,1,0,1,1,1},{1,1,0,1,0,1}})));
    }

    static int[][] highestPeak(int[][] isWater) {
        int rowLength = isWater.length;
        int colLength = isWater[0].length;
        int[][] ans = new int[rowLength][colLength];
        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < colLength; j++) {
                if (isWater[i][j] == 1) {
                    ans[i][j] = 0;
                } else {
                    ans[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < colLength; j++) {
                if (isWater[i][j] == 1) {
                    continue;
                }
                ans[i][j] = minAdjacent(ans, i, j) + 1;
            }
        }

        return ans;
    }

    static int minAdjacent(int[][] arr, int i, int j) {
        int min = Integer.MAX_VALUE;
        // north
        if (i - 1 >= 0) {
            min = Math.min(arr[i - 1][j], min);
        }
        // east
        if (j + 1 < arr[0].length) {
            min = Math.min(arr[i][j + 1], min);
        }
        // south
        if (i + 1 < arr.length) {
            min = Math.min(arr[i + 1][j], min);
        }
        // west
        if (j - 1 >= 0) {
            min = Math.min(arr[i][j - 1], min);
        }
        return min;
    }
}
