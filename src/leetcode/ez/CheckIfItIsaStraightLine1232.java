package leetcode.ez;

public class CheckIfItIsaStraightLine1232 {

    public static void main(String[] args) {
        System.out.println(checkStraightLine(new int[][]{{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}}));
        System.out.println(checkStraightLine(new int[][]{{1,1},{2,2},{3,4},{4,5},{5,6},{7,7}}));
        System.out.println(checkStraightLine(new int[][]{{0,0},{0,1},{0,-1}}));
        System.out.println(checkStraightLine(new int[][]{{2,1},{4,2},{6,3}}));
    }

    static boolean checkStraightLine(int[][] coordinates) {
        int x0 = coordinates[0][0];
        int x1 = coordinates[1][0];
        int y0 = coordinates[0][1];
        int y1 = coordinates[1][1];
        int dx = x1 - x0;
        int dy = y1 - y0;
        for (int[] i : coordinates) {
            int x = i[0];
            int y = i[1];
            if (dx * (y - y1) != dy * (x - x1))
                return false;
        }
        return true;
    }
}
