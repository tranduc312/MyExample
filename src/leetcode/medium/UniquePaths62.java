package leetcode.medium;

public class UniquePaths62 {

    public static void main(String[] args) {
        /*Input: m = 3, n = 7
        Output: 28*/
        System.out.println(uniquePathsBetter(3, 7)); // 28
//        System.out.println(uniquePaths(3, 2)); // 3
    }
    static int uniquePathsBetter(int m, int n) {
        int[][] dynamicPrograming = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0)
                    dynamicPrograming[i][j] = 1;
                else
                    dynamicPrograming[i][j] = dynamicPrograming[i - 1][j] + dynamicPrograming[i][j - 1];
            }
        }
        return dynamicPrograming[m - 1][n - 1];
    }

    static int uniquePaths(int m, int n) {
        if (m == 1 || n == 1) return 1;

        int moveRight = uniquePaths(m, n - 1);
        int moveDown = uniquePaths(m - 1, n);

        return moveDown + moveRight;
    }
}
