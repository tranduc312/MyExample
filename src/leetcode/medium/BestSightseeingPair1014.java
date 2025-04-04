package leetcode.medium;

public class BestSightseeingPair1014 {

    public static void main(String[] args) {
        System.out.println(maxScoreSightseeingPair(new int[]{8, 1, 5, 2, 6}));
        System.out.println(maxScoreSightseeingPair(new int[]{1,2}));
    }

    static int maxScoreSightseeingPair(int[] values) {
        int max = -1;
        int cur = values[0];
        for (int i = 1; i < values.length; i++) {
            max = Math.max(max, cur + values[i] - i);
            cur = Math.max(cur, values[i] + i);
        }
        return max;
    }
}
