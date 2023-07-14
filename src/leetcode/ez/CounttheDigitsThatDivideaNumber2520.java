package leetcode.ez;

public class CounttheDigitsThatDivideaNumber2520 {

    public static void main(String[] args) {
        System.out.println(countDigits(1248));
    }

    static int countDigits(int num) {
        int rs = 0;
        String temp = String.valueOf(num);
        for (char c : temp.toCharArray()) {
            rs += num % c - '0' == 0 ? 1 : 0;
        }
        return rs;
    }
}
