package leetcode.ez;

/**
 * The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence,
 * such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
 * F(0) = 0, F(1) = 1
 * F(n) = F(n - 1) + F(n - 2), for n > 1.
 * Given n, calculate F(n).
 */
public class FibonacciNumber509 {

    public static void main(String[] args) {
//        System.out.println(fib(2));
//        System.out.println(fib(3));
//        System.out.println(fib(4));

        System.out.println(fib(1));
    }

    static int fib(int n) {
        int n1 = 0;
        int n2 = 1;
        int n3 = 0;

        for (int i = 2; i <= n; ++i) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }

        return n3;
    }
}
