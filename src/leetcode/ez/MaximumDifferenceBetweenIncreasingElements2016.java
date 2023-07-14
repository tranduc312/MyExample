package leetcode.ez;

public class MaximumDifferenceBetweenIncreasingElements2016 {

    public static void main(String[] args) {
        /*Input: nums = [7,1,5,4]
        Output: 4*/
        System.out.println(maximumDifference(new int[]{7,1,5,4}));
        System.out.println(maximumDifference(new int[]{9,4,3,2}));
        System.out.println(maximumDifference(new int[]{1,5,2,10}));
    }

    static int maximumDifference(int[] nums) {
        int rs = 0;
        int first = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            first = Math.min(first, nums[i]);
            if (nums[i] < nums[i + 1]) {
                rs = Math.max(rs, nums[i + 1] - first);
            }
        }
        return rs != 0 ? rs : -1;
    }
}
