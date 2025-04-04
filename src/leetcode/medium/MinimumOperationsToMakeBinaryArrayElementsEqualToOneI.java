package leetcode.medium;

public class MinimumOperationsToMakeBinaryArrayElementsEqualToOneI {

    public static void main(String[] args) {
        System.out.println(minOperations(new int[]{0,1,1,1,0,0}));
        System.out.println(minOperations(new int[]{0,1,1,1}));
    }

    static int minOperations(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for (int i = 0; i < n - 2; ++i) {
            if (nums[i] == 0) {
                nums[i] = 1;
                nums[i + 1] = 1 - nums[i + 1];
                nums[i + 2] = 1 - nums[i + 2];
                ++ans;
            }
        }
        if (nums[n - 2] == 0 || nums[n - 1] == 0) return -1;
        return ans;
    }
}
