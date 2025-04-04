package leetcode.medium;

public class MaximumAbsoluteSumOfAnySubArray1749 {

    public static void main(String[] args) {
        System.out.println(maxAbsoluteSum3(new int[]{1,-3,2,3,-4}));
        System.out.println(maxAbsoluteSum3(new int[]{2,-5,1,-4,3,-2}));
    }


    static int maxAbsoluteSum3(int[] arr) {
        int maxSum = arr[0];
        int currentSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }


    static int maxAbsoluteSum2(int[] nums) {
        int min = 0;
        int max = 0;
        int sum = 0;
        int ans = 0;
        int n = nums.length;
        for (int i = 0; i < n; ++i) {
            sum += nums[i];
            ans = Math.max(ans, Math.max(Math.abs(sum - min), Math.abs(sum - max)));
            min = Math.min(min, sum);
            max = Math.max(max, sum);
        }
        return ans;
    }

    static int maxAbsoluteSum(int[] nums) {
        int maxEndingHere = nums[0];
        int minEndingHere = nums[0];
        int maxSoFar = nums[0];
        int minSoFar = nums[0];

        int startMax = 0, endMax = 0, startMin = 0, endMin = 0;
        int tempStartMax = 0, tempStartMin = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (maxEndingHere + nums[i] > nums[i]) {
                maxEndingHere += nums[i];
            } else {
                maxEndingHere = nums[i];
                tempStartMax = i;
            }

            if (minEndingHere + nums[i] < nums[i]) {
                minEndingHere += nums[i];
            } else {
                minEndingHere = nums[i];
                tempStartMin = i;
            }

            if (maxEndingHere > maxSoFar) {
                maxSoFar = maxEndingHere;
                startMax = tempStartMax;
                endMax = i;
            }

            if (minEndingHere < minSoFar) {
                minSoFar = minEndingHere;
                startMin = tempStartMin;
                endMin = i;
            }
        }
        if (Math.abs(maxSoFar) >= Math.abs(minSoFar)) {
            return getValueSubArray(nums, startMax, endMax);
        } else {
            return getValueSubArray(nums, startMin, endMin);
        }
    }

    static int getValueSubArray(int[] nums, int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; ++i) {
            sum += nums[i];
        }
        return Math.abs(sum);
    }
}

