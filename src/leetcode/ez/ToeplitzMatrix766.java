package leetcode.ez;

public class ToeplitzMatrix766 {
    public static void main(String[] args) {
//        matrix = [[1,2,3,4],[5,1,2,3],[9,5,1,2]]
        System.out.println(isToeplitzMatrix(new int[][]{{1,2,3,4}, {5,1,2,3}, {9,5,1,2}}));
//        System.out.println(isToeplitzMatrix(new int[][]{{1,2}, {2,2}}));
//        System.out.println(isToeplitzMatrix(new int[][]{{11,74,0,93}, {40,11,74,7}}));
//        System.out.println(isToeplitzMatrix(new int[][]{{39,24}}));
    }

    static boolean isToeplitzMatrix(int[][] matrix) {
        int n = matrix[0].length;
        int m = matrix.length;
//        System.out.println(n + " " + m);
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (i > 0 && j > 0 && matrix[i - 1][j - 1] != matrix[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
