package leetcode.ez;

public class MonotonicArray896 {

    public static void main(String[] args) {
//        [1,2,2,3]
//        [6,5,4,4]
        System.out.println(isMonotonic(new int[]{1,2,2,3}));
        System.out.println(isMonotonic(new int[]{6,5,4,4}));
        System.out.println(isMonotonic(new int[]{1,3,2}));
    }

    static boolean isMonotonic(int[] nums) {

        return isAsc(nums) || isDesc(nums) ;
    }

    static boolean isAsc(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return false;
            }
        }
        return true;
    }

    static boolean isDesc(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                return false;
            }
        }
        return true;

    }
}
