package leetcode.ez;

import java.util.PriorityQueue;

public class MaximizeSumOfArrayAfterKNegations1005 {

    public static void main(String[] args) {
//        Input: nums = [4,2,3], k = 1
//        Output: 5
//        Input: nums = [3,-1,0,2], k = 3
//        Output: 6
//        -4, -3, -1, 2, 5 : 2
//        -4, -3, -1, 2, 5 : 2
//        Output: 13
        System.out.println(largestSumAfterKNegations(new int[]{4,2,3}, 1));
//        System.out.println(largestSumAfterKNegations(new int[]{2,-3,-1,5,-4}, 2));
//        System.out.println(largestSumAfterKNegations(new int[]{3,-1,0,2}, 3));
//        [5,6,9,-3,3] 2
//        System.out.println(largestSumAfterKNegations(new int[]{5,6,9,-3,3}, 2));
    }

    static int largestSumAfterKNegations(int[] A, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int x: A) pq.add(x);
        while( K--  > 0) pq.add(-pq.poll());

        int sum  = 0;
        for(int i = 0; i < A.length; i++){
            sum += pq.poll();
        }
        return sum;
    }
}
