package leetcode.ez;

public class CountNumberofPairsWithAbsoluteDifferenceK2006 {

    public static void main(String[] args) {
        /*Input: nums = [3,2,1,5,4], k = 2
        Output: 3
        Explanation: The pairs with an absolute difference of 2 are:
        - [3,2,1,5,4]
        - [3,2,1,5,4]
        - [3,2,1,5,4]*/
        System.out.println(countKDifference(new int[]{1,2,2,1}, 1));
        System.out.println(countKDifference(new int[]{1,3}, 3));
        System.out.println(countKDifference(new int[]{3,2,1,5,4}, 2));
    }

    static int countKDifference(int[] nums, int k) {
        int rs = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (i != j && Math.abs(nums[i] - nums[j]) == k)
                    rs++;
            }
        }
        return rs;
    }
}
