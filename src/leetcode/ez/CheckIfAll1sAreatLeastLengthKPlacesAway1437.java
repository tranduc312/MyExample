package leetcode.ez;

public class CheckIfAll1sAreatLeastLengthKPlacesAway1437 {

    public static void main(String[] args) {
        /*Input: nums = [1,0,0,0,1,0,0,1], k = 2
        Output: true*/
        System.out.println(kLengthApart(new int[]{1, 0, 0, 0, 1, 0, 0, 1}, 2));
        System.out.println(kLengthApart(new int[]{1, 0, 0, 1, 0, 1}, 2));;
        System.out.println(kLengthApart(new int[]{0,1,0,1}, 1));
    }

    static boolean kLengthApart(int[] nums, int k) {
        int place = -1;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                index = i;
                break;
            }
        }
        for (int i = index; i < nums.length; i++) {
            if (nums[i] == 1) {
                if (place != -1 && place < k) {
                    return false;
                }
                place = 0;
            } else {
                place++;
            }
        }
        return true;
    }
}
