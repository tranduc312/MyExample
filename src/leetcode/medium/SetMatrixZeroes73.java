package leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SetMatrixZeroes73 {

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(setZeroes(new int[][]{{1,1,1},{1,0,1},{1,1,1}})));
        System.out.println(Arrays.deepToString(setZeroes(new int[][]{{0,1,2,0},{3,4,5,2},{1,3,1,5}})));
    }

    static int[][] setZeroes(int[][] matrix) {
        List<List<Integer>> indexs = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    indexs.add(Arrays.asList(i, j));
                }
            }
        }
        int[][] rs = new int[matrix.length][];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    indexs.add(Arrays.asList(i, j));
                }
            }
        }
        return null;
    }
}
