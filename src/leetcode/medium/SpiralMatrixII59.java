package leetcode.medium;

import java.util.Arrays;

public class SpiralMatrixII59 {

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(generateMatrix(3)));
        System.out.println(Arrays.deepToString(generateMatrix(1)));
    }

    static int[][] generateMatrix(int n) {
        int[][] rs = new int[n][n];
        int colStart = 0;
        int colEnd = n - 1;
        int rowStart = 0;
        int rowEnd = n - 1;
        int value = 1;
        while (rowStart <= rowEnd && colStart <= colEnd) {
            // traverse right
            for (int i = colStart; i <= colEnd; i++) {
                rs[rowStart][i] = value++;
            }
            rowStart++;
            // traverse down
            for (int i = rowStart; i <= rowEnd; i++) {
                rs[i][colEnd] = value++;
            }
            colEnd--;
            // traverse left
            if (rowStart <= rowEnd) {
                for (int i = colEnd; i >= colStart; i--) {
                    rs[rowEnd][i] = value++;
                }
            }
            rowEnd--;
            // traverse up
            if (colStart <= colEnd) {
                for (int i = rowEnd; i >= rowStart; i--) {
                    rs[i][colStart] = value++;
                }
            }
            colStart++;
        }
        return rs;
    }
}
