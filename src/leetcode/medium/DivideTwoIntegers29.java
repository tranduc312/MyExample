package leetcode.medium;

public class DivideTwoIntegers29 {

    public static void main(String[] args) {
        System.out.println(divide(10, 3));
        System.out.println(divide(7, -3));
        System.out.println(divide(-2147483648, -1));
        System.out.println(divide(-2147483648, 1));
        System.out.println(divide(2147483647, 2));
    }

    static int divide(int dividend, int divisor) {
        int sign = 1;
        if ((dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0))
            sign = -1;
        long longDividend = Math.abs((long) dividend);
        long longDivisor= Math.abs((long) divisor);

        if (longDivisor == 0) return Integer.MAX_VALUE;
        if (longDividend == 0 || longDividend < longDivisor) return 0;

        long temp = longDividend(longDividend, longDivisor);
        if (temp > Integer.MAX_VALUE)
            return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        else
            return (int) (sign * temp);
    }

    private static long longDividend(long longDividend, long longDivisor) {
        if (longDividend < longDivisor) return 0;
        long sum = longDivisor;
        long mul = 1;
        while ((sum + sum) <= longDividend) {
            sum += sum;
            mul += mul;
        }
        return mul + longDividend(longDividend - sum, longDivisor);
    }
}
