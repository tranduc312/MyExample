package leetcode.ez;

public class MaximumAscendingSubarraySum1800 {

    public static void main(String[] args) {
        /*Input: nums = [10,20,30,5,10,50]
        Output: 65*/
        System.out.println(maxAscendingSum(new int[]{10,20,30,5,10,50}));
        System.out.println(maxAscendingSum(new int[]{10,20,30,40,50}));
        System.out.println(maxAscendingSum(new int[]{12,17,15,13,10,11,12}));
        System.out.println(maxAscendingSum(new int[]{3,6,10,1,8,9,9,8,9}));
    }

    static int maxAscendingSum(int[] nums) {
        int rs = 0;
        int maxTemp = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                maxTemp += nums[i + 1];
            } else {
                if (maxTemp > rs)
                    rs = maxTemp;
                maxTemp = nums[i + 1];
            }
        }
        return rs > maxTemp ? rs : maxTemp;
    }
}
