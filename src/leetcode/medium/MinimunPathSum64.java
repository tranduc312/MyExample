package leetcode.medium;

public class MinimunPathSum64 {

    public static void main(String[] args) {
        System.out.println(minPathSum(new int[][]{{1,3,1},{1,5,1},{4,2,1}}));
        System.out.println(minPathSum(new int[][]{{1,2,3},{4,5,6}}));
    }

    static int minPathSum(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;

        // col
        for (int i = 1; i < row; i++) {
            grid[i][0] += grid[i - 1][0];
        }

        // row
        for (int i = 1; i < col; i++) {
            grid[0][i] += grid[0][i - 1];
        }

        // fill remain
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                grid[i][j] += Math.min(grid[i - 1][j], grid[i][j - 1]);
            }
        }
        return grid[row - 1][col - 1];
    }
}
