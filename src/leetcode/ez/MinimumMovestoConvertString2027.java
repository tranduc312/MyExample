package leetcode.ez;

public class MinimumMovestoConvertString2027 {

    public static void main(String[] args) {
        /*Input: s = "XXOX"
        Output: 2
        Explanation: XXOX -> OOOX -> OOOO*/
        System.out.println(minimumMoves("XXX"));
        System.out.println(minimumMoves("XXOX"));
        System.out.println(minimumMoves("OOOO"));
        System.out.println(minimumMoves("OXOX"));
    }

    static int minimumMoves(String s) {
        int rs = 0;
        int index = 0;
        while (index < s.length()) {
            if (s.charAt(index) == 'X') {
                index += 3;
                rs++;
            } else {
                index++;
            }
        }

        return rs;
    }
}
