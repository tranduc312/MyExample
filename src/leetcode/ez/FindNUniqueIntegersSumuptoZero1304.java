package leetcode.ez;

public class FindNUniqueIntegersSumuptoZero1304 {

    public static void main(String[] args) {
        System.out.println(sumZero(7));
        System.out.println(sumZero(4));
        System.out.println(sumZero(5));
        System.out.println(sumZero(3));
        System.out.println(sumZero(1));
    }

    static int[] sumZero(int n) {
        if (n  == 1) return new int[]{0};
        int[] rs = new int[n];
        for (int i = 1; i < n; i += 1) {
            rs[i - 1] = i;
            rs [i] = -i;
        }
        return rs;
    }
}
