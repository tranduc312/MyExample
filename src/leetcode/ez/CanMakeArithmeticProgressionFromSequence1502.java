package leetcode.ez;

public class CanMakeArithmeticProgressionFromSequence1502 {

    public static void main(String[] args) {
        /*Input: arr = [3,5,1]
        Output: true*/
        System.out.println(canMakeArithmeticProgression(new int[]{3, 5, 1}));
        System.out.println(canMakeArithmeticProgression(new int[]{1, 2, 4}));
    }

    static boolean canMakeArithmeticProgression(int[] arr) {
        int len = arr.length;
        int rearranged = Math.abs(arr[len - 1] - arr[len - 2]);
        for (int i = arr.length - 2; i > 0; i--) {
            if (Math.abs(arr[i] - arr[i - 1]) != rearranged) return false;
        }
        return true;
    }
}
