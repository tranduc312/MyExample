package leetcode.ez;

import java.util.Arrays;

public class Convert1DArrayInto2DArray2022 {

    public static void main(String[] args) {
        /*Input: original = [1,2,3,4], m = 2, n = 2
        Output: [[1,2],[3,4]]*/
        System.out.println(Arrays.deepToString(construct2DArray(new int[]{1, 2, 3, 4}, 2, 2)));
        System.out.println(Arrays.deepToString(construct2DArray(new int[]{1, 2, 3}, 1, 3)));
        System.out.println(Arrays.deepToString(construct2DArray(new int[]{1, 2}, 1, 1)));
    }

    static int[][] construct2DArray(int[] original, int m, int n) {
        if (original.length != m * n) return new int[0][0];
        int[][] rs = new int[m][n];
        int count = 0;
        for (int j = 0; j < m; j++) {
            for (int k = 0; k < n; k++) {
                rs[j][k] = original[count++];
            }
        }
        return rs;
    }
}
