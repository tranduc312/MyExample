package leetcode.ez;

public class XOROperationinanArray1486 {

    public static void main(String[] args) {
        /*Input: n = 5, start = 0
        Output: 8
        Explanation: Array nums is equal to [0, 2, 4, 6, 8] where (0 ^ 2 ^ 4 ^ 6 ^ 8) = 8.
        Where "^" corresponds to bitwise XOR operator.*/
        System.out.println(xorOperation(5, 0));
        System.out.println(xorOperation(4, 3));
    }

    static int xorOperation(int n, int start) {
        int rs = start;
        for (int i = 1; i < n; i++) {
            rs ^= (start + 2 * i);
        }
        return rs;
    }
}
