package leetcode.medium;

public class CheckIfNumberIsASumOfPowersOfThree1780 {

    public static void main(String[] args) {
        System.out.println(checkPowersOfThree(12));
        System.out.println(checkPowersOfThree(91));
        System.out.println(checkPowersOfThree(21));
    }

    static boolean checkPowersOfThree(int n) {
        while (n > 0) {
            if (n % 3 > 1) return false;
            n /= 3;
        }

        return true;
    }
}
