package leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClosestPrimeNumbersInRange2523 {

    public static void main(String[] args) {
//        System.out.println(Arrays.toString(closestPrimes(10, 19)));
//        System.out.println(Arrays.toString(closestPrimes(4, 6)));
        System.out.println(Arrays.toString(closestPrimes(1, 1000000)));
    }

    static int[] closestPrimes(int left, int right) {
        // find prime numbers
        List<Integer> primeNumbers = new ArrayList<>();
        for(int i = left == 1 ? 2 : left; i <= right; ++i) {
            if (isPrime(i)) {
                primeNumbers.add(i);
            }
        }
        int ansLeft = -1;
        int ansRight = -1;
        int min = Integer.MAX_VALUE;
        // find the minimum min
        for (int i = 0; i < primeNumbers.size() - 1; ++i) {
            int value = primeNumbers.get(i + 1) - primeNumbers.get(i);
            if (min > value) {
                min = value;
                ansLeft = primeNumbers.get(i);
                ansRight = primeNumbers.get(i + 1);
            }
        }
        return new int[]{ansLeft, ansRight};
    }

    static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); ++i) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
