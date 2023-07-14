package leetcode.ez;

public class ArrangingCoins441 {

    public static void main(String[] args) {
        System.out.println(arrangeCoins(5));
        System.out.println(arrangeCoins(8));
        System.out.println(arrangeCoins(1));
        System.out.println(arrangeCoins(3));
    }

    static int arrangeCoins(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int i = 1;
        int rs = 0;
        while (n - i >= 0) {
            n = n - i;
            i += 1;
            rs++;
        }
        return rs;
    }
}
