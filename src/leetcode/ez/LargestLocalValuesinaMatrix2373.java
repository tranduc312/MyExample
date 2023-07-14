package leetcode.ez;

public class LargestLocalValuesinaMatrix2373 {

    public static void main(String[] args) {
//        Collections
//        Collection
//        System.out.println(Arrays.deepToString(largestLocal(new int[][]{{9,9,8,1},{5,6,2,6},{8,2,6,4},{6,2,2,2}})));
//        System.out.println(Arrays.deepToString(largestLocal(new int[][]{{1,1,1,1,1},{1,1,1,1,1},{1,1,2,1,1},{1,1,1,1,1},{1,1,1,1,1}})));
        StringBuilder sb1 = new StringBuilder("abc");
        StringBuilder sb2 = new StringBuilder("abc1");
        System.out.println("sb1.equals(sb2)" + sb1.equals(sb2));
        System.out.println(sb1.compareTo(sb2) == 0);
    }

    static int[][] largestLocal(int[][] grid) {
        int len = grid.length;
        int[][] rs = new int[len- 2][len - 2];

        int value = Integer.MIN_VALUE;

        for (int i = 0; i < len - 2; i++) {
            for (int j = 0; j < len - 2; j++) {
                rs[i][j] = findLargest(grid, i, j);
            }
        }
        return rs;
    }

    static int findLargest(int[][] array, int i, int j) {
        int rs = 0;
        for (int k = i; k < i + 3; k++) {
            for (int t = j; t < j + 3; t++) {
                rs = Math.max(rs, array[k][t]);
            }
        }
        return rs;
    }
}
