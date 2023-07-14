package leetcode.ez;

public class RichestCustomerWealth1672 {

    public static void main(String[] args) {
        System.out.println(maximumWealth(new int[][]{{1, 2, 3}, {3, 2, 1}}));
        System.out.println(maximumWealth(new int[][]{{1, 5}, {7, 3}, {3, 5}}));
        System.out.println(maximumWealth(new int[][]{{2, 8, 7}, {7, 1, 3}, {1, 9, 5}}));
    }

    static int maximumWealth(int[][] accounts) {
        int rs = 0;
        for (int[] account : accounts) {
            int value = 0;
            for (int i : account) {
                value += i;
            }
            if (value > rs) rs = value;
        }

        return rs;
    }
}

