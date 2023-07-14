package leetcode.ez;

import java.util.Arrays;
import java.util.stream.Stream;

public class ReshapetheMatrix566 {

    public static void main(String[] args) {
//        System.out.println(matrixReshape(new int[][]{{1,2}, {3,4}}, 1,4));
//        System.out.println(matrixReshape(new int[][]{{1,2}, {3,4}}, 2,4));
//        System.out.println(matrixReshape(new int[][]{{1,2,3,4}}, 2,2));
        System.out.println(matrixReshape(new int[][]{{1,2}}, 1,1));
    }

    static int[][] matrixReshape(int[][] mat, int r, int c) {
        if (mat == null) return null;
        // count element array
        long total = Arrays.stream(mat).flatMapToInt(x -> Arrays.stream(x)).count();
        if ((r * c) != total) return mat;

        // get element array;
        int[] array = Stream.of(mat).flatMapToInt(x -> Arrays.stream(x)).toArray();
        int[][] rs = new int[r][c];
        int count = 0;
        for (int i = 0; i < r; ++i) {
            for (int j = 0; j < c; ++j) {
                rs[i][j] = array[count++];
            }
        }

        return rs;
    }
}
