package leetcode.ez;

public class SpecialPositionsinaBinaryMatrix1582 {

    public static void main(String[] args) {
        System.out.println(numSpecial(new int[][]{{1,0,0},{0,0,1},{1,0,0}}));
        System.out.println(numSpecial(new int[][]{{1,0,0},{0,1,0},{0,0,1}}));
        System.out.println(numSpecial(new int[][]{{0,0},{0,0},{1,0}}));
        System.out.println(numSpecial(new int[][]{{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,1,0,0,0},{0,0,0,0,1,0,0,0,0,0},{0,0,0,0,0,0,0,0,1,0},{0,0,0,1,0,0,0,0,0,1},{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,1,0,0,0,0}}));
    }

    static int numSpecial(int[][] mat) {
        int rs = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1 && isSpecial(mat, i, j))
                    rs++;
            }
        }
        return rs;
    }

    static boolean isSpecial(int[][] mat, int i, int j) {
        boolean rs = true;
        int len = mat.length > mat[0].length ? mat.length : mat[0].length;
        for (int k = 0; k < len; k++) {
            // check row
            if (k < mat[0].length && k != j && mat[i][k] == 1) {
                return false;
            }
            // check col
            if (k < mat.length && k != i && mat[k][j] == 1) {
                return false;
            }
        }

        return rs;
    }
}
