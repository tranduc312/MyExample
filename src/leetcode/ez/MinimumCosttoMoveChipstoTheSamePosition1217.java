package leetcode.ez;

public class MinimumCosttoMoveChipstoTheSamePosition1217 {

    public static void main(String[] args) {
        System.out.println(minCostToMoveChips(new int[]{1,2,3}));
        System.out.println(minCostToMoveChips(new int[]{2,2,2,3,3}));
        System.out.println(minCostToMoveChips(new int[]{1,1000000000}));
    }

    static int minCostToMoveChips(int[] position) {
        int even_cnt = 0;
        int odd_cnt = 0;
        for (int i : position) {
            if (i % 2 == 0) {
                even_cnt++;
            } else {
                odd_cnt++;
            }
        }
        return Math.min(odd_cnt, even_cnt);
    }
}
