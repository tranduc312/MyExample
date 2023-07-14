package leetcode.ez;

public class CountOddNumbersinanIntervalRange1523 {

    public static void main(String[] args) {
        System.out.println(countOdds(3, 7));
        System.out.println(countOdds(8, 10));
    }

    static int countOdds(int low, int high) {
        int rs = (low % 2 != 0 && high % 2 != 0) ? 1 : 0;
        int range = high - low + 1;


        return range / 2 + rs;
    }
}
