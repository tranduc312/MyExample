package leetcode.ez;

public class MaximumValueOfAnOrderedTripletI2873 {

    public static void main(String[] args) {
        System.out.println(maximumTripletValue2(new int[]{12,6,1,2,7}));
//        System.out.println(maximumTripletValue(new int[]{1,10,3,4,19}));
//        System.out.println(maximumTripletValue(new int[]{1,2,3}));
//        System.out.println(maximumTripletValue(new int[]{1000000,1,1000000}));
    }
    static long maximumTripletValue2(int[] nums) {
        long ans = 0;
        int dmax = 0;
        int imax = 0;
        for (int num : nums) {
            ans = Math.max(ans, (long) dmax * num);
            dmax = Math.max(dmax, imax - num);
            imax = Math.max(imax, num);
        }
        return ans;

    }

    static long maximumTripletValue(int[] nums) {
        long ans = 0;
        int n = nums.length;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                for (int k = j + 1; k < n; ++k) {
                    long tripletValue = (long) (nums[i] - nums[j]) * nums[k];
                    ans = Math.max(ans, tripletValue);
                }
            }
        }

        return ans;
    }
}
