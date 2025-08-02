package leetcode.medium;

public class TargetSum494 {

    public static void main(String[] args) {
        System.out.println(findTargetSumWays(new int[]{1, 1, 1, 1, 1}, 3));
//        System.out.println(findTargetSumWays(new int[]{1}, 1));
    }

    static int findTargetSumWays(int[] nums, int target) {
        return helper(nums, target, 0, 0);
    }

    static int helper(int[] arr, int target, int index, int sum) {
        if (index >= arr.length) {
            return sum == target ? 1 : 0;
        }

        int subtract = helper(arr, target, index + 1, sum - arr[index]);
        int add = helper(arr, target, index + 1, sum + arr[index]);

        return subtract + add;
    }
}
