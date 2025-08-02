package leetcode.ez;

public class LongestStrictlyIncreasingOrStrictlyDecreasingSubarray3105 {

    public static void main(String[] args) {
        System.out.println(longestMonotonicSubarray(new int[]{1,4,3,3,2}));
        System.out.println(longestMonotonicSubarray(new int[]{3,3,3,3}));
        System.out.println(longestMonotonicSubarray(new int[]{3,2,1}));
    }

    static int longestMonotonicSubarray(int[] nums) {
        int increase = 1;
        int decrease = 1;
        int rs = 1;
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                ++increase;
                decrease = 1;
            } else if (nums[i] < nums[i + 1]) {
                ++decrease;
                increase = 1;
            } else {
                increase = 1;
                decrease = 1;
            }
            rs = Math.max(rs, Math.max(increase, decrease));
        }
        return rs;
    }

}
