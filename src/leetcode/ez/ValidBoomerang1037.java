package leetcode.ez;

public class ValidBoomerang1037 {

    public static void main(String[] args) {
//        Input: points = [[1,1],[2,3],[3,2]]
//        Output: true
        System.out.println(isBoomerang(new int[][]{{1,1}, {2,3}, {3,2}}));
        int[] a = new int[]{1,1};
        int[] b = new int[]{1,1};
    }

    static boolean isBoomerang(int[][] points) {
        boolean rs = false;
        int x1 = points[0][0];
        int x2 = points[1][0];
        int x3 = points[2][0];
        int y1 = points[0][1];
        int y2 = points[1][1];
        int y3 = points[2][1];
        // distinct
        rs = x1 != x2 && x1 != x3 && y1 != y2 && y1 != y3;
        // straight line
        return rs;
    }
}
