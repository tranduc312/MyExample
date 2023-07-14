package leetcode.ez;

public class MinimumValuetoGetPositiveStepbyStepSum1413 {

    public static void main(String[] args) {
        System.out.println(minStartValueBetter(new int[]{-3, 2, -3, 4, 2}));
        System.out.println(minStartValueBetter(new int[]{1, 2}));
        System.out.println(minStartValueBetter(new int[]{1, -2, -3}));
        System.out.println(minStartValueBetter(new int[]{2, 3, 5, -5, -1}));
        System.out.println(minStartValueBetter(new int[]{2, 3, 4}));
    }

    static int minStartValueBetter(int[] nums) {
        int max = 1;
        int sum = 1;
        for (int i = 0; i < nums.length; i++) {
            sum -= nums[i];
            if (max < sum)
                max = sum;
        }
        return max;
    }

    static int minStartValue(int[] nums) {
        int rs = 0;
        int min = Integer.MAX_VALUE;
        for (int i : nums) {
            if (i < min) min = i;
        }
        if (min > 0) return 1;
        int startValue = 1;
        rs = findResult(nums, startValue);

        return rs;
    }

    static int findResult(int[] arr, int startValue) {
        int temp = 0;
        do {
            temp = startValue;
            for (int i = 0; i < arr.length; i++) {
                temp += arr[i];
                if (temp <= 0) {
                    startValue++;
                    break;
                }
            }
        } while (temp <= 0);
        return startValue;
    }
}
