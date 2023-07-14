package leetcode.ez;

public class MatrixDiagonalSum1572 {

    public static void main(String[] args) {
        System.out.println(diagonalSum(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
        System.out.println(diagonalSum(new int[][]{{1,1,1,1},
                {1,1,1,1},
                {1,1,1,1},
                {1,1,1,1}}));
        System.out.println(diagonalSum(new int[][]{{5}}));
    }

    static int diagonalSum(int[][] mat) {
        int rs = 0;
        int start = 0;
        int end = mat.length - 1;
        for (int i = 0; i < mat.length; i++) {
            if (start == end) {
                rs += mat[i][start++];
                end--;
            } else {
                rs += mat[i][start++];
                rs += mat[i][end--];
            }
        }

        return rs;
    }
}
