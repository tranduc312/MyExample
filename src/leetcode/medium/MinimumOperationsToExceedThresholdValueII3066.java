package leetcode.medium;

import java.util.PriorityQueue;

public class MinimumOperationsToExceedThresholdValueII3066 {

    public static void main(String[] args) {
        System.out.println(minOperations(new int[]{2,11,10,1,3}, 10)); // 2
        System.out.println(minOperations(new int[]{1,1,2,4,9}, 20)); // 4
        System.out.println(minOperations(new int[]{1000000000,999999999,1000000000,999999999,1000000000,999999999}, 1000000000)); // 2


        System.out.println(minOperations(new int[]{97,24,43,45,45,26}, 45)); // 2
    }

    static int minOperations(int[] nums, int k) {
        PriorityQueue<Long> queue = new PriorityQueue<>();
        for (long num : nums) {
            if (num >= k) continue;
            queue.offer(num);
        }

        int ans = 0;
        while (!queue.isEmpty()) {
            ++ans;
            long min1 = queue.poll();
            if (queue.isEmpty()) break;
            long min2 = queue.poll();
            long valueAdd = (min1 * 2) + min2;
            if (valueAdd >= k) continue;
            queue.add(valueAdd);
        }
        return ans;
    }
}

