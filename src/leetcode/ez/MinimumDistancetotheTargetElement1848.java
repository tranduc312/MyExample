package leetcode.ez;

public class MinimumDistancetotheTargetElement1848 {

    public static void main(String[] args) {
        System.out.println(getMinDistance(new int[]{1,2,3,4,5}, 5, 3));
        System.out.println(getMinDistance(new int[]{1}, 1, 0));
        System.out.println(getMinDistance(new int[]{1,1,1,1,1,1,1,1,1,1}, 1, 0));
        System.out.println(getMinDistance(new int[]{1,1,1,1,1,1,1,1,1,1}, 1, 9));
    }

    static int getMinDistance(int[] nums, int target, int start) {
        int rs = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                rs = Math.min(rs , Math.abs(i - start));
            }
        }
        return rs;
    }
}
