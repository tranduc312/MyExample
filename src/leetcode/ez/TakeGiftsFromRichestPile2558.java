package leetcode.ez;

import java.util.PriorityQueue;
import java.util.Queue;

public class TakeGiftsFromRichestPile2558 {

    public static void main(String[] args) {
        System.out.println(pickGifts(new int[]{25,64,9,4,100}, 4));
    }

    static long pickGifts(int[] gifts, int k) {
        Queue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        long numGifts = 0;
        for (int gift : gifts) {
            maxHeap.add(gift);
            numGifts += gift;
        }
        for (int i = 0; i < k; i++) {
            int num = maxHeap.poll();
            int rem = (int) Math.sqrt(num);
            numGifts -= num - rem;
            maxHeap.add(rem);
        }

        return numGifts;
    }
}
