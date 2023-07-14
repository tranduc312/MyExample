package leetcode.ez;

public class CountNegativeNumbersinaSortedMatrix1351 {

    public static void main(String[] args) {
        System.out.println(countNegativesBetter(new int[][]{{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}}));
//        System.out.println(countNegatives(new int[][]{{3, 2}, {1, 0}}));
    }

    static int countNegativesBetter(int[][] grid) {
        int rs = 0;
        for (int i = 0; i < grid.length; i++) {
            rs += negativeRow(grid[i]);
        }
        return rs;
    }

    static int negativeRow(int[] row) {
        int rs = 0;
        int l = 0;
        int r = row.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (row[m] >= 0) {
                l = m + 1;
            } else {
                rs += r - m + 1;
                r = m - 1;
            }
        }
        return rs;
    }

    static int countNegatives(int[][] grid) {
        int rs = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] < 0) rs++;
            }
        }

        return rs;
    }
}
