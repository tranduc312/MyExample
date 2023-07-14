package leetcode.ez;

public class LargestOddNumberinString1903 {

    public static void main(String[] args) {
        /*Input: num = "35427"
        Output: "35427"*/
//        10^5
        System.out.println(largestOddNumber("52"));
        System.out.println(largestOddNumber("4206"));
        System.out.println(largestOddNumber("35427"));
    }

    static String largestOddNumber(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            if (Character.getNumericValue(num.charAt(i)) % 2 != 0)
                return num.substring(0, i + 1);
        }
        return "";
    }
}
