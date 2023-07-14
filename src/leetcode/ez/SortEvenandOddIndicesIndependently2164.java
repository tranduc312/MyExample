package leetcode.ez;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortEvenandOddIndicesIndependently2164 {

    public static void main(String[] args) {
        /*Input: nums = [4,1,2,3]
        Output: [2,3,4,1]*/
        System.out.println(Arrays.toString(sortEvenOdd(new int[]{4,1,2,3})));
        System.out.println(Arrays.toString(sortEvenOdd(new int[]{2,1})));
    }

    static int[] sortEvenOdd(int[] nums) {
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        for (int num : nums) {
            if (num % 2 == 0) even.add(num);
            else odd.add(num);
        }
        Collections.sort(even);
        Collections.sort(odd);
        Collections.reverse(odd);
        int indexOdd = 0;
        int indexEven = 0;
        for (int i = 0; i < nums.length; i++) {
            if (even.contains(nums[i])) nums[i] = even.get(indexOdd++);
            else nums[i] = odd.get(indexEven++);
        }
        return nums;
    }
}
