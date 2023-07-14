package leetcode.ez;

public class NthTribonacciNumber1137 {

    public static void main(String[] args) {
        System.out.println(tribonacci(4));
        System.out.println(tribonacci(25));
    }

    static int tribonacci(int n) {
        int[] rs = new int[n + 1];
        rs[0] = 0;
        rs[1] = 1;
        rs[2] = 1;
        for (int i = 3; i <= n; i++) {
            rs[i] = rs[i - 1] + rs[i -2] + rs[i - 3];
        }

        return rs[n];
    }
}
