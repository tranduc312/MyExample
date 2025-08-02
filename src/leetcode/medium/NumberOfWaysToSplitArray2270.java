package leetcode.medium;

public class NumberOfWaysToSplitArray2270 {

    public static void main(String[] args) {
        System.out.println(waysToSplitArray(new int[]{10,4,-8,7}));
        System.out.println(waysToSplitArray(new int[]{2,3,1,0}));
        System.out.println(waysToSplitArray(new int[]{0,0}));
    }

    static int waysToSplitArray(int[] nums) {
        int rs = 0;
        int sumArray = 0;
        for (int num : nums) {
            sumArray += num;
        }
        int curSum = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            curSum += nums[i];
            int sumRight = sumArray - curSum;
            if (curSum >= sumRight) {
                rs++;
            }
        }
        return rs;
    }

    static int sum(int[] array, int start, int end) {
        int sum = 0;
        for (; start < end; start++) {
            sum += array[start];
        }
        return sum;
    }

}
