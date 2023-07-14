package leetcode.ez;

public class ZigzagConversion6 {

    public static void main(String[] args) {

    }

    static String convert(String s, int numRows) {
        if (s.length() == 1) return s;
        String[][] array = new String[1001][numRows];
        int space = numRows - 2;
        int countSpace = 0;
        for (char c : s.toCharArray()) {
            String temp = String.valueOf(c);
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[0].length; j++) {
                    if (space != countSpace) continue;
                    array[j][i] = temp;
                    countSpace = 0;
                }
                countSpace++;
            }
        }
        return ""; // TODO
    }
}
