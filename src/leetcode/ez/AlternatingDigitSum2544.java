package leetcode.ez;

public class AlternatingDigitSum2544 {

    public static void main(String[] args) {
//        System.out.println(alternateDigitSum(521));
//        System.out.println(alternateDigitSum(111));
//        System.out.println(alternateDigitSum(10));
//        System.out.println(alternateDigitSum(72));
//        System.out.println(alternateDigitSum(4302));
    }

    static int alternateDigitSum(int n) {
        int rs = 0;
        boolean flg = true;
        String s = String.valueOf(n);
        for (char c : s.toCharArray()) {
            int value = c - '0';
            if (value == 0) rs += value;
            else rs += flg ? value : value * -1;
            flg = !flg;
        }
        return rs;
    }
}
