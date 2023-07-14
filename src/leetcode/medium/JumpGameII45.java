package leetcode.medium;

public class JumpGameII45 {

    public static void main(String[] args) {
        /*Input: nums = [2,3,1,1,4]
        Output: 2*/
        System.out.println(jump(new int[]{2,3,1,1,4})); // 2
        System.out.println(jump(new int[]{2,3,0,1,4})); // 2
        System.out.println(jump(new int[]{0})); // 0
        System.out.println(jump(new int[]{1,2})); // 1
        System.out.println(jump(new int[]{2,1})); // 1
        System.out.println(jump(new int[]{1,3,2})); //2
        System.out.println(jump(new int[]{1,2,0,1})); //2
        System.out.println(jump(new int[]{1,1,1,1,1})); //2
    }

    static int jump(int[] nums) {
        int rs = 0;
        int n = nums.length;
        int curEnd = 0;
        int curFar = 0;
        for (int i = 0; i < n - 1; i++) {
            curFar = Math.max(curFar, i + nums[i]);

            if (i == curEnd) {
                rs++;
                curEnd = curFar;
            }
        }
        return rs;
    }
}
