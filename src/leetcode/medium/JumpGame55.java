package leetcode.medium;

import java.util.Stack;

public class JumpGame55 {

    public static void main(String[] args) {
        System.out.println(canJump(new int[]{2,3,1,1,4})); // true
        System.out.println(canJump(new int[]{3,2,1,0,4})); // false
        System.out.println(canJump(new int[]{0})); // true
        System.out.println(canJump(new int[]{0,2,3})); // false
        System.out.println(canJump(new int[]{1,0,1,0})); // false
        System.out.println(canJump(new int[]{3,0,8,2,0,0,1})); // true
        Stack stack = new Stack();
    }

    static boolean canJump(int[] nums) {
        int reachable = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > reachable) return false;
            reachable = Math.max(reachable, nums[i] + i);
        }
        return true;
    }
}
