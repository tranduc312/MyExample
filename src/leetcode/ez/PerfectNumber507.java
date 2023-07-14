package leetcode.ez;

public class PerfectNumber507 {

    public static void main(String[] args) {
        System.out.println(checkPerfectNumber(28));
        System.out.println(checkPerfectNumber(7));
        System.out.println(checkPerfectNumber(99999997));
    }

    static boolean checkPerfectNumber(int num) {
        if (num == 1) return false;
        int sum = 1;
        for (int i = 2; i <= Math.sqrt(num); ++i) {
            if (num % i == 0) {
                sum += i + num/i;
            }
        }

        return num == sum;
    }
}
