package leetcode.medium;

public class GridGame2017 {

    public static void main(String[] args) {
        System.out.println(gridGame(new int[][]{{2,5,4},{1,5,1}}));
        System.out.println(gridGame(new int[][]{{3,3,1},{8,5,2}}));
        System.out.println(gridGame(new int[][]{{1,3,1,15},{1,3,3,1}}));
    }

    static long gridGame(int[][] grid) {
        long firstRowSum = 0;
        for (int i : grid[0]) {
            firstRowSum += i;
        }
        long secondRowSum = 0;
        long minimumSum = Long.MAX_VALUE;
        for (int turnIndex = 0; turnIndex < grid[0].length; turnIndex++) {
            firstRowSum -= grid[0][turnIndex];
            minimumSum = Math.min(minimumSum, Math.max(firstRowSum, secondRowSum));
            secondRowSum += grid[1][turnIndex];
        }
        return minimumSum;
    }
}
