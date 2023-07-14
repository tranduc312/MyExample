package leetcode.ez;

public class ConvertIntegertotheSumofTwoNoZeroIntegers1317 {

    public static void main(String[] args) {
        System.out.println(getNoZeroIntegers(2));
        System.out.println(getNoZeroIntegers(11));
        System.out.println(getNoZeroIntegers(1010));
    }

    static int[] getNoZeroIntegers(int n) {
        int[] rs = new int[2];
        rs[0] = 1;
        rs[1] = n - 1;
        while (checkContainsZero(rs[0]) || checkContainsZero(rs[1])) {
            rs[0]++;
            rs[1]--;
        }
        return rs;
    }

    static boolean checkContainsZero(int n) {
        while (n != 0) {
            if (n % 10 == 0)
                return true;
            n /= 10;
        }

        return false;
    }
}
