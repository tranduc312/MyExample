package leetcode.ez;

public class FindthePivotInteger2485 {

    public static void main(String[] args) {
        System.out.println(pivotInteger(8));
        System.out.println(pivotInteger(1));
        System.out.println(pivotInteger(4));
    }

    static int pivotInteger(int n) {
        if (n == 1) return n;
        for (int i = n - 1; i > 0; i--) {
            int left = 0;
            int right = 0;
            for (int j = 1; j <= i; j++) {
                left += j;
            }
            for (int k = i; k <= n; k++) {
                right += k;
            }
            if (left == right)
                return i;
        }
        return -1;
    }
}
