package leetcode.ez;

public class CheckifAlltheIntegersinaRangeAreCovered1893 {

    public static void main(String[] args) {
        /*Input: ranges = [[1,2],[3,4],[5,6]], left = 2, right = 5
        Output: true*/
        System.out.println(isCovered(new int[][]{{1,2},{3,4},{5,6}},2,5));
            System.out.println(isCovered(new int[][]{{1,10},{10,20}},21,21));
    }

    static boolean isCovered(int[][] ranges, int left, int right) {
        boolean flag = false;
        for (int i = left; i < right; i++) {
            for (int[] range : ranges) {
                if (range[0] <= i && range[1] >= i) {
                    flag = true;
                    break;
                }
            }
            if (!flag) return false;
            flag = false;
        }

        return true;
    }
}
