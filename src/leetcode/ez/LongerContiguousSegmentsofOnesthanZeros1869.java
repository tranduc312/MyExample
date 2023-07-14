package leetcode.ez;

public class LongerContiguousSegmentsofOnesthanZeros1869 {

    public static void main(String[] args) {
        /*Input: s = "111000"
        Output: false
        Explanation:
        The longest contiguous segment of 1s has length 3: "111000"
        The longest contiguous segment of 0s has length 3: "111000"*/
        System.out.println(checkZeroOnes("1101"));
        System.out.println(checkZeroOnes("111000"));
        System.out.println(checkZeroOnes("110100010"));
    }

    static boolean checkZeroOnes(String s) {
        int maxZeros = 0;
        int maxOnes = 0;
        int one = 0;
        int zero = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                maxZeros = Math.max(maxZeros, ++zero);
                one = 0;
            } else {
                maxOnes = Math.max(maxOnes, ++one);
                zero = 0;
            }
        }
        return maxOnes > maxZeros;
    }
}
