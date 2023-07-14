package leetcode.ez;

public class SumofDigitsinBaseK1837 {

    public static void main(String[] args) {
        System.out.println(sumBase(34,6));
        System.out.println(sumBase(10,10));
    }

    static int sumBase(int n, int k) {
        int rs = 0;
        String s = Integer.toString(n, k);
        for (int i = 0; i < s.length(); i++) {
            rs += s.charAt(i) - '0';
        }
        return rs;
    }
}
