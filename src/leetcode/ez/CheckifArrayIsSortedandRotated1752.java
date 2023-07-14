package leetcode.ez;

public class CheckifArrayIsSortedandRotated1752 {

    public static void main(String[] args) {
        /*Input: nums = [3,4,5,1,2]
        Output: true*/
        System.out.println(check(new int[]{3,4,5,1,2}));
        System.out.println(check(new int[]{2,1,3,4}));
        System.out.println(check(new int[]{1,2,3}));
        System.out.println(check(new int[]{2,1}));
        System.out.println(check(new int[]{1,1,1}));
    }

    static boolean check(int[] nums) {

        int checker = 0;

        for (int i = 1; i < nums.length; i++){
            if (nums[i-1] > nums[i]) checker++;
        }


        //checking if the last element is greater than the first
        if (nums[nums.length - 1] > nums[0]) checker++;

        return checker > 1 ? false : true;
    }
}
