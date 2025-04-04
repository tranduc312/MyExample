package leetcode.medium;

public class MinimizeXOR2429 {

    public static void main(String[] args) {
//        System.out.println(minimizeXor(3, 5));
//        System.out.println(minimizeXor(1, 12));
//        System.out.println(minimizeXor(31, 31));
        System.out.println(minimizeXor(79, 74));
    }

    static int minimizeXor(int num1, int num2) {
        int minimal = Integer.MAX_VALUE;
        int ans = 0;
        for (int i = 0; i <= 1000000000; i++) {
            if (isEqualSetBit(i, num2) && (i ^ num1) < minimal) {
                minimal = (i ^ num1);
                ans = i;
            }
        }
        return ans;
    }

    static boolean isEqualSetBit(int num1, int num2) {
        return Integer.bitCount(num1) == Integer.bitCount(num2);
    }
}
