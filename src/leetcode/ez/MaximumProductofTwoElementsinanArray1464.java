package leetcode.ez;

public class MaximumProductofTwoElementsinanArray1464 {

    public static void main(String[] args) {
        /*Input: nums = [3,4,5,2]
        Output: 12*/
        System.out.println(maxProduct(new int[]{3, 4, 5, 2}));
        System.out.println(maxProduct(new int[]{1, 5, 4, 5}));
        System.out.println(maxProduct(new int[]{3, 7}));
    }

    static int maxProduct(int[] nums) {
        if (nums.length < 2) return 0;
        int i = 0;
        int j = 0;
        if (nums[0] > nums[1]) {
            i = nums[0];
            j = nums[1];
        } else {
            i = nums[1];
            j = nums[0];
        }
        for (int k = 2; k < nums.length; k++) {
            if (nums[k] > i) {
                j = i;
                i = nums[k];
            } else if (nums[k] > j){
                j = nums[k];
            }
        }
        return (i - 1) * (j - 1);
    }
}
