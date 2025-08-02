package leetcode.medium;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class MaxSumOfAPairWithEqualSumofDigits2342 {

    public static void main(String[] args) {
        System.out.println(maximumSum(new int[]{18,43,36,13,7}));
//        System.out.println(maximumSum(new int[]{10,12,19,14}));
    }

    static int maximumSum(int[] nums) {
        int max = -1;
        Map<Integer, PriorityQueue<Integer>> map = new HashMap<>();
        for (int num : nums) {
            int val = num;
            int sum = 0;
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }
            PriorityQueue<Integer> queue = map.getOrDefault(sum, new PriorityQueue<>((a, b) -> (b - a)));
            queue.offer(val);
            map.put(sum, queue);
        }

        for (Map.Entry<Integer, PriorityQueue<Integer>> entry : map.entrySet()) {
            int sum = 0;
            PriorityQueue<Integer> val = entry.getValue();
            if (val.size() < 2) continue;
            sum = val.poll() + val.poll();
            max = Math.max(max, sum);
        }
        return max;
    }
}
