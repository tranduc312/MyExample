package leetcode.medium;

public class NextPermutation31 {

    public static void main(String[] args) {
//        permutes(java.util.Arrays.asList(1,2,3), 0);
//        permute(java.util.Arrays.asList(3,2,1), 0);
//        permute(java.util.Arrays.asList(1,1,5), 0);
//        nextPermutation(new int[]{1,2,3});
        nextPermutation(new int[]{3,2,1});
//        nextPermutation(new int[]{1,1,5});
    }

    static void nextPermutation(int[] nums) {
        if (nums == null || nums.length <= 1) return;

        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) i--;

        if (i >= 0) {
            int j = nums.length - 1;
            while (nums[j] <= nums[i]) j--;
            swap(nums, i, j);
        }

        reverse(nums, i + 1, nums.length - 1);
    }

    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    static void reverse(int[] nums, int i, int j) {
        while (i < j)
            swap(nums, i++, j--);
    }
}
