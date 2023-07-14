package leetcode.ez;

public class LargestNumberAtLeastTwiceOthers747 {

    public static void main(String[] args) {
//        System.out.println(dominantIndex(new int[]{3,6,1,0}));
//        System.out.println(dominantIndex(new int[]{1,2,3,4}));
        System.out.println(dominantIndex(new int[]{0,0,0,1}));
    }

    static int dominantIndex(int[] nums) {
        int max1 = 0;
        int max2 = 0;
        int index = 0;
        if (nums[0] > nums[1]) {
            max1 = nums[0];
            max2 = nums[1];
            index = 0;
        } else {
            max1 = nums[1];
            max2 = nums[0];
            index = 1;
        }
        for (int i = 2; i < nums.length; ++i) {
            if (nums[i] > max1) {
                max2 = max1;
                max1 = nums[i];
                index = i;
            } else if (nums[i] > max2) {
                max2 = nums[i];
            }
        }
        if (max1 == 0 || max2 == 0) return -1;
        return max1 / max2 >= 2 ? index : -1;
    }
}
