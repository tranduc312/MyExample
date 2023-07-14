package leetcode.ez;

public class ThreeConsecutiveOdds1550 {

    public static void main(String[] args) {
        /*Input: arr = [1,2,34,3,4,5,7,23,12]
        Output: true
        Explanation: [5,7,23] are three consecutive odds.*/
        System.out.println(threeConsecutiveOdds(new int[]{2,6,4,1}));
        System.out.println(threeConsecutiveOdds(new int[]{1,2,34,3,4,5,7,23,12}));
    }

    static boolean threeConsecutiveOdds(int[] arr) {

        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] % 2 != 0 && arr[i + 1] % 2 != 0 && arr[i + 1] % 2 != 0) {
                return true;
            }
        }
        return false;
    }
}
