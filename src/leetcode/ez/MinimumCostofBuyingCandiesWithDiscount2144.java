package leetcode.ez;

import java.util.Arrays;

public class MinimumCostofBuyingCandiesWithDiscount2144 {

    public static void main(String[] args) {
        /*Input: cost = [6,5,7,9,2,2]
        Output: 23*/
        System.out.println(minimumCost(new int[]{1,2,3}));
        System.out.println(minimumCost(new int[]{6,5,7,9,2,2}));
        System.out.println(minimumCost(new int[]{5,5}));
    }

    static int minimumCost(int[] cost) {
        if (cost.length <= 2) return Arrays.stream(cost).sum();
        int rs = 0;
        Arrays.sort(cost);
        int count = 0;
        for (int i = cost.length - 1; i >= 0; i--) {
            rs += cost[i];
            if (++count % 2 == 0)
                i--;
        }
        return rs;
    }
}
