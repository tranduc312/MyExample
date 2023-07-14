package leetcode.ez;

public class MinimumOperationstoMaketheArrayIncreas1827 {

    public static void main(String[] args) {
        /*[1,5,2,4,1]

        [1,5,3,4,1]
        [1,5,4,4,1]
        [1,5,5,4,1]
        [1,5,6,4,1]

        [1,5,6,5,1]
        [1,5,6,6,1]
        [1,5,6,7,1]

        [1,5,6,7,2]
        [1,5,6,7,3]
        [1,5,6,7,4]
        [1,5,6,7,5]
        [1,5,6,7,6]
        [1,5,6,7,7]
        [1,5,6,7,8]*/

        System.out.println(minOperations(new int[]{1,1,1}));
        System.out.println(minOperations(new int[]{1,5,2,4,1}));
        System.out.println(minOperations(new int[]{8}));
    }

    static int minOperations(int[] nums) {
        if (nums.length < 2) return 0;
        int rs = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] >= nums[i]) {
                int value = (nums[i - 1] - nums[i]) + 1;
                rs += value;
                nums[i] += value;
            }
        }
        return rs;
    }
}
