package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix54 {

    public static void main(String[] args) {
        /*Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
        Output: [1,2,3,6,9,8,7,4,5]*/
        System.out.println(spiralOrder(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));
        /*Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
        Output: [1,2,3,4,8,12,11,10,9,5,6,7]*/
        System.out.println(spiralOrder(new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}}));
        System.out.println(spiralOrder(new int[][]{{1},{2},{3},{4},{5},{6},{7},{8},{9},{10}}));
    }

    static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> rs = new ArrayList<>();
        if (matrix.length == 0) return rs;
        int rowStart = 0;
        int rowEnd = matrix.length - 1;
        int colStart = 0;
        int colEnd = matrix[0].length - 1;

        while (rowStart <= rowEnd && colStart <= colEnd) {
            // traverse right
            for (int i = colStart; i <= colEnd; i++) {
                rs.add(matrix[rowStart][i]);
            }
            ++rowStart;
            // traverse down
            for (int i = rowStart; i <= rowEnd; i++) {
                rs.add(matrix[i][colEnd]);
            }
            --colEnd;
            // traverse left
            if (rowStart <= rowEnd) {
                for (int i = colEnd; i >= colStart; i--) {
                    rs.add(matrix[rowEnd][i]);
                }
            }
            --rowEnd;
            // traverse up
            if (colStart <= colEnd) {
                for (int i = rowEnd; i >= rowStart; i--) {
                    rs.add(matrix[i][colStart]);
                }
            }
            ++colStart;
        }

        return rs;
    }
}
