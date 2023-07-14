package leetcode.ez;

public class CountSpecialQuadruplets1995 {

    public static void main(String[] args) {
        /*Input: nums = [1,1,1,3,5]
        Output: 4
        Explanation: The 4 quadruplets that satisfy the requirement are:
        - (0, 1, 2, 3): 1 + 1 + 1 == 3
        - (0, 1, 3, 4): 1 + 1 + 3 == 5
        - (0, 2, 3, 4): 1 + 1 + 3 == 5
        - (1, 2, 3, 4): 1 + 1 + 3 == 5*/
        System.out.println(countQuadruplets(new int[]{1,2,3,6}));
        System.out.println(countQuadruplets(new int[]{3,3,6,4,5}));
        System.out.println(countQuadruplets(new int[]{1,1,1,3,5}));
    }

    static int countQuadruplets(int[] nums) {
        int rs = 0;
        int len = nums.length;
        for (int i = 0; i < len - 3; i++) {
            for (int j = i + 1; j < len - 2; j++) {
                for (int k = j + 1; k < len - 1; k++) {
                    for (int m = k + 1; m < len; m++) {
                        if (nums[i] + nums[j] + nums[k] == nums[m]) {
                            rs++;
                        }
                    }
                }
            }
        }
        return rs;
    }
}
