package leetcode.medium;

public class ZeroArrayTransformationII3356 {

    public static void main(String[] args) {
        System.out.println(minZeroArray2(new int[]{2, 0, 2}, new int[][]{{0, 2, 1}, {0, 2, 1}, {1, 1, 3}}));
//        System.out.println(minZeroArray(new int[]{4, 3, 2, 1}, new int[][]{{1, 3, 2}, {0, 2, 1}}));
    }

    static int minZeroArray2(int[] nums, int[][] queries) {
        int left = 0;
        int right = queries.length;
        if (!currentIndexZero(nums, queries, right)) return -1;

        // bs
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (currentIndexZero(nums, queries, middle)) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return left;
    }

    static boolean currentIndexZero(int[] nums, int[][] queries, int k) {
        int n = nums.length;
        int sum = 0;
        int[] arr = new int[n + 1];
        for (int i = 0; i < k; ++i) {
            int left = queries[i][0];
            int right = queries[i][1];
            int val = queries[i][2];

            arr[left] += val;
            arr[right + 1] -= val;
        }

        for (int i = 0; i < n; ++i) {
            sum += arr[i];
            if (sum < nums[i]) return false;
        }
        return true;
    }

    static int minZeroArray(int[] nums, int[][] queries) {
        if (isZeroArray(nums)) return 0;
        int ans = 0;
        for (int i = 0; i < queries.length; ++i) {
            for (int j = queries[i][0]; j <= queries[i][1]; ++j) {
                nums[j] -= queries[i][2];
            }
            ++ans;
            if (isZeroArray(nums)) {
                return ans;
            }
        }
        return -1;
    }

    static boolean isZeroArray(int[] nums) {
        for (int num : nums) {
            if (num > 0) {
                return false;
            }
        }
        return true;
    }
}
