package leetcode.medium;

import java.util.Arrays;
import java.util.LinkedList;

public class MergeIntervals56 {


    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(merge(new int[][]{{1,3},{2,6},{8,10},{15,18}})));
        System.out.println(Arrays.deepToString(merge(new int[][]{{1,4},{4,5}})));
        System.out.println(Arrays.deepToString(merge(new int[][]{{1,4},{0,4}})));
        System.out.println(Arrays.deepToString(merge(new int[][]{{1,4},{0,0}})));
    }

    static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        LinkedList<int[]> linkedList = new LinkedList<>();
        for (int[] interval : intervals) {
            if (linkedList.isEmpty() || linkedList.getLast()[1] < interval[0]) {
                linkedList.add(interval);
            } else {
                linkedList.getLast()[1] = Math.max(linkedList.getLast()[1], interval[1]);
            }
        }
        return linkedList.toArray(new int[linkedList.size()][]);
    }
}
