package leetcode.ez;

public class MakeArrayZerobySubtractingEqualAmounts2357 {

    public static void main(String[] args) {
        System.out.println(minimumOperations(new int[]{1,5,0,3,5}));
        System.out.println(minimumOperations(new int[]{0}));
    }

    static int minimumOperations(int[] nums) {
        int rs = 0;
        int min = Integer.MAX_VALUE - 1;
        while (true) {
            min = findMin(nums);
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] >= min)
                    nums[i] -= min;
            }
            if (min == Integer.MAX_VALUE)
                break;
            rs++;
        }
        return rs;
    }

    static int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int i : nums) {
            if (i > 0 && i < min)
                min = i;
        }
        return min;
    }
}
