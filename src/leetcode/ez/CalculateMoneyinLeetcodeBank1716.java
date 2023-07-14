package leetcode.ez;

public class CalculateMoneyinLeetcodeBank1716 {

    public static void main(String[] args) {
        /*Input: n = 10
        Output: 37
        Explanation: After the 10th day, the total is (1 + 2 + 3 + 4 + 5 + 6 + 7) + (2 + 3 + 4) = 37. Notice that on the 2nd Monday, Hercy only puts in $2.*/
//        System.out.println(totalMoney(7));
        System.out.println(totalMoney(10));
    }

    static int totalMoney(int n) {
        int rs = 0;
        int start = 1;
        int week = n / 7;
        int day = n % 7;
        while (week > 0 || day > 0) {
            int len = 7;
            if (week == 0) {
                len = day;
                day = 0;
            }
            for (int i = 0; i < len; i++) {
                rs += start + i;
            }
            week--;
            start++;
        }
        return rs;
    }
}
