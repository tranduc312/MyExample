package leetcode.ez;

public class FindtheArrayConcatenationValue2562 {

    public static void main(String[] args) {
        System.out.println(findTheArrayConcVal(new int[]{7,52,2,4}));
        System.out.println(findTheArrayConcVal(new int[]{5,14,13,8,12}));
    }

    static long findTheArrayConcVal(int[] nums) {
        long rs = 0;
        int mid = 0;
        if (nums.length % 2 != 0) {
            rs += nums[nums.length / 2];
        }
        for (int i = 0, j = nums.length - 1; i < nums.length / 2; i++, j--) {
            int len =(int) Math.pow(10, (int) (Math.log10(nums[j]) + 1));
            rs += nums[i] * len + nums[j];
        }
        return rs;
    }

}
