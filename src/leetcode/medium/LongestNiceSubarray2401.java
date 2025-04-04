package leetcode.medium;

public class LongestNiceSubarray2401 {

    public static void main(String[] args) {
//        System.out.println(longestNiceSubarray(new int[]{1,3,8,48,10}));
//        System.out.println(longestNiceSubarray(new int[]{3,1,5,11,13}));
        System.out.println(longestNiceSubarray(new int[]{744437702,379056602,145555074,392756761,560864007,934981918,113312475,1090,16384,33,217313281,117883195,978927664}));
    }

    static int longestNiceSubarray(int[] nums) {
        int ans = 0;
        int temp = 0;
        int n = nums.length;
        for (int i = 0; i < n - 1; ++i) {
            int compare = nums[i] & nums[i + 1];
            if (compare == 0) {
                ++temp;
            } else {
                temp = 0;
            }
            ans = Math.max(ans, temp);
        }
        return ans == 0 ? 1 : ans;
    }

}
