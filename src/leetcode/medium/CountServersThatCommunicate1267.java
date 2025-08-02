package leetcode.medium;

public class CountServersThatCommunicate1267 {

    public static void main(String[] args) {
//        System.out.println(countServers(new int[][]{{1,0},{0,1}}));
        System.out.println(countServers2(new int[][]{{1,0},{1,1}}));
        System.out.println(countServers2(new int[][]{{1,1,0,0},{0,0,1,0},{0,0,1,0},{0,0,0,1}}));
    }

    static int countServers2(int[][] grid) {
        if (grid == null || grid.length == 0) return 0;
        int rowLength = grid.length;
        int colLength = grid[0].length;
        int rs = 0;
        for (int row = 0; row < rowLength; row++) {
            for (int col = 0; col < colLength; col++) {
                if (grid[row][col] == 1) {
                    boolean canCommunicate = false;
                    // other colum
                    for (int otherCol = 0; otherCol < colLength; otherCol++) {
                        if (otherCol != col && grid[row][otherCol] == 1) {
                            canCommunicate = true;
                            break;
                        }
                    }
                    if (canCommunicate) {
                        rs++;
                    } else {
                        // other row
                        for (int otherRow = 0; otherRow < rowLength; otherRow++) {
                            if (otherRow != row && grid[otherRow][col] == 1) {
                                canCommunicate = true;
                                break;
                            }
                        }

                        if (canCommunicate) {
                            rs++;
                        }
                    }
                }
            }
        }
        return rs;
    }

    static int countServers(int[][] grid) {
        if (grid == null || grid.length == 0) return 0;
        int rowLength = grid.length;
        int colLength = grid[0].length;
        int[] rowCounts = new int[grid[0].length];
        int[] colCounts = new int[grid.length];

        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < colLength; j++) {
                if (grid[i][j] == 1) {
                    rowCounts[j]++;
                    colCounts[i]++;
                }
            }
        }

        int rs = 0;

        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < colLength; j++) {
                if (grid[i][j] == 1) {
                    if (rowCounts[j] > 1 || colCounts[i] > 1) {
                        rs++;
                    }
                }
            }
        }
        return rs;
    }
}
