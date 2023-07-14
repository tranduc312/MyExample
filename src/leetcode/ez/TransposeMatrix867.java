package leetcode.ez;

public class TransposeMatrix867 {

    public static void main(String[] args) {
//        [[1,2,3],[4,5,6],[7,8,9]]
//        System.out.println(transpose(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));
//         [[1,2,3],[4,5,6]]
        System.out.println(transpose(new int[][]{{1,2,3},{4,5,6}}));
    }

    static int[][] transpose(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] array = new int[m][n];
        for (int i = 0; i < m; i++ ) {
            for (int j = 0; j < n; j++) {
                array[i][j] = matrix[j][i];
            }
        }
        return array;
    }
}
