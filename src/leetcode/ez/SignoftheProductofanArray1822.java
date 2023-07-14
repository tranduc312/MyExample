package leetcode.ez;

public class SignoftheProductofanArray1822 {

    public static void main(String[] args) {
        /*Input: nums = [-1,-2,-3,-4,3,2,1]
        Output: 1
        Explanation: The product of all values in the array is 144, and signFunc(144) = 1*/
        System.out.println(arraySign(new int[]{-1,-2,-3,-4,3,2,1}));
        System.out.println(arraySign(new int[]{1,5,0,2,-3}));
        System.out.println(arraySign(new int[]{-1,1,-1,1,-1}));
        System.out.println(arraySign(new int[]{7, 36, 96, 70, 85, 23, 5, 18, 4, 12, 89, 92, 9, 30, 53, 14, 96, 32,
                13, 43, 37, 60, 75, 7, 83, 68, 20, 8, -24, -80, -27, -92, -96, -20, -16, -52, -49, -38}));
        System.out.println(arraySign(new int[]{9,72,34,29,-49,-22,-77,-17,-66,-75,-44,-30,-24}));
    }

    static int arraySign(int[] nums) {
        int countNegative = 0;
        for (int num : nums) {
            if (num == 0) return 0;
            if (num < 0) countNegative++;
        }
        return countNegative % 2 == 0 ? 1 : -1;
    }
}
