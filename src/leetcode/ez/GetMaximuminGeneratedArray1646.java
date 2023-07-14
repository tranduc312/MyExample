package leetcode.ez;

public class GetMaximuminGeneratedArray1646 {

    public static void main(String[] args) {
        /*Input: n = 7
        Output: 3*/
//        System.out.println(getMaximumGenerated(7));
//        System.out.println(getMaximumGenerated(2));
//        System.out.println(getMaximumGenerated(3));

        System.out.println(factorial(5));
    }

    static int factorial(int n) {
        if(n<=1) return 1;
        else return n * factorial(n-1);
    }

    static int getMaximumGenerated(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        int rs = 0;
        int[] array = new int[n + 1];
        array[0] = 0;
        array[1] = 1;
        for (int i = 1; 2 * i + 1 <= n; i++) {
            array[i * 2] = array[i];
            array[i * 2 + 1] = array[i] + array[i + 1];
            rs = Math.max(rs, array[2 * i  +1]);
        }

        return rs;
    }
}
