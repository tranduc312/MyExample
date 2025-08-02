package leetcode.medium;

public class CountTotalNumberOfColoredCells2579 {
    public static void main(String[] args) {
        System.out.println(coloredCells2(1));
        System.out.println(coloredCells2(2));
        System.out.println(coloredCells2(3));
        System.out.println(coloredCells2(4));
    }

    static long coloredCells2(int n) {
        return 1 + (long) 2 * n * (n -1);
    }

    static long coloredCells(int n) {
        long add = 0;
        long ans = 1;
        for (int i = 0; i < n; i++) {
            ans += add;
            add += 4;
        }
        return ans;
    }
}
